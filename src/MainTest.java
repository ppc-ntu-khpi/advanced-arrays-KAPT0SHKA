public class MainTest {

    public static void main(String[] args) {
        // Тестова матриця
        int[][] matrix = {
            {1, 2, 3},
            {3, 2, 1},
            {1, 1, 2}
        };

        // Отримуємо результат від методу findMostFrequentNumber
        int mostFrequentNum = MatrixAnalyzer.findMostFrequentNumber(matrix);

        // Виводимо результат
        System.out.println("Число, яке повторюється найбільшу кількість разів: " + mostFrequentNum);
    }
}
