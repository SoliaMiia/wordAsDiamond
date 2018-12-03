package com.company;

public class Main {
    public static void main(String[] args) {
        String str="ABCDEFG";
        outUp(str);
        outDown(str);
    }
    public static void outDown(String str){
        int middle = middleMeth(str);
        for(int i = 1; i < middle; i++){
            outLetters(str, i);
            System.out.println();
        }
    }
    public static int middleMeth(String str){
        int mid = 0;
        mid = str.length() % 2 == 0 ? str.length()/2:(str.length()/2) + 1;
        return mid;
    }
    public static void outLetters(String str, int i){
        int space = i;
        while (space != 0) {
            System.out.print(" ");
            space--;
        }
        for (int j = i; j < str.length() - i; j++)
            System.out.print(str.charAt(j));
    }
    public static void outUp(String str){
        int middle = middleMeth(str);
        for(int i = middle; i >= 0; i--) {
            outLetters(str, i);
            System.out.println();
        }
    }
}

