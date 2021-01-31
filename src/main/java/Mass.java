import java.util.Arrays;
import java.util.Scanner;

public class Mass {
    /**
     * @author Trubetskoy V. A.
     */
    public void findBiggestWordInMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        String[] mass = new String[size];
        int sizeOfWord = 0;
        String biggestWord = null;

        for (int i = 0; i < size; i++) {
            System.out.println("Введите слово номер " + i);
            String word = scanner.next();
            mass[i] = word;
            if (word.length() > sizeOfWord) {
                sizeOfWord = word.length();
                biggestWord = word;
            }
        }
        System.out.println("Самое большое слово в массиве = " + biggestWord);
        System.out.println("Его размер составил " + sizeOfWord + " букв");
        System.out.println("Поздравляю!!");
    }
}
