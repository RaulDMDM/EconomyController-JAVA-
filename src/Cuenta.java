package src;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos = new ArrayList<>();;
    private List<Ingreso> ingresos = new ArrayList<>();
    
    public Cuenta(Usuario usuario){ //Constructor de la clase Cuenta

        this.setUsuario(usuario);
        saldo=0.0;

    }

    public double getSaldo() { //GETTER de "Saldo". Nos devolvera el valor de saldo.
        
        saldo = Math.round(saldo*100.0)/100.0; //Redondeo de saldo a dos decimales, extraido de: https://www.delftstack.com
        return this.saldo;
    }

    public void setSaldo(double saldo) { //SETTER de "Saldo. Asignaremos un nuevo valor a saldo basandonos en esta funcion"
        this.saldo = saldo;
    }

    public Usuario getUsuario() { //GETTER de "Usuario". Nos devolvera el valor de Usuario.
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) { //SETTER de "Usuario". Ingresaremos un valor para "usuario" dentro de esta clase.
        
        this.usuario = usuario;
    }

    public double addIngresos(String ingresoDescription, double ingresoCantidad){ // Ingresaremos un nuevo objeto en la clase Ingreso.
        
        ingresos.add(new Ingreso(ingresoCantidad, ingresoDescription)); //(Como la funcion Ingreso de la clase Ingreso nos pide
        //cantidad y descripcion, tendremos que asignarselo)

        saldo += ingresoCantidad; //Le sumamos a la variable saldo la cantidad que metemos en ingreso. 
        return saldo; //Como base, devolvera 0.
    }

    public double addGasto(String gastoDescripcion, double gastoCantidad){ //Añadir nuevo objeto en la clase Gasto.

        try { //En try metemos los valores que se ejecutaran en el caso de que estos cumplan las condiciones para que no salte la excepcion.

            if (gastoCantidad <= saldo) { //Se comprueba si el gasto es mayor al saldo de la cuenta. Lo resta y devuelve el valor resultante de saldo.
            
                gastos.add(new Gasto(gastoCantidad, gastoDescripcion));
                saldo -= gastoCantidad;
        
                System.out.println(gastos + "\n");
        
                return saldo;
            }else{ //Si no se cumplen las condiciones del if, se llama a la clase GastoException para que salte el mensaje introducido.

            throw new GastoException("Importe insuficiente.");

            }
            
        } catch (GastoException e) { //Imprimimos por consola la excepcion y el programa continua, devolviendonos al menu.
            System.out.println(e);

        }

        return saldo;
    }

    public List<Ingreso> getIngresos(){ //Getter de ingresos. Nos devuelve el listado de ingresos.

        return ingresos;
         
    }

    public List<Gasto> getGastos(){ //Getter de gastos. Nos devuelve el listado de gastos.

        return gastos;

    }

    //Este ToString nos devuelve el saldo del usuario.
    @Override
    public String toString() {
        return "Usuario: " + usuario.getNombre() + " . Su saldo es: " + this.getSaldo();
    }


}