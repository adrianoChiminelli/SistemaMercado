
package interfaces;

import java.util.List;
import java.util.Optional;

public interface FuncoesDAO <T> {
    
    void insert (T objeto); 
    List<T> findAll(); 
    Optional<T> findById(Integer id);
    void delete (Integer id);
    void update(T objeto);
        
}
