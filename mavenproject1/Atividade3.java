package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massa;
        int tempo=0, hora, minuto, segundo;
        
        System.out.println("Informe a massa inicial do material em gramas: ");
        massa = sc.nextDouble();
        
        System.out.println("A massa inicial é " + massa + "g.");
        
        while (massa >= 0.5) {
            tempo = tempo + 50;
            massa = massa / 2;
        }
        
        hora = tempo / 3600;
        minuto = (tempo - (hora * 3600))/60;
        segundo = tempo - (hora * 3600) - (minuto * 60);
        
        System.out.println("A massa final é " + massa + "g.");
        System.out.println("O tempo necessário para alcançar uma massa inferior a 0,5 gramas é de " + hora + "h " + minuto + "m " + segundo + "s.");
    }
}
