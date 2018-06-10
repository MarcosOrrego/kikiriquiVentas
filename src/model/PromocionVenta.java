package model;

public class PromocionVenta {
    private int id;
    private int idPromo;
    private int idVenta;
    private boolean estado;

    public PromocionVenta() {
    }

    public PromocionVenta(int id, int idPromo, int idVenta, boolean estado) {
        this.id = id;
        this.idPromo = idPromo;
        this.idVenta = idVenta;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPromo() {
        return idPromo;
    }

    public void setIdPromo(int idPromo) {
        this.idPromo = idPromo;
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
