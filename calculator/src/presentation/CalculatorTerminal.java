package presentation;

import java.util.Scanner;

import domain.Calculator;

public class CalculatorTerminal {
    private Scanner consola;
    private Calculator calculator;

    public CalculatorTerminal() {
        this.consola = new Scanner(System.in);
        this.calculator = new Calculator();
    }

    public void start() {
        System.out.println("**** Aplicación calculadora ****");
    }

    // #region menus
    public void menuOperaciones() {
        System.out.println("---------------------------------------");
        System.out.println("\tMENÚ DE OPERACIONES");
        System.out.println("---------------------------------------");
        System.out.println("1. Suma.");
        System.out.println("2. Resta.");
        System.out.println("3. Multiplicación.");
        System.out.println("4. División.");
        this.llamarOperaciones(this.leerOpcion());
    }

    public void suma() {
        Double op1, op2;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tMenú de Suma");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Ingrese el operando 1: ");
        op1 = this.leerOperando();
        System.out.print("Ingrese el operando 2: ");
        op2 = this.leerOperando();
        System.out.println("El resultado de la operación es: " + this.calculator.add(op1, op2));
    }

    public void resta() {
        Double op1, op2;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tMenú de Resta");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Ingrese el operando 1: ");
        op1 = this.leerOperando();
        System.out.print("Ingrese el operando 2: ");
        op2 = this.leerOperando();
        System.out.println("El resultado de la operación es: " + this.calculator.substraction(op1, op2));
    }

    public void multiplicacion() {
        Double op1, op2;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tMenú de Multiplicación");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Ingrese el operando 1: ");
        op1 = this.leerOperando();
        System.out.print("Ingrese el operando 2: ");
        op2 = this.leerOperando();
        System.out.println("El resultado de la operación es: " + this.calculator.multiplication(op1, op2));
    }

    public void division() {
        Double op1, op2, res;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tMenú de Division");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Ingrese el operando 1: ");
        op1 = this.leerOperando();
        System.out.print("Ingrese el operando 2: ");
        op2 = this.leerOperando();
        try {
            res = this.calculator.division(op1, op2);
            System.out.println("El resultado de la operación es: " + res);
        } catch (Exception e) {
            System.err.println("La división entre 0 no está definida...");
        }
    }

    // #endregion

    // #region operaciones
    public void llamarOperaciones(int opc) {
        switch (opc) {
            case 1:
                this.suma();
                break;
            case 2:
                this.resta();
                break;
            case 3:
                this.multiplicacion();
                break;
            case 4:
                this.division();
                break;
            case 5:
                System.exit(0);
        }
    }
    // #endregion

    // #region Lectura
    public Double leerOperando() {
        Double dato = null;
        do {
            try {
                dato = Double.parseDouble(this.consola.nextLine());
            } catch (Exception e) {
                System.err.println("El valor ingresado no es numérico.");
                dato = null;
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
    // #endregion
}
