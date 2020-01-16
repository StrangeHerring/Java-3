package geekbrains.java3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random() * 10);
        System.out.println("Ваша задача угадать число от 0 до 10");
        for (int i = 0; i <= 3; i++) {
            if (i == 3){
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int retry = scanner.nextInt();
                if (retry == 1){
                    i = 0;
                    number = (int)(Math.random() * 10);
                } else if (retry == 0){
                    break;
                }
            }
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int retry = scanner.nextInt();
                if (retry == 1) {
                    i = -1;
                    number = (int)(Math.random() * 10);
                } else if (retry == 0) {
                    break;
                }
            } else if (input_number > number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        scanner.close();
    }
}
