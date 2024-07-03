// Enunciado: Faça um programa que calcule e imprima o salário a ser transferido para um funcionário. Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios.
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Qual é o seu salário bruto?");
        float valorSalario = scanner.nextFloat();
        System.out.println("Qual é o valor do seu adicional de benefícios?");
        float valorBeneficios = scanner.nextFloat();

        float valorImposto = 0;
            if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario; 
            } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
                valorImposto = 0.10F * valorSalario;
            } else {
                valorImposto = 0.15F * valorSalario;
            }
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("O valor que será transferido será de: %.2f", saida));
        }
    }
