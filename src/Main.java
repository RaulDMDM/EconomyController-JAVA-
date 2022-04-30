package src;

import java.util.Scanner; //Importacion de Scanner para poder insertar datos por consola.

public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) throws GastoException{ //Llama al metodo de la excepcion que tira el programa si el gasto es mayor al saldo.

        //Declaracion de las variables que se usarán para recorrer el bucle While del menú
        int codigoAccion = 10;
        int indexAccion = 1;
        
        //Creación de usuario

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

        //Comprobacion de DNI introducido correcto/falso.

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

        //Creacion de cuenta.

        Cuenta cuenta = new Cuenta(usuario);

        
        //Bucle while donde dependiendo del valor que le demos a indexAccion por consola, nos derivará a un objeto o saldrá del bucle.
        
        while (indexAccion != 0) {

            //Menú. Se mostrará siempre al principio del bucle.

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

            //
            switch (codigoAccion) {
                case 1: //Nuevo gasto

                    double importeGasto;
                    String conceptoGasto;

                    System.out.println("Importe de gasto: ");
                    importeGasto = input.nextDouble();input.nextLine();
                    

                    System.out.println("Concepto de gasto: ");
                    conceptoGasto = input.nextLine();

                    cuenta.addGasto(conceptoGasto, importeGasto);
  
                    System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                    
                    break;
                case 2: //Nuevo ingreso

                    double importeIngreso;
                    String conceptoIngreso;

                    System.out.println("Importe de ingreso: ");
                    importeIngreso = input.nextDouble();
                    input.nextLine();
            
                    System.out.println("Concepto de ingreso: ");
                    conceptoIngreso = input.nextLine();

                    cuenta.addIngresos(conceptoIngreso, importeIngreso);

                    System.out.println("El saldo de la cuenta es: " + cuenta.getSaldo());
                    
                    break;
                case 3: //Obtener listado de gastos.

                    System.out.println(cuenta.getGastos());
                    
                    break;
                case 4: //Obtener listado de ingresos.

                    System.out.println(cuenta.getIngresos());
                    
                    break;
                case 5: //Obtener saldo actual por medio del toString de Cuenta.

                    System.out.println(cuenta);
                
                break;

                default: //Acción por defecto, si a codigoAccion le damos el valor "0", el programa se cerrará y lanzara mensaje fin.
                    if (codigoAccion == 0) {
                        
                        System.out.println("Fin del programa.\nGracias por utilizar la aplicación.");

                    }else{ //Si introducimos un valor distinto a un numero del 0 al 5, nos saltara mensaje de "codigo incorrecto".
                        System.out.println("Codigo incorrecto.");
                    }

                break;
            }
        } 
        
    }
}