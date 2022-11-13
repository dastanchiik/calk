import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число");
        int a = scanner.nextInt();
        System.out.println("Ведите число");
     int b = scanner.nextInt();
        System.out.println("Выберите функцию:  + , - , / , * ");
     String w = scanner.next();
     match(a,b,w);

    }
    public static void match(int a,int b,String c){
        switch (c){
            case "*":
        if (a>0){
            System.out.println(a*b);
            break;
        }
            case "/":
                if (a>0){
                    System.out.println(a/b);
                    break;
                }
            case "-":
                if (a>0){
                    System.out.println(a-b);
                    break;
                }
            case "+":
                if (a>0){
                    System.out.println(a+b);
                    break;
                }
            default:
                System.out.println("Ваш запрос не понятен");
                break;
        }
    }
}