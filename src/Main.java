import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resp = "Заархивированный вирус";
        String help = "Подсказка";
        String helpText = "Зазипованная вредоносная программа";
        String noHelpText = "Подсказка уже недоступна";
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        for (int attempts = 3; attempts > 0; attempts--) {
            String test = sc.nextLine();

            if (test.compareTo(resp)==0){
                System.out.println("Правильно!");
                System.exit(0);}
            else if (test.compareTo(help)==0&attempts == 3) {
                System.out.println(helpText);
                attempts = 2;
            }
            else if (test.compareTo(help)==0&attempts != 3) {
                System.out.println(noHelpText);
                attempts++;
            }
            else {
                if (attempts == 1) {
                    System.out.println("Обидно, приходи в другой раз");
                    System.exit(0);
                }
                else {
                    System.out.println("Подумай еще!");
                }
            }
        }
    }

}


