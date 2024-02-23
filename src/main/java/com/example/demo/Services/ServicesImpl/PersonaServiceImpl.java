package com.example.demo.Services.ServicesImpl;

import com.example.demo.Entities.Persona;
import com.example.demo.Repositories.PersonaRepository;
import com.example.demo.Services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author perez
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repositoryPersona;
    
    @Override
    public List<Persona> obtenerTodas() {
        return repositoryPersona.findAll();
    }

    @Override
    public Persona odtenerPorId(Long id) {
        return  repositoryPersona.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona p) {
        return repositoryPersona.save(p);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona p) {
        Persona personaEncontrada=repositoryPersona.findById(id).orElse(null);
        
        if(personaEncontrada!=null){
            personaEncontrada.setNombre(p.getNombre());
            personaEncontrada.setEdad(p.getEdad());
            return repositoryPersona.save(p);
        }
        System.out.println("Esa persona no existe");
        return null;
    }

    @Override
    public void eliminarPersona(Long id) {
        repositoryPersona.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return repositoryPersona.count();
    }
    
}
