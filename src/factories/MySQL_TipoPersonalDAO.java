package factories;

import dao.TipoPersonalDAO;
import java.sql.SQLException;
import java.util.List;
import model.TipoPersonal;

public class MySQL_TipoPersonalDAO implements TipoPersonalDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_TipoPersonalDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(TipoPersonal tp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoPersonal> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
