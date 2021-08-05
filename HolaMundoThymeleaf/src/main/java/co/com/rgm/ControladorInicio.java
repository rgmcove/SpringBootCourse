package co.com.rgm;


import co.com.rgm.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class ControladorInicio {

    //Para importar desde el archivo application properties
    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensaje con Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Ruben");
        persona.setApellido("Gomez");
        persona.setEmail("ralberto115@gmail.com");
        persona.setTelefono("3184780470");
        persona.setDireccion("Calle 58a #43-38");

        var persona2 = new Persona();
        persona2.setNombre("Marlen");
        persona2.setApellido("Albornoz");
        persona2.setEmail("malbornoz@gmail.com");
        persona2.setTelefono("3157226113");
        persona2.setDireccion("Calle 17 #21b-16");

//        var personas = new ArrayList<>();
//        personas.add(persona);
//        personas.add(persona2);

        var personas = Arrays.asList(persona, persona2);

        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
//        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }

}
