package com.company.Utils;

public class Task4Utils {
    public static void printFizzBuzzToConsole(){
        for(int i = 1; i<=100; i++){
            if(i%3==0 && i%5!=0) {
                System.out.print("Fizz, ");
            }else if(i%3!=0 && i%5==0){
                System.out.print("Buzz, ");
            }else if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz, \n");
            }else{
                System.out.print(i + ", ");
            }
        }
    }
}
