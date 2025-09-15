package List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUsageBasic {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type '-1' to stop):");

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        int sum = 0;
        int max = numbers.getFirst();
        int min = numbers.getFirst();

        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Numbers entered: " + numbers);
        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}
