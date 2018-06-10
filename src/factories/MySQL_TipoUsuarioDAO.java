package factories;

import dao.TipoUsuarioDAO;
import java.sql.SQLException;
import java.util.List;
import model.TipoUsuario;

public class MySQL_TipoUsuarioDAO implements TipoUsuarioDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_TipoUsuarioDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }

    @Override
    public void create(TipoUsuario tuser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoUsuario> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
