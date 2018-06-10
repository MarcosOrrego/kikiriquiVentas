package model;

public class ProductoVenta {
    private int id;
    private int idProdu;
    private int idVenta;
    private boolean estado;

    public ProductoVenta() {
    }

    public ProductoVenta(int id, int idProdu, int idVenta, boolean estado) {
        this.id = id;
        this.idProdu = idProdu;
        this.idVenta = idVenta;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProdu() {
        return idProdu;
    }

    public void setIdProdu(int idProdu) {
        this.idProdu = idProdu;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
