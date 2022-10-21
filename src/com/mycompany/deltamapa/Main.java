package com.mycompany.deltamapa;

import java.util.Scanner;

/**
 *
 * @author felip
 */
class DeltaMapa {

    public static void main(String[] args) {
        double delta =0;
        double x1 = 0;
        double x2 = 0;
        int a = 0 ;
        int b = 0 ;
        int c = 0 ;
        try {
            Scanner number = new Scanner(System.in);
            System.out.println("Insira o Valor de a : " );
            a = number.nextInt();
            System.out.println("Insira o Valor de b : " );
            b = number.nextInt();
            System.out.println("Insira o Valor de c : " );
            c = number.nextInt();
            delta =  calcularDelta(a,b,c);
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("------------- Resultados------------");
            System.out.println("O valor de Delta : "+delta);
            System.out.println("O valor da Primeira Raiz (x1) : "+x1);
            System.out.println("O valor da Segunda Raiz  (x2) : "+x2);
            System.out.println("--------------------------------------");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta : "+delta+"\nNao existem raizes reais.");
        }
        return delta;
    }

}
