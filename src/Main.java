//importando uma biblioteca do java
//Algoritmo Equação 2º Grau
//INICIO
//real: a,b,c,delta,x1,x2,x;
//atribuindo o objeto scanner A uma variavel de nome entrada para o usuario digitar e pegar o valor
//escreva: ("Vamos calcular o baskhara!!!");
//escreva:  ("Por favor digite o valor de a: ");
//leia: (a)
//escreva:  ("Por favor digite o valor de b: ");
//leia: (b)
//escreva:  ("Por favor digite o valor de c: ");
//leia: (c)
//delta=(b*b) -4*a*c
//escreva: ("O Valor de delta é: " + delta);
//SE:(DELTA == 0)então
//  x= -b/(2*a);
//  escreva:("Como o delta é 0 existe apenas uma UNICA RAIZ REAL ou seja, uma solução repetida o valor é: " + x);
//SENÃO SE(delta > 0)então
//   x1 = (-b + (Math.sqrt(delta))) / (2*a);
//   escreva:("O resultado do X1 é: " + x1);
//   x2 = (-b - (Math.sqrt(delta))) / (2*a);
//    escreva:("O resultado do X2 é: " + x2);
//SENÃO
//  Esceva:("Como o delta é negativo não possui raizes Reais")
//FIM
//


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c,delta,x1,x2,x;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos calcular o baskhara!!!");

        System.out.println("Por favor digite o valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Por favor digite o valor de b: ");
        b = entrada.nextDouble();
        System.out.println("Por favor digite o valor de c: ");
        c = entrada.nextDouble();

        delta = (b*b) - 4*a*c;
        System.out.println("O Valor de delta é: " + delta);

        if(delta == 0){
            x= -b/(2*a);
            System.out.println("Como o delta é 0 existe apenas uma UNICA RAIZ REAL ou seja, uma solução repetida o valor é: " + x);
        }
        else if (delta > 0 ){
        x1 = (-b + (Math.sqrt(delta))) / (2*a);
        System.out.println("O resultado do X1 é: " + x1);
        x2 = (-b - (Math.sqrt(delta))) / (2*a);
        System.out.println("O resultado do X2 é: " + x2);

        }else {
            System.out.println("Como o delta é negativo não possui raizes Reais");
        }

    }
}