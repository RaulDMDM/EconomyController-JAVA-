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

    public double addGasto(String gastoDescripcion, double gastoCantidad) throws GastoException{ 

        if (gastoCantidad >= (saldo + gastoCantidad)) { //Se comprueba si el gasto es mayor al saldo de la cuenta. Lo resta y devuelve el valor resultante de saldo.
            
            gastos.add(new Gasto(gastoCantidad, gastoDescripcion));
            saldo -= gastoCantidad;

            System.out.println(gastos + "\n");

            return saldo;

        } else {
            
            throw new GastoException("Saldo insuficiente.");
         
        }

    }

    public List<Ingreso> getIngresos(){

        return ingresos;
         
    }

    public List<Gasto> getGastos(){

        return gastos;

    }


    @Override
    public String toString() {
        return "Usuario: " + this.getUsuario() + " . Su saldo es: " + this.getSaldo();
    }


        



}