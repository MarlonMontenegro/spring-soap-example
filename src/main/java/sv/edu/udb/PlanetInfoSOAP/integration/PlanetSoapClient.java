package sv.edu.udb.PlanetInfoSOAP.integration;


import sv.edu.udb.PlanetInfoSOAP.model.PlanetInfo;

/**
 * Cliente responsable de obtener la información de un planeta
 * desde un servicio web SOAP.
 */
public interface PlanetSoapClient {

    PlanetInfo getPlanetInfoFromSoap(String planetName);

}
