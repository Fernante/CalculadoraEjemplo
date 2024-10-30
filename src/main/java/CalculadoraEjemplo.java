/**
 * La clase CalculadoraEjemplo realiza operaciones matemáticas básicas: suma, resta,
 * multiplicación y división entre dos operandos.
 * 
 * @author Tu Nombre
 * @version 1.0
 * @since 2024-10-30
 */
public class CalculadoraEjemplo {
    private final double operando1; // Primer operando
    private final double operando2; // Segundo operando
    private double resultado;  // Resultado de la operación

    /**
     * Constructor de la clase CalculadoraEjemplo.
     * 
     * @param operando1 Primer operando.
     * @param operando2 Segundo operando.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de operando1 y operando2.
     * 
     * @return El resultado de la suma.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de operando1 y operando2.
     * 
     * @return El resultado de la resta.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de operando1 y operando2.
     * 
     * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de operando1 y operando2.
     * 
     * @return El resultado de la división.
     * @throws ArithmeticException Si operando2 es cero.
     */
    public double dividir() {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Método principal para probar la clase CalculadoraEjemplo.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(10, 5);

        System.out.println("Suma: " + calculadora.sumar());
        System.out.println("Resta: " + calculadora.restar());
        System.out.println("Multiplicación: " + calculadora.multiplicar());
        System.out.println("División: " + calculadora.dividir());
    }
}
