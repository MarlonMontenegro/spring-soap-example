package sv.edu.udb.PlanetInfoSOAP.integration;

import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import sv.edu.udb.PlanetInfoSOAP.model.PlanetInfo;
import sv.edu.udb.PlanetInfoSOAP.soap.PlanetRequest;
import sv.edu.udb.PlanetInfoSOAP.soap.PlanetResponse;

@Service
public class PlanetSoapClientImpl implements PlanetSoapClient {

    private final WebServiceTemplate webServiceTemplate;

    public PlanetSoapClientImpl(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    @Override
    public PlanetInfo getPlanetInfoFromSoap(String planetName) {

        PlanetRequest request = new PlanetRequest();
        request.setName(planetName);

        PlanetResponse response = (PlanetResponse)
                webServiceTemplate.marshalSendAndReceive(request);

        PlanetInfo info = new PlanetInfo();
        info.setName(response.getName());
        info.setDiameter(response.getDiameter());
        info.setDistanceFromSun(response.getDistanceFromSun());
        info.setOrbitalPeriod(response.getOrbitalPeriod());
        info.setTemperature(response.getTemperature());
        info.setDescription(response.getDescription());

        return info;
    }
}
