import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private List<String> historial;

    public Calculadora() {
        historial = new ArrayList<>();
    }

    private void validarNumeros(int a, int b) {
        // En Java, los tipos ya están validados, aquí se puede ampliar si se usa entrada dinámica
    }

    public int sumar(int a, int b) {
        validarNumeros(a, b);
        int resultado = a + b;
        historial.add(a + " + " + b + " = " + resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        validarNumeros(a, b);
        int resultado = a - b;
        historial.add(a + " - " + b + " = " + resultado);
        return resultado;
    }

    public int multiplicar(int a, int b) {
        validarNumeros(a, b);
        int resultado = a * b;
        historial.add(a + " * " + b + " = " + resultado);
        return resultado;
    }

    public double dividir(int a, int b) {
        validarNumeros(a, b);
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        double resultado = (double) a / b;
        historial.add(a + " / " + b + " = " + resultado);
        return resultado;
    }

    public List<String> mostrarHistorial() {
        return historial;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(10, 4));
        System.out.println("Multiplicación: " + calc.multiplicar(2, 6));
        System.out.println("División: " + calc.dividir(8, 2));
        System.out.println("Historial: " + calc.mostrarHistorial());
    }
}
