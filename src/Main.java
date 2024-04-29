import java.util.Arrays;

public class Main {

    /**
     * Знаходить число, яке повторюється найбільшу кількість разів у матриці.
     *
     * @param matrix двовимірний масив чисел
     * @return число, яке повторюється найбільшу кількість разів
     */
    public static int findMostFrequentNumber(int[][] matrix) {
        // Створюємо масив для зберігання частот кожного числа
        int[] frequency = new int[100]; // Припускаємо, що числа у матриці не перевищують 100

        // Рахуємо частоту кожного числа у матриці
        for (int[] row : matrix) {
            for (int num : row) {
                frequency[num]++;
            }
        }

        // Знаходимо число з найбільшою частотою
        int mostFrequentNum = 0;
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                mostFrequentNum = i;
                maxFrequency = frequency[i];
            }
        }

        return mostFrequentNum;
    }
}
