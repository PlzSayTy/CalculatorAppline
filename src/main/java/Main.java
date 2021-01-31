import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер требуемой операции");
        int number = scanner.nextInt();
        if (number == 1){
            Calculator calculator = new Calculator();
            calculator.calculate();
        }else if (number == 2) {
            Mass mass = new Mass();
            mass.findBiggestWordInMass();
        }
    }
}
