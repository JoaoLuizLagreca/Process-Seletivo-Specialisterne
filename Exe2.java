/*
2. Crie um programa que receba um número. Se o número for par apresente o
quadrado, se for ímpar apresente o cubo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Exe2{
    public static void main(String args[]) throws IOException{

        System.out.print("Insira um número: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String num = r.readLine();

        int n = Integer.parseInt(num);
        if(n%2==1){
            System.out.println("Esse número é ímpar!");
            System.out.println(n+"³ = "+Math.pow(n, 3));
        }else{
            System.out.println("Esse número é par!");
            System.out.println(n+"² = "+Math.pow(n, 2));
        }
    }
}
