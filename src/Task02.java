
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[30];
        Random random = new Random();

        // Заполнение массива случайными числами от -70 до +50
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(121) - 70; // Генерация числа от -70 до +50
        }

        // Нахождение минимального элемента
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Нахождение максимального элемента
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Вывод минимального и максимального элементов на консоль
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}