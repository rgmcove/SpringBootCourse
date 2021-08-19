package co.com.rgm.servicio;

import co.com.rgm.domain.Persona;
import java.util.List;

/**
 *
 * @author Ralbe
 */
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
}
