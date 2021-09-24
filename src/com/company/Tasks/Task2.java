package com.company.Tasks;

import com.company.Task;
import com.company.Utils.Task2Utils;

public class Task2 implements Task {
    public void executeTask(){
        final String[] items = {"Test", "Testing", "Turned on"};
        final int counter = countQuantityOfSymbolInArray(items, 'T');
        System.out.println("counter: " + counter);
    }

    public static int countQuantityOfSymbolInArray(String[] items,char key){
        int quantity = 0;
        for(String item : items){
            quantity += countQuantityOfSymbol(item, key, 0);
        }
        return quantity;
    }

    private static int countQuantityOfSymbol(String word, char key, int index){
        if(index >= word.length()){
            return 0;
        }
        int count = word.charAt(index) == key? 1 : 0;
        return count + countQuantityOfSymbol(word, key, index + 1);
    }
}
