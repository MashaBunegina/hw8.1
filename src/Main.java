import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            // задание 1
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            double[] doubles = {1.56, 7.654, 9.986};
            int [] weight = {57, 55, 59};
            for (int i = 0; i < numbers.length; i++) {
                if (i != numbers.length - 1) {
                    System.out.print(numbers[i] + ",");
                } else {
                    System.out.println(numbers[i]);
                }
            }
            for (int i = 0; i < doubles.length; i++) {
                if (i != doubles.length - 1) {
                    System.out.print(doubles[i] + ",");
                } else {
                    System.out.println(doubles[i]);
                }
            }
            // Задача 2
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(numbers[i] + ",");
                } else {
                    System.out.println(numbers[i]);
                }

            }
            for (int i = 0; i < weight.length; i++) {
                if (i != weight.length - 1) {
                    System.out.print(weight[i] + ",");
                } else {
                    System.out.println(weight[i]);
                }
            }


            for (int i = doubles.length - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(doubles[i] + ",");
                } else {
                    System.out.println(doubles[i]);
                }
            }
            // задача 4
            for (int i = 0; i < numbers.length ; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers[i] += 1;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }

    }


