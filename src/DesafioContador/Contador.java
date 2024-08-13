package DesafioContador;

import DesafioContador.ParametrosInvalidosException.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {


    public static int contar(int numero1, int numero2) throws ParametrosInvalidosException {

        if(numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            return numero2 - numero1;
        }
    }

    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.println("Digite o primeiro número");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número");
            int numero2 = scanner.nextInt();

            scanner.close();

            int resultado = contar(numero1, numero2);

            for(int i = 0; i < resultado; i++ ) {
                System.out.println(i + 1);
            }


        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
