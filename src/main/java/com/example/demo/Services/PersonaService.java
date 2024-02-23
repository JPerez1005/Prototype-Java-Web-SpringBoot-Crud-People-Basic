package com.example.demo.Services;

import com.example.demo.Entities.Persona;
import java.util.List;

/**
 * @author perez
 */
public interface PersonaService {
    List<Persona> obtenerTodas();
    
    Persona odtenerPorId(Long id);
    
    Persona crearPersona(Persona p);
    
    Persona actualizarPersona(Long id,Persona p);
    
    void eliminarPersona(Long id);
    
    long contarPersonas();
}
