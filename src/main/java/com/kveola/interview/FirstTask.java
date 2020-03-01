package com.kveola.interview;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Hello there");
        String[] nameList = {"Bob", "Luuk", "Mikaela", "Fisnik", "Raz", "Mikaela"};
        int [] sizeList = {42, 43, 39, 45, 45, 45};
        getFrequentNumber(sizeList);
        getFrequentName(nameList);
    }

    private static void getFrequentName(String[] nameList) {
        int count = 1;
        int tempCount;
        String popular = nameList[0];
        for (int i = 0; i < (nameList.length - 1); i++)
        {
            String temp = nameList[i];
            tempCount = 0;
            for (int j = 1; j < nameList.length; j++)
            {
                if (temp.equals(nameList[j]))
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println(popular);
    }
    public static void getFrequentNumber(int[] sizeList){
        int count = 1;
        int tempCount;
        int popular = sizeList[0];
        for (int i = 0; i < (sizeList.length - 1); i++)
        {
            int temp = sizeList[i];
            tempCount = 0;
            for (int j = 1; j < sizeList.length; j++)
            {
                if (temp == sizeList[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println(popular);
    }
}
