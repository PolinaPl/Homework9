import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int arrSum = 0;
        for (int elememt : arr) {
            arrSum += elememt;
        }
        System.out.println("Сумма трат за месяц составила " + arrSum + " рублей.");

        System.out.println("Задача 2");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int min = salaryArray[0];
        int max = salaryArray[0];
        for (int salary : salaryArray) {
            if (salary < min) {
                min = salary;
            }
            if (salary > max) {
                max = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей».");

        System.out.println("Задача 3");
        int[] tratyArray = generateRandomArray();
        System.out.println(Arrays.toString(tratyArray));
        int tratySum = 0;
        for (int day : tratyArray) {
            tratySum += day;
        }
        double mediumSum = (double) tratySum / tratyArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumSum + " рублей.");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

}