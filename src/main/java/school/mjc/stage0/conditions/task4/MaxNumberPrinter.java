package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max=Math.max(first,second);
        max=Math.max(max, third);
        System.out.println(max);
    }
}
