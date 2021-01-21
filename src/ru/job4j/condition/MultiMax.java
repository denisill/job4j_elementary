package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first < second) {
                result = second;
                if (second < third) {
                    result = third;
                }
        } else {
            if (first < third) {
                result = third;
            }
        }
        return  result;
    }
}
