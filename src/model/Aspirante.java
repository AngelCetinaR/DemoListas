package model;

/**
 *
 * @author cetina
 */
public class Aspirante {
    private String nombre;
    private boolean aceptado;

    public Aspirante(String nombre) {
        this.nombre = nombre;
        this.aceptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }
    
}
