package co.com.rgm.web;



import co.com.rgm.dao.IPersonaDao;
import co.com.rgm.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String inicio(Model model){
        
        var personas = personaService.listarPersonas();
     
        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("personas", personas);
        return "index";
    
    }
}
