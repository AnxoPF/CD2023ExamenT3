package exament3;

public class App {
    public static void main(String[] args) {
        CuentaBancaria cuentaCorriente = new CuentaBancaria("Anxo", 1200);

        cuentaCorriente.depositar(100);
        
        System.out.println(cuentaCorriente.getSaldo());
        
    }
    
}
