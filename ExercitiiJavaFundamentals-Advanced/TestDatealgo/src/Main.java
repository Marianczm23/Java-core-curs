public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 25, 60, 25, 60, 5, 4, 4, 3};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {

                    count++;
                    System.out.println(numbers[i]);

                }
            }

        }
        System.out.println(count);
    }
}

