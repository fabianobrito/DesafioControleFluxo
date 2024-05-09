package br.com.curso.dio.santander;

public class Contador {

    public static void contar(int parametroUm, int parametroDois)
            throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro " +
                    "deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int indice = 1; indice <= contagem; indice++) {
            System.out.println("Imprimindo o número "
                    .concat(Integer.toString(indice))
            );
        }
    }
}
