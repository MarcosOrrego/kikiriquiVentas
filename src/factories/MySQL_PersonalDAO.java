package factories;

import dao.PersonalDAO;
import java.sql.SQLException;
import java.util.List;
import model.Personal;


public class MySQL_PersonalDAO implements PersonalDAO{
    
     MySQL_ConexionDAO c;

    public MySQL_PersonalDAO() throws ClassNotFoundException, SQLException {

        c = new MySQL_ConexionDAO(DatosConexion.MySQL.SERVER, DatosConexion.MySQL.USER, DatosConexion.MySQL.PASS, DatosConexion.MySQL.BD);

    }
    

    @Override
    public void create(Personal p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personal> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
