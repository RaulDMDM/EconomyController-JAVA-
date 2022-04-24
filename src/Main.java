package src;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int codigoAccion = 10;
        int indexAccion = 1;
        
        System.out.println("Ingresa el nombre de usuario: ");
        String nombreUsuario = input.nextLine();

        System.out.println("Ingresa la edad del usuario: ");
        int edadUsuario = input.nextInt();
        input.nextLine(); //Al introducir uAn entero, necesitamos limpiar el buffer de Scanner para poder seguir ingresdando datos.

        System.out.println("Ingresa el DNI del usuario: ");
        String DNIUsuario = input.nextLine();

        Usuario usuario = new Usuario();
        usuario.setNombre(nombreUsuario);
        usuario.setEdad(edadUsuario);

        
        if (usuario.setDNI(DNIUsuario)==true) {

            System.out.println("El DNI introducido es correcto.");
            
        } else {

            while (usuario.setDNI(DNIUsuario)==false) {
                System.out.println("El DNI introducido es incorrecto. Vuelva a introducirlo.");
                System.out.println("Ingresa el DNI del usuario: "); 
                DNIUsuario = input.nextLine();
                
            }
        }

        System.out.println(usuario + "\n---------------------");

        Cuenta cuenta = new Cuenta(usuario);

        while (indexAccion > 0 || indexAccion < 0) {

            
            System.out.println("Realiza una nueva acción");
            System.out.println("1. Introduce un nuevo gasto.");
            System.out.println("2. Introduce un nuevo ingreso.");
            System.out.println("3. Mostrar gastos.");
            System.out.println("4. Mostrar ingresos.");
            System.out.println("5. Mostrar saldo.");
            System.out.println("0. Salir");

            System.out.println("Introduce código de acción: " );

            codigoAccion = input.nextInt();input.nextLine();
            indexAccion = codigoAccion;

            switch (codigoAccion) {
                case 1:

                    double importeGasto;
                    String conceptoGasto;

                    System.out.println("Importe de gasto: ");
                    importeGasto = input.nextInt();input.nextLine();
                    

                    System.out.println("Concepto de gasto: ");
                    conceptoGasto = input.nextLine();

                    cuenta.addGasto(conceptoGasto, importeGasto);
  
                    System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                    
                    break;
                case 2:

                    double importeIngreso;
                    String conceptoIngreso;

                    System.out.println("Importe de ingreso: ");
                    importeIngreso = input.nextInt();input.nextLine();
                

                    System.out.println("Concepto de ingreso: ");
                    conceptoIngreso = input.nextLine();

                    cuenta.addIngresos(conceptoIngreso, importeIngreso);

                    System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                    
                    break;
                case 3:

                    System.out.println(cuenta.getGastos());
                    
                    break;
                case 4:

                    System.out.println(cuenta.getIngresos());
                    
                    break;
                case 5:

                    System.out.println(cuenta.getSaldo());
                    
                    break;

                default: 
                    System.out.println("Codigo incorrecto.");
                    break;
            }
        }
        
        System.out.println("Fin del programa.\nGracias por utilizar la aplicación.");
    }
}