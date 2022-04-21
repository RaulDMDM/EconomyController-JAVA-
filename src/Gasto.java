package src;

public class Gasto extends Dinero{

    public Gasto(double gasto, String description) {
        this.dinero=gasto;
        super.setDescription(description);    
    }

    @Override
    public String toString() {
        return "El gasto es de: " + this.dinero + " ,La descripción es: " + super.getDescription();
    }
    
}
