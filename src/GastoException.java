package src;

public class GastoException extends Exception { //Excepcion para gasto superior a saldo.

    public GastoException(String error){
        super("Importe insuficiente");

    }
    
}
