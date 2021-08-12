package co.com.rgm.servicio;

import co.com.rgm.dao.IPersonaDao;
import co.com.rgm.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ralbe
 */
@Service
public class PersonaServicioImpl implements PersonaService {
    
    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly = true) //Anotacion para solo leer informacion
    public List<Persona> listarPersonas() {
        
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true) //Anotacion para solo leer informacion
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
    
    
}
