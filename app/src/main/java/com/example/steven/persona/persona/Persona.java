package com.example.steven.persona.persona;

public class Persona {
    private int id;
    private String nombre="";
    private String apellido="";
    private String telefono="";
    private String correo="";

    public Persona(){

    }
    public Persona(int i,String n,String a, String t,String c){
        this.id=i;
        this.nombre=n;
        this.apellido=a;
        this.telefono=t;
        this.correo=c;

    }
    public int getId(){return id;}
    public void setId(int i){this.id=i;}

    public String  getNombre(){return nombre;}
    public void  setNombre(String n){this.nombre=n;}

    public String  getApellido(){return apellido;}
    public void  setApellido(String a){this.apellido=a;}

    public String  getTelefono(){return telefono;}
    public void  setTelefono(String t){this.telefono=t;}

    public String  getCorreo(){return correo;}
    public void  setCorreo(String c){this.correo=c;}

    @Override
    public String toString(){
        return nombre+" "+apellido;
    }
}
