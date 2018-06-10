package factories;

import dao.ProductoPromoDAO;
import java.sql.SQLException;
import java.util.List;
import model.ProductoPromocion;

public class MySQL_ProductoPromoDAO implements ProductoPromoDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_ProductoPromoDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(ProductoPromocion prodProm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductoPromocion> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
