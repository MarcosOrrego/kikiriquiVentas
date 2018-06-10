package dao;

import java.util.List;
import model.Producto;

public interface ProductoDAO {
     void create(Producto pro);
    
    List<Producto> read();
}
