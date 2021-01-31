import java.util.Scanner;

public class Calculator {
    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число операции");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число операции");
        double num2 = scanner.nextDouble();
        System.out.println("Введите математический оператор");
        String operator = scanner.next();
        System.out.print("Результат = " );
        switch (operator){
            case "+":{
                System.out.printf("%.3f", num1+num2);
                break;
            }
            case "/":{
                System.out.printf("%.3f", num1/num2);
                break;
            }
            case "*":{
                System.out.printf("%.3f", num1*num2);
                break;
            }
            case "-":{
                System.out.printf("%.3f", num1-num2);
                break;
            }
        }
    }
}
