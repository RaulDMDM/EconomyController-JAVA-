package src;

public class Ingreso extends Dinero { //Creamos el metodo Ingreso. Con "extends" llamamos a la clase "padre" Dinero para poder acceder a sus variables.
    
    public Ingreso(double ingreso, String description) { //Constructor Ingreso. 
        this.dinero = ingreso;
        super.setDescription(description);
    }

    @Override
    public String toString() { //ToString que nos devolvera el valor de los parametros ingresados de ingreso en un ToString.
        return "\nSe han ingresado: " + this.dinero + " ,La descripcion es: " + super.getDescription();
    }
    
}
