import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private List<String> historial;

    public Calculadora() {
        historial = new ArrayList<>();
    }

    public int sumar(int a, int b) {
        int resultado = a + b;
        historial.add(a + " + " + b + " = " + resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        int resultado = a - b;
        historial.add(a + " - " + b + " = " + resultado);
        return resultado;
    }

    public List<String> mostrarHistorial() {
        return historial;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(10, 4));
        System.out.println("Historial: " + calc.mostrarHistorial());
    }
}
