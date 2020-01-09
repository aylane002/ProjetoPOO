package br.ufrn.tads.poo;

import testes.Retangulo;

public class Main {
    public static void main(String[] args){
        Retangulo r = new Retangulo(2,4);

        int area = r.calcular();
                System.out.println("Area de r:" + r.calcular());

        Integer a = null;
        Integer b = 3;
        System.out.println(a+b);

        r = new Retangulo(3,2);
        System.out.println("Area de r:" + r.calcular());
    }


}


