package dao;

import java.util.List;
import model.Personal;


public interface PersonalDAO {
     void create(Personal p);
    
    List<Personal> read();
    
}
