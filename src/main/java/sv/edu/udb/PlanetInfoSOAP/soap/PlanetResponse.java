package sv.edu.udb.PlanetInfoSOAP.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PlanetResponse", namespace = "http://udb.edu.sv/planetinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlanetResponse {

    @XmlElement(name = "name", namespace = "http://udb.edu.sv/planetinfo")
    private String name;

    @XmlElement(name = "diameter", namespace = "http://udb.edu.sv/planetinfo")
    private double diameter;

    @XmlElement(name = "distanceFromSun", namespace = "http://udb.edu.sv/planetinfo")
    private double distanceFromSun;

    @XmlElement(name = "orbitalPeriod", namespace = "http://udb.edu.sv/planetinfo")
    private double orbitalPeriod;

    @XmlElement(name = "temperature", namespace = "http://udb.edu.sv/planetinfo")
    private double temperature;

    @XmlElement(name = "description", namespace = "http://udb.edu.sv/planetinfo")
    private String description;

    public PlanetResponse() {
    }

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
