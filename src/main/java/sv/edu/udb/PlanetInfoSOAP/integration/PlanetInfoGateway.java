package sv.edu.udb.PlanetInfoSOAP.integration;


import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import sv.edu.udb.PlanetInfoSOAP.model.PlanetInfo;


@MessagingGateway
public interface PlanetInfoGateway {

    /**
     * Método para solicitar información de un planeta.
     * Spring Integration se encargará de enrutar esta llamada
     * hacia el flujo que luego hablaremos con SOAP.
     */

    @Gateway(requestChannel = "planetRequestChannel")
    PlanetInfo getPlanetInfo(String planetName);




}
