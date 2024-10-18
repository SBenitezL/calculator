package presentation;

import java.util.Scanner;

public class CalculatorTerminal {
    private Scanner consola;

    public CalculatorTerminal() {
        this.consola = new Scanner(System.in);
    }

    public void start() {
        System.out.println("**** Aplicación calculadora ****");
    }

    public Double leerOperando() {
        Double dato = null;
        do {
            try {
                dato = Double.parseDouble(this.consola.nextLine());
            } catch (Exception e) {
                System.err.println("El valor ingresado no es numérico.");
                System.out.print("ingrese un valor: ");
            }
        } while (dato == null);
        return dato;
    }

    public int leerOpcion() {
        int opcion = 0;
        do {
            System.out.print("ingrese una opción: ");
            opcion = Integer.parseInt(this.consola.nextLine());
        } while (opcion < 1 || opcion > 5);
        return opcion;
    }

}
