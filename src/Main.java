package src;

public class Main {
    
    public static void main(String[] args) {
        
        Dinero gasto1=new Gasto(20, "Hamburguesas");
        Dinero ingreso1=new Ingreso(20, "Paga");

        System.out.println(gasto1);
        System.out.println(ingreso1);
    }
}