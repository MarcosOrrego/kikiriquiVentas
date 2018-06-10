package model;

public class Cliente {
    private String fono;
    private String nombre;
    private String apellido;
    private boolean estado;

    public Cliente() {
    }

    public Cliente(String fono, String nombre, String apellido, boolean estado) {
        this.fono = fono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
    
}
