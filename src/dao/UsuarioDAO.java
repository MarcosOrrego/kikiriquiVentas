package dao;

import java.util.List;
import model.Usuario;

public interface UsuarioDAO {
     void create(Usuario user);
    
    List<Usuario> read();
}
