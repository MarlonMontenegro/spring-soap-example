package sv.edu.udb.PlanetInfoSOAP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sv.edu.udb.PlanetInfoSOAP.integration.PlanetInfoGateway;
import sv.edu.udb.PlanetInfoSOAP.model.PlanetInfo;

@RestController
public class PlanetController {

    private final PlanetInfoGateway planetGateway;

    public PlanetController(PlanetInfoGateway planetGateway) {
        this.planetGateway = planetGateway;
    }

    @GetMapping("/planet")
    public PlanetInfo getPlanetInfo(
            @RequestParam(name = "name", required = false, defaultValue = "Mercurio") String name) {

        // Si no mandan ?name=..., se usa "Mercurio" por defecto
        return planetGateway.getPlanetInfo(name);
    }
}