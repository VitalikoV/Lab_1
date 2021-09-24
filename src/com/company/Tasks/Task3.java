package com.company.Tasks;

import com.company.Task;
import com.company.Utils.Task3Utils;

public class Task3 implements Task {
    public void executeTask() {
        final int[] numbers = {1, 5, 8, 22, 1, 2, 3};
        final char[] letters = {'T', 'm', 'S', 'r', 'e','e','q','g', 'A'};
        String generatedString = generateStringFromArrays(numbers, letters);
        System.out.println("generatedString: " + generatedString);
    }

    public static String generateStringFromArrays(int[] numberElements, char[] charElements) {
        StringBuilder generatedString = new StringBuilder();
        final int maxLength = Math.max(numberElements.length, charElements.length);
        for (int i = 0; i < maxLength; i++) {
            if (charElements.length > i && numberElements.length > i) {
                generatedString.append(charElements[i]);
                generatedString.append(numberElements[i]);
            } else if(charElements.length <= i){
                generatedString.append(numberElements[i]);
            }else if(numberElements.length <= i){
                generatedString.append(charElements[i]);
            }
        }
        return generatedString.toString();
    }
}
