package com.company.Utils;

public class Task2Utils {
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
