import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double firstNum;
        Double secondNum;
        String symbol;
        double res;
        double res1;
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Введите первое число: ");
            firstNum = in.nextDouble();
            System.out.print("Введите операцию: ");
            symbol = in.next();
            System.out.print("Введите второе число: ");
            secondNum = in.nextDouble();
            switch (symbol) {
                case ("/"):
                    res = firstNum / secondNum;
                    res1 = Math.floor(res);
                    if (res - res1 <= 0.00000000000001){
                        long result = Math.round(res);
                        System.out.print("Результат: " + result);
                        break;
                    }
                    System.out.print("Результат: " + res);
                    break;
                case ("*"):
                    res = firstNum * secondNum;
                    res1 = Math.floor(res);
                    if (res - res1 <= 0.00000000000001){
                        long result = Math.round(res);
                        System.out.print("Результат: " + result);
                        break;
                    }
                    System.out.print("Результат: " + res);
                    break;
                case ("+"):
                    res = firstNum + secondNum;
                    res1 = Math.floor(res);
                    if (res - res1 <= 0.00000000000001){
                        long result = Math.round(res);
                        System.out.print("Результат: " + result);
                        break;
                    }
                    System.out.print("Результат: " + res);
                    break;
                case ("-"):
                    res = firstNum - secondNum;
                    res1 = Math.floor(res);
                    if (res < 0){
                        if (res - res1 >= -0.00000000000001){
                            long result = Math.round(res);
                            System.out.print("Результат: " + result);
                            break;
                        }
                    } else if (res > 0){
                        if (res - res1 <= 0.00000000000001) {
                            long result = Math.round(res);
                            System.out.print("Результат: " + result);
                            break;
                        }
                    }
                    System.out.print("Результат: " + res);
                    break;
                default:
                    System.out.println("Введеная неверная операция!");
            }
        } catch (Exception e) {
            System.out.println("Неверный формат числа");
        }
    }
}
