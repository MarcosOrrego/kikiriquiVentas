package dao;

import java.sql.ResultSet;

public interface ConexionDAO {

    public void conectar();

    public void ejecutar(String sql);

    public ResultSet ejecutarSelect(String select);

    public void desconectar();
}
