package exament3;

/**
 * Declaración de la clase
 */

public class CuentaBancaria {

    /**
     * Declaración de las variables que pertenecen a la clase
     * titular tipo String y saldo tipo double
     */
    private String titular;
    private double saldo;

    /**
     * Constructor de CuentaBancaria con sus 2 atributos como
     * parámetros de entrada
     * @param titular parametro de entrada que referencia al atributo titular
     * @param saldoInicial parametro de entrada que referencia al atributo saldo
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Obtiene el valor del parámetro "titular"
     * @return nos devuelve dicho valor
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Obtiene el valor del parámetro "saldo"
     * @return nos devuelve dicho valor
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que suma una cantidad indicada al parámetro "saldo" si
     * dicha cantidad es superior a 0.
     * Si no se cumpliese la condición lanzaría una excepción
     * @param cantidad es el parámetro donde indicamos cuanto queremos
     * añadir a saldo
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    /**
     * Método que resta del parámetro saldo la cantidad indicada, siempre
     * que esta sea menor a la propia cantidad en saldo, y superior a 0.
     * Si no se cumpliese alguna de las condiciones lanzaría una excepción.
     * @param cantidad es el parámetro donde indicamos que cantidad queremos restar
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede retirar la cantidad especificada.");
        }
    }
}