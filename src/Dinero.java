package src;

public abstract class Dinero { //Creamos el Metodo abstracto Dinero.
    
    protected double dinero; //Con la sentencia protected damos acceso a estas variables solo en sus clases dependientes.
    protected String description;


    public double getDinero() { //GETTER de Dinero. Nos devuelve el valor de "dinero"
        return this.dinero;
    }

    public void setDinero(double dinero) { //SETTER de Dinero. Utilizamos esta funcion para darle un valor a dinero.
        this.dinero = dinero;
    }

    public String getDescription() { //GETTER de "Descripcion". Nos devuelve el valor de "descripcion".
        return this.description;
    }

    public void setDescription(String description) { //SETTER de "Descripcion". Utilizamos esta funcion para darle un valor a descripcion.
        this.description = description;
    }
    
}
