package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario=1000, aumento=0.015;
        
        salario = salario * (aumento + 1);
        
        for (int i = 1997; i < 2023; i++) {
            aumento = aumento * 2;
            salario = salario * (aumento + 1);
        }
        
        System.out.printf("O salário do funcionário em 2022 é R$%.2f", salario);
    }
}
