package dao;

import java.util.List;
import model.Cliente;

public interface ClienteDAO {
    
    void create(Cliente c);
    
    List<Cliente> read();
}
