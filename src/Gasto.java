package src;

public class Gasto extends Dinero{ //Creamos el metodo "Gasto". Con extends hacemos una llamada a su Clase "padre" Dinero, así podemos acceder a sus variables.

    public Gasto(double gasto, String description) { //Constructor de Gasto. 
        this.dinero=gasto;
        super.setDescription(description);    
    }

    @Override
    public String toString() { //Con este ToString sacamos los valores ingresados en dinero y descripcion para este caso.
        return "El gasto es de: " + this.dinero + " ,La descripción es: " + super.getDescription();
    }
    
}
