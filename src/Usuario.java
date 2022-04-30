package src;

import java.util.regex.Pattern; //Importamos Pattern para compilar una expresion dada en string y que nos la devuelva en un patron.
import java.util.regex.Matcher; //Importamos Matcher para comprobar que el DNI coincide con los caracteres que hemos pasado por Pattern.

public class Usuario { //Creacion de clase usuario.
    
    private String nombre;
    private int edad;
    private String DNI;

    public Usuario(){ //Constructor de usuario.

        nombre=getNombre();
        edad=getEdad();
        DNI=getDNI();

    }


    public String getNombre() { //Getter de Nombre
        return this.nombre;
    }

    public void setNombre(String nombre) { //Setter de Nombre
        this.nombre = nombre;
    }

    public int getEdad() { //Getter de Edad
        return this.edad;
    }

    public void setEdad(int edad) { //Setter de Edad
        this.edad = edad;
    }

    public String getDNI() { //Getter de DNI
        return this.DNI;
    }

    public boolean setDNI(String DNI){  //Setter de Dni.

        //Se comprueba que el imput tiene los caracteres y longitud correctos.
        Pattern modelo = Pattern.compile("^[0-9]{8}-?[a-z,A-Z]{1}");
        Matcher correcto = modelo.matcher(DNI);
        if (correcto.matches()) {
            this.DNI=DNI;
            
            return true;

        } else {
            
            return false;

        }
        
    }  

    //Metodo toString para devolver los datos de usuario.
    @Override
    public String toString() {
        return "-------------Usuario creado-------------\n"+
        "Nombre: " + nombre +"\nEdad: " + edad + "\nDNI: " + DNI;
    }

    
}
