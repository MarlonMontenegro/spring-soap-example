package sv.edu.udb.PlanetInfoSOAP.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanetInfo {

    private String name;               // Nombre
    private double diameter;           // km
    private double distanceFromSun;    // millones de km
    private double orbitalPeriod;      // años
    private double temperature;        // °C
    private String description;        // Texto "acerca de"
}
