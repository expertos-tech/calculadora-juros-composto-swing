package expertostech.calculadora.exemplo;

import java.math.BigDecimal;

public class DetalheBigDecimal {

    public static void main(String[] args) {
        BigDecimal valor1 = new BigDecimal(5);
        BigDecimal valor2 = new BigDecimal(10);

        // Verifica se o valor1 é menor que o valor2
        if (valor1.compareTo(valor2) < 0) {
            System.out.println("Valor 1 é maior que o Valor 2");
        }

        // Verifica se o valor1 é igual ao valor2
        if (valor1.compareTo(valor2) == 0) {
            System.out.println("Valor 1 é igual ao Valor 2");
        }

        // Verifica se o valor1 é diferente do valor2
        if (valor1.compareTo(valor2) != 0) {
            System.out.println("Valor 1 é diferente do Valor 2");
        }

        // Verifica se o valor1 é maior que o valor2
        if (valor1.compareTo(valor2) > 0) {
            System.out.println("Valor 1 é maior que o Valor 2");
        }



    }

}


