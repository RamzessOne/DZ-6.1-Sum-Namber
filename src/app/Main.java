package app;

public class Main {
    public static void main(String[] args) {
        String Symbol = "----------------------";
        int a = 1;
        while (a <= 5) {
            int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
            int sum1 = 0;
            for (int num : numbers) {
                sum1 += num;
                    System.out.println(a + ")" + " " + "Num is" + " " + a + "," + " " + "sum is" + " " + sum1);
                    a++;
                }
            System.out.println (Symbol);
            System.out.println ("Sum of numbers is" + " " + sum1);

            }
        }
    }
