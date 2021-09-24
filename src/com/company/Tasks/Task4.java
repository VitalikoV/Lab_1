package com.company.Tasks;

import com.company.Task;
import com.company.Utils.Task4Utils;

public class Task4 implements Task {
    @Override
    public void executeTask() throws Exception {
        printFizzBuzzToConsole();
    }

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
