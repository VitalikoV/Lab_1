package com.company.Utils;

public class Task3Utils {
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
