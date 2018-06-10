package model;

public class Venta {
    private int id;
    private String fecha;
    private int idPersonal;
    private String fonoCliente;
    private int total;
    private boolean estado;

    public Venta() {
    }

    public Venta(int id, String fecha, int idPersonal, String fonoCliente, int total, boolean estado) {
        this.id = id;
        this.fecha = fecha;
        this.idPersonal = idPersonal;
        this.fonoCliente = fonoCliente;
        this.total = total;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getFonoCliente() {
        return fonoCliente;
    }

    public void setFonoCliente(String fonoCliente) {
        this.fonoCliente = fonoCliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
