package src;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el nombre de usuario: ");
        String nombreUsuario = input.nextLine();

        System.out.println("Ingresa la edad del usuario: ");
        int edadUsuario = input.nextInt();
        input.nextLine(); //Al introducir un entero, necesitamos limpiar el buffer de Scanner para poder seguir ingresdando datos.

        System.out.println("Ingresa el DNI del usuario: ");
        String DNIUsuario = input.nextLine();

        Usuario usuario = new Usuario();
        usuario.setNombre(nombreUsuario);
        usuario.setEdad(edadUsuario);
        usuario.setDNI(DNIUsuario);

        
        System.out.println("Fin del programa.\nGracias por utilizar la aplicación.");
    }
}