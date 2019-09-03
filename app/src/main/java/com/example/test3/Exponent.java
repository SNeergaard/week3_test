package com.example.test3;

public class Exponent {

    public static void main(String[] args) {

        double n = 0;
        int m = -2;
        double x = 0;
//        the easy way
//        x = Math.pow(n,m);
        if(m == 0){
            x = 1;
        }else if(m > 0){
            x = n;
            for(int i = 1; i < m; i++){
                x*=n;
            }
        }else{
        if(n != 0) {
            x = (1 / n);
            for (int i = -1; i > m; i--) {
                x = (x / n);
            }
        }else{System.out.println("ERROR");}
        }
        System.out.println(x);
    }
}
