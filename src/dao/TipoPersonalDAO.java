package dao;

import java.util.List;
import model.TipoPersonal;

public interface TipoPersonalDAO {
     void create(TipoPersonal tp);
    
    List<TipoPersonal> read();
}
