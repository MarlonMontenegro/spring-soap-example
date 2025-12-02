package sv.edu.udb.PlanetInfoSOAP.soap;

import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class PlanetInfoEndpoint {

    private static final String NAMESPACE_URI = "http://udb.edu.sv/planetinfo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PlanetRequest")
    @ResponsePayload
    public PlanetResponse getPlanetInfo(@RequestPayload PlanetRequest request) {

        String name = request.getName();

        PlanetResponse response = new PlanetResponse();

        switch (name.toLowerCase()) {

            case "tierra":
                response.setName("Tierra");
                response.setDiameter(12742);
                response.setDistanceFromSun(149.6);
                response.setOrbitalPeriod(1);
                response.setTemperature(15);
                response.setDescription(
                        "Nuestro hogar, único planeta conocido con vida. " +
                                "La atmósfera permite agua líquida en la superficie."
                );
                break;

            case "marte":
                response.setName("Marte");
                response.setDiameter(6779);
                response.setDistanceFromSun(227.9);
                response.setOrbitalPeriod(1.88);
                response.setTemperature(-63);
                response.setDescription(
                        "Conocido como el 'planeta rojo'. Alguna vez tuvo agua en la superficie " +
                                "y es uno de los principales objetivos de futuras misiones humanas."
                );
                break;

            case "jupiter":
            case "júpiter":
                response.setName("Júpiter");
                response.setDiameter(139820);
                response.setDistanceFromSun(778.5);
                response.setOrbitalPeriod(4333);
                response.setTemperature(-110);
                response.setDescription(
                        "Júpiter es el planeta más grande del sistema solar. " +
                                "Destaca por su Gran Mancha Roja, una gigantesca tormenta."
                );
                break;

            case "neptuno":
                response.setName("Neptuno");
                response.setDiameter(49244);
                response.setDistanceFromSun(4495);
                response.setOrbitalPeriod(165);
                response.setTemperature(-200);
                response.setDescription(
                        "El planeta más lejano del sistema solar. Tiene los vientos más rápidos " +
                                "y su color azul se debe al metano de su atmósfera."
                );
                break;
            case "mercurio":
                response.setName("Mercurio");
                response.setDiameter(4879);
                response.setDistanceFromSun(57.9);
                response.setOrbitalPeriod(88); // días
                response.setTemperature(167); // ºC promedio
                response.setDescription(
                        "Mercurio es el planeta más pequeño del sistema solar y el más cercano al Sol. " +
                                "Tiene temperaturas extremas debido a su débil atmósfera."
                );
                break;

            case "venus":
                response.setName("Venus");
                response.setDiameter(12104);
                response.setDistanceFromSun(108.2);
                response.setOrbitalPeriod(225); // días
                response.setTemperature(460);
                response.setDescription(
                        "Venus es el planeta más caliente del sistema solar debido a un fuerte efecto invernadero. " +
                                "Tiene densas nubes de ácido sulfúrico."
                );
                break;

            case "saturno":
                response.setName("Saturno");
                response.setDiameter(116460);
                response.setDistanceFromSun(1429);
                response.setOrbitalPeriod(10759); // días
                response.setTemperature(-138);
                response.setDescription(
                        "Saturno es famoso por su sistema de anillos. Es un gigante gaseoso compuesto por hidrógeno y helio."
                );
                break;

            case "urano":
                response.setName("Urano");
                response.setDiameter(50724);
                response.setDistanceFromSun(2871);
                response.setOrbitalPeriod(30687); // días
                response.setTemperature(-195);
                response.setDescription(
                        "Urano es un gigante de hielo con un eje de rotación extremadamente inclinado, casi tumbado."
                );
                break;

            default:
                response.setName(name);
                response.setDiameter(0);
                response.setDistanceFromSun(0);
                response.setOrbitalPeriod(0);
                response.setTemperature(0);
                response.setDescription(
                        "No hay información disponible para este planeta."
                );
        }

        return response;
    }
}
