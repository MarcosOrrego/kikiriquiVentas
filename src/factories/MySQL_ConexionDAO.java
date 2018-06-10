package factories;

import dao.ConexionDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL_ConexionDAO implements ConexionDAO{
    
    
    private Connection con;
    private Statement sentencia;
    private ResultSet tablaVirtual;
    
    public MySQL_ConexionDAO(){
        
    }
    public MySQL_ConexionDAO(String server, String user, String pass, String bdName) throws ClassNotFoundException, SQLException {
        String protocolo = "jdbc:mysql://";
        String lineaUsuario = "user=" + user;
        String lineaPass = "password=" + pass;

//        String url2 = "jdbc:mysql//"+server+"/"+bdName+"?user="+user+"&pass="+pass;
        String url = protocolo
                + server + "/"
                + bdName + "?"
                + lineaUsuario + "&"
                + lineaPass;

        System.out.println(url);

        // Cargar en tiempo de ejecución el Driver de MySQL
        Class.forName("com.mysql.jdbc.Driver");

        // Rescatar el objeto Conexión desde el Driver
        con = DriverManager.getConnection(url);
    }
    

    @Override
    public void conectar() {
        try {
            sentencia = con.createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ejecutar(String sql) {
           try {
            conectar();
            sentencia.execute(sql);
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ResultSet ejecutarSelect(String select) {
           try {
            conectar();
            tablaVirtual = sentencia.executeQuery(select);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tablaVirtual;
    }

    @Override
    public void desconectar() {
           try {
            sentencia.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
