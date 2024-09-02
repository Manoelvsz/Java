package Executavel5;

import java.util.Scanner;

import entidade5.calculodolar;

public class main {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float qtdolar,dolar;
    
    System.out.println("Informe o valor dolar: ");
    dolar=sc.nextFloat();
    System.out.println("Informe a quantidade de dolar a comprar: ");
    qtdolar=sc.nextFloat();
    
    calculodolar calculo = new calculodolar(qtdolar, dolar);
    float aaa = calculo.calculoTotal();
    
    System.out.println("Valor total: "+ aaa);
   
   
   }
   
 
}
