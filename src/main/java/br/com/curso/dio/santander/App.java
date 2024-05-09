package br.com.curso.dio.santander;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contador.contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
