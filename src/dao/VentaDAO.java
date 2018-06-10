package dao;

import java.util.List;
import model.Venta;

public interface VentaDAO {
     void create(Venta v);
    
    List<Venta> read();
}
