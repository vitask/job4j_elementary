package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(
                first,
                max(second, third));
    }

    public static int max(int first, int second, int third, int four) {
        return max(first, second,
                    max(third, four));
    }

    public static void main(String[] args) {
        int res = max(10, 100);
        System.out.println(res);
    }
}
