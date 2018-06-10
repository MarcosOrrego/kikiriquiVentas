package factories;

import dao.TipoProductoDAO;
import java.sql.SQLException;
import java.util.List;
import model.TipoProducto;

public class MySQL_TipoProductoDAO implements TipoProductoDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_TipoProductoDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(TipoProducto tpro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoProducto> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
