import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");

         int[] mas1 = new int[] {1, 2, 3};

         double [] mas2 = {1.57, 7.654, 9.986};

         boolean [] mas3 = new boolean[2];
         mas3[0] = true;
         mas3[1] = false;
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int[] mas1 = new int[] {1, 2, 3};
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i]);
            if (i < mas1.length - 1) System.out.print(", ");
        }
        System.out.println();

        double [] mas2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i]);
            if (i < mas2.length - 1) System.out.print(", ");
        }
        System.out.println();

        boolean [] mas3 = new boolean[2];
        mas3[0] = true;
        mas3[1] = false;
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i]);
            if (i < mas3.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int[] mas1 = new int[] {1, 2, 3};
        for (int i = mas1.length - 1; i >= 0; i--) {
            System.out.print(mas1[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        double [] mas2 = {1.57, 7.654, 9.986};
        for (int i = mas2.length - 1; i >= 0; i--) {
            System.out.print(mas2[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        boolean [] mas3 = new boolean[2];
        mas3[0] = true;
        mas3[1] = false;
        for (int i = mas3.length - 1; i >= 0; i--) {
            System.out.print(mas3[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int[] mas1 = new int[] {1, 2, 3};
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 != 0) {
                mas1[i] ++;
            }
        }
        System.out.println(Arrays.toString(mas1));
    }
}