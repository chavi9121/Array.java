

java
public class Array {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 7, 13, 15, 14};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenIndex] = number;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = number;
                oddIndex++;
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
    }
}

