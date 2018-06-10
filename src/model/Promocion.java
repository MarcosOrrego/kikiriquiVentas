package model;

public class Promocion {
    private int id;
    private String nombre;
    private int descuento;
    private boolean estado;

    public Promocion() {
    }

    public Promocion(int id, String nombre, int descuento, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
