package co.com.rgm.domain;

import lombok.Data;

@Data // Anotacion que permite tener las notaciones de Java Bean teniedo el codigo limpio (getters and setters equals, toString, hashCode) / Lombok
public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

}
