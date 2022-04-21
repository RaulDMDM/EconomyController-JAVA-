package src;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;
    
    public Cuenta(Usuario usuario){

        usuario=new Usuario();
        this.saldo=0;

    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        
        this.usuario = usuario;
    }

    public double addIngresos(String description, double cantidad){
        ingresos.add(new Ingreso(cantidad, description));
        saldo += cantidad;
        return 0.0;
    }


}