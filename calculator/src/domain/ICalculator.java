
public interface ICalculator {
    /**
     * Método que permite la suma de dos operadores.
     * 
     * @param op1 operador 1 (ocupa la primera posición en la operación)
     * @param op2 operador 2 (ocupa la segunda posición en la operación)
     * @return {@code Double} retorna la suma de los dos operadores.
     */
    Double add(Double op1, Double op2);

    /**
     * Método que permite la resta de dos operadores
     * 
     * @param op1 operador 1 (ocupa la primera posición en la operación)
     * @param op2 operador 2 (ocupa la segunda posición en la operación)
     * @return {@code Double} retorna la resta de los dos operadores.
     */
    Double substraction(Double op1, Double op2);

    /**
     * Método que permite la multiplicación de dos operadores
     * 
     * @param op1 operador 1 (ocupa la primera posición en la operación)
     * @param op2 operador 2 (ocupa la segunda posición en la operación)
     * @return {@code Double} retorna el producto de los dos operadores.
     */
    Double multiplication(Double op1, Double op2);

    /**
     * Método que permite la division de dos operadores
     * 
     * @param op1 operador 1 (ocupa la primera posición en la operación)
     * @param op2 operador 2 (ocupa la segunda posición en la operación)
     * @return {@code Double} retorna el resultado de la division de los dos
     *         operadores.
     */
    Double division(Double op1, Double op2) throws Exception;
}
