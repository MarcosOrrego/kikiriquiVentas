package factories;

import dao.VentaDAO;
import java.sql.SQLException;
import java.util.List;
import model.Venta;

public class MySQL_VentaDAO implements VentaDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_VentaDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(Venta v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
