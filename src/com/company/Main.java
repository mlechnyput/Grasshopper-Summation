package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = 0;

        if (input.hasNextInt()) {
            num = input.nextInt();
        }else System.out.print("Wrong data");

        System.out.println("Summation ("+num+") -> "+summValue(num));
        summPrint(num);
    }

    public static int summValue(int num){
        int result;
        if (num==0)return 0;
        result=num+summValue(num-1);
        return result;
    }

    public static void summPrint(int num) {
        String str="";
        if (num == 0) return;
        summPrint(num - 1);
        if (num>1) str="+";
        System.out.print(str + num);
    }

}
