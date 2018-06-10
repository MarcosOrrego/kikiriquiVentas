package dao;

import java.util.List;
import model.ProductoVenta;


public interface ProductoVentaDAO {
     void create(ProductoVenta proV);
    
    List<ProductoVenta> read();
}
