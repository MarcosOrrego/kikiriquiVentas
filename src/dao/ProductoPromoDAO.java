package dao;

import java.util.List;
import model.ProductoPromocion;


public interface ProductoPromoDAO {
     void create(ProductoPromocion prodProm);
    
    List<ProductoPromocion> read();
}
