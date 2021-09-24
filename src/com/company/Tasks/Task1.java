package com.company.Tasks;

import com.company.Task;
import com.company.Utils.Task1Utils;

import java.util.Arrays;

public class Task1 implements Task {
    public void executeTask() {
        final String[] items = {"Test", "Testing", "1111" };

        sortArray(items, 0, items.length - 1);
        System.out.println("sorted items: " + Arrays.toString(items));
    }

    public static void sortArray(String[] items, int low, int high){
        if (low < high)
        {
            int pi = partition(items, low, high);
            sortArray(items, low, pi-1);
            sortArray(items, pi+1, high);
        }
    }

    static int partition(String items[], int low, int high)
    {
        int pivot = items[high].length();
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (items[j].length() <= pivot)
            {
                i++;
                String temp = items[i];
                items[i] = items[j];
                items[j] = temp;
            }
        }
        String temp = items[i+1];
        items[i+1] = items[high];
        items[high] = temp;

        return i+1;
    }
}
