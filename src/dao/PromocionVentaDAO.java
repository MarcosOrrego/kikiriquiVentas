package dao;

import java.util.List;
import model.PromocionVenta;

public interface PromocionVentaDAO {
     void create(PromocionVenta promVe);
    
    List<PromocionVenta> read();
}
