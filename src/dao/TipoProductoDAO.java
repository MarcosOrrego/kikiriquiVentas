package dao;

import java.util.List;
import model.TipoProducto;

public interface TipoProductoDAO {
     void create(TipoProducto tpro);
    
    List<TipoProducto> read();
}
