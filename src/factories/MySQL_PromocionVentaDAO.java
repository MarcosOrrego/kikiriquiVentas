
package factories;

import dao.PromocionVentaDAO;
import java.sql.SQLException;
import java.util.List;
import model.PromocionVenta;

public class MySQL_PromocionVentaDAO implements PromocionVentaDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_PromocionVentaDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(PromocionVenta promVe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PromocionVenta> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
