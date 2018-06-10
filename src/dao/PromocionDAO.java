package dao;

import java.util.List;
import model.Promocion;

public interface PromocionDAO {
     void create(Promocion prom);
    
    List<Promocion> read();
}
