package com.example.demo.Repositories;

import com.example.demo.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author perez
 */

//EStereotipos
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    
}
