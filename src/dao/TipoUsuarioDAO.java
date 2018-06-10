package dao;

import java.util.List;
import model.TipoUsuario;

public interface TipoUsuarioDAO {
     void create(TipoUsuario tuser);
    
    List<TipoUsuario> read();
}
