package factories;

import dao.ClienteDAO;
import dao.PersonalDAO;
import dao.ProductoDAO;
import dao.ProductoPromoDAO;
import dao.ProductoVentaDAO;
import dao.PromocionDAO;
import dao.PromocionVentaDAO;
import dao.TipoPersonalDAO;
import dao.TipoProductoDAO;
import dao.TipoUsuarioDAO;
import dao.UsuarioDAO;
import dao.VentaDAO;
import exceptions.MotorNoSoportadoException;
import java.sql.SQLException;

public class DAOFactory {

    private static DAOFactory daoFactory;

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }

        return daoFactory;
    }

    public enum Motor {
        MY_SQL, ORACLE, MS_SQL
    }

    public ClienteDAO getClienteDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_ClienteDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public PersonalDAO getPersonalDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PersonalDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public ProductoDAO getProductoDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_ProductoDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public ProductoPromoDAO getProductoPromoDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_ProductoPromoDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public ProductoVentaDAO getProductoVentaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_ProductoVentaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public PromocionDAO getPromocionDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PromocionDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public PromocionVentaDAO getPromocionVentaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_PromocionVentaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public TipoPersonalDAO getTipoPersonalDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_TipoPersonalDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public TipoProductoDAO getTipoProductoDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_TipoProductoDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public TipoUsuarioDAO getTipoUsarioDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_TipoUsuarioDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public UsuarioDAO getUsuarioDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_UsuarioDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

    public VentaDAO getVentaDAO(Motor motor) throws MotorNoSoportadoException, ClassNotFoundException, SQLException {
        switch (motor) {
            case MY_SQL:
                return new MySQL_VentaDAO();
            default:
                throw new MotorNoSoportadoException(motor + " no soportado");
        }

    }

}
