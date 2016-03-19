package com.example.steven.persona.persona;

import java.util.ArrayList;

/**
 * Created by steven on 19/03/16.
 */
public class PersonaContent {
    private static ArrayList<Persona> personList=new ArrayList();

    public static ArrayList getPersonList(){
        return personList;
    }

    public static void loadPersonList(){
        Persona person;

        person=new Persona();
        person.setId(1);
        person.setNombre("Alvaro");
        person.setApellido("Gelpud");
        person.setTelefono("123");
        person.setCorreo("alvaro@gmail.com");
        personList.add(person);

        person=new Persona();
        person.setId(1);
        person.setNombre("Steven");
        person.setApellido("Hurtado");
        person.setTelefono("123");
        person.setCorreo("steven@gmail.com");
        personList.add(person);

        person=new Persona();
        person.setId(1);
        person.setNombre("Juan");
        person.setApellido("Bastidas");
        person.setTelefono("123");
        person.setCorreo("juan@gmail.com");
        personList.add(person);
    }
}
