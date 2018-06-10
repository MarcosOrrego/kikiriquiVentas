package factories;

import dao.PromocionDAO;
import java.sql.SQLException;
import java.util.List;
import model.Promocion;

public class MySQL_PromocionDAO implements PromocionDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_PromocionDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(Promocion prom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Promocion> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
