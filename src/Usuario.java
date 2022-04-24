package src;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Usuario {
    
    private String nombre;
    private int edad;
    private String DNI;

    public Usuario(){

    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public boolean setDNI(String DNI){

        Pattern modelo = Pattern.compile("^[0-9]{8}-?[A-Z]{1}");
        Matcher correcto = modelo.matcher(DNI);
        if (correcto.matches()) {
            this.DNI=DNI;
            System.out.println("El DNI introducido es correcto.");
            return true;

        } else {
            System.out.println("El DNI introducido es incorrecto. Vuelva a introducirlo.");
            return false;

        }
        
    }  
    
}
