/*
3. Criar um programa que leia uma palavra e mostre se tal palavra é um palíndromo ou não, exemplo:
Digite uma palavra:
Roma
Resultado: Roma não é palíndromo
Digite uma palavra:
Reger
Resultado: Reger é palíndromo
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exe3{

    public static void main(String args[]) throws IOException{

        System.out.print("Digite uma palavra: ");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String pal = r.readLine();

        Palavra palavra = new Palavra(pal);

        System.out.print("Resultado: ");
        if(palavra.palindromo()){
            System.out.println(pal+" é palíndromo");
        }else{
            System.out.println(pal+" não é palíndromo");
        }

    }

}

class Palavra{

    String pal, inv;
    Palavra(String pal){

        this.pal = pal.toLowerCase();

        StringBuffer sb = new StringBuffer(pal.length());
        for(int i=0; i<pal.length(); i++){
            sb.insert(0, this.pal.charAt(i));
        }
        inv = sb.toString();
        sb=null;

    }

    boolean palindromo(){
        if (pal.equals(inv)) return true;
        return false;
    }

}
