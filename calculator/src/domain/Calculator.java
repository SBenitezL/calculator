package domain;

public class Calculator implements ICalculator {

    @Override
    public Double add(Double op1, Double op2) {
        return op1 + op2;
    }

    @Override
    public Double substraction(Double op1, Double op2) {
        return op1 - op2;
    }

    @Override
    public Double multiplication(Double op1, Double op2) {
        return op1 * op2;
    }

    @Override
    public Double division(Double op1, Double op2) throws Exception {
        if (op2 == 0) {
            throw new Exception("El operador 2 no puede ser 0");
        }
        return op1 / op2;
    }

}
