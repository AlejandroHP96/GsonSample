package dad;

import java.sql.Date;
import java.time.Instant;


/**
 * Persona
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private Instant fechaNac;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    public Instant getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Instant fechaNac) {

        this.fechaNac = fechaNac;
    }

}