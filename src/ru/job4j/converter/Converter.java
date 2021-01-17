package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int inRubToEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inRubToEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);
        int inRubToDollar = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inRubToDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("180 rubles are 3 dollar. Test result : " + passedDollar);
    }
}
