package src;

public class Ingreso extends Dinero {
    
    public Ingreso(double ingreso, String description) {
        this.dinero = ingreso;
        super.setDescription(description);
    }

    @Override
    public String toString() {
        return "Se han ingresado: " + this.dinero + " ,La descripcion es: " + super.getDescription();
    }
    
}
