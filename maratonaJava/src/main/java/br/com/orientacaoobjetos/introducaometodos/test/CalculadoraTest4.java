package br.com.orientacaoobjetos.introducaometodos.test;

import br.com.orientacaoobjetos.introducaometodos.model.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        int[] numeros = {1,2,3,4,5};
        
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);
    }
    
}
