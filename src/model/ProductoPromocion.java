package model;

public class ProductoPromocion {
    private int id;
    private int idPromo;
    private int idProdu;
    private boolean estado;

    public ProductoPromocion() {
    }

    public ProductoPromocion(int id, int idPromo, int idProdu, boolean estado) {
        this.id = id;
        this.idPromo = idPromo;
        this.idProdu = idProdu;
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

    public int getIdProdu() {
        return idProdu;
    }

    public void setIdProdu(int idProdu) {
        this.idProdu = idProdu;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
