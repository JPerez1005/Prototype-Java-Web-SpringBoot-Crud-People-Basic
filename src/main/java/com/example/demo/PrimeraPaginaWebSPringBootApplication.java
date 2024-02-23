package com.example.demo;

import com.example.demo.Entities.Persona;
import com.example.demo.Repositories.PersonaRepository;
import com.example.demo.Services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeraPaginaWebSPringBootApplication{

    @Autowired
    private PersonaService servicePersona;

    public static void main(String[] args) {
            SpringApplication.run(PrimeraPaginaWebSPringBootApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Persona p=new Persona();
//        p.setId(2L);
//        p.setNombre("David");
//        byte edad=(byte)22;
//        p.setEdad(edad);
//        servicePersona.crearPersona(p);
//        
//        System.out.println("Numero de personas en la tabla: "+servicePersona.contarPersonas());
//
//        List<Persona> personas=servicePersona.obtenerTodas();
//        personas.forEach(per->System.out.println("Nombre: "+per.getNombre()));
//    }

}
