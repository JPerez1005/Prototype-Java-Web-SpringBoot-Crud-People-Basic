package com.example.demo.Controller;

import com.example.demo.Entities.Persona;
import com.example.demo.Services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author perez
 */
@Controller
@RequestMapping("/personas")
public class personaController {
    @Autowired
    private PersonaService servicePersona;
    
    //Aqui obtengo los datos de todas las personas
    @GetMapping
    public String ListarPersonas(Model model){
        List <Persona> personas=servicePersona.obtenerTodas();
        model.addAttribute("lista_personas",personas);
        return "listar";
    }
    
    @GetMapping("/nueva")
    public String LlevarAUnFormulario(Model model){
        model.addAttribute("persona",new Persona());
        model.addAttribute("accion","/personas/nueva");
        return "formulario";
    }
    
    @PostMapping("/nueva")
    public String guardarPersona(@ModelAttribute Persona p){
        servicePersona.crearPersona(p);
        return "redirect:/personas";
    }
    
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id,@ModelAttribute Persona p,Model model){
        model.addAttribute("persona", p);
        model.addAttribute("accion","/personas/editar/"+id);
        return "formulario";
    }
    
    @PostMapping("/editar/{id}")
    public String actualizarPersona(@PathVariable Long id,@ModelAttribute Persona p){
        servicePersona.actualizarPersona(id, p);
        return "redirect:/personas";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        servicePersona.eliminarPersona(id);
        return "redirect:/personas";
    }
}
