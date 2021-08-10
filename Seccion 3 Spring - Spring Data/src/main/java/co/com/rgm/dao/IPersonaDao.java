package co.com.rgm.dao;

import co.com.rgm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ralbe
 */


public interface IPersonaDao extends CrudRepository<Persona, Long> {
    
    
    
}
