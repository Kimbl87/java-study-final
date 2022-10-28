import java.util.Scanner;

public class Main_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс:");
        double rate = sc.nextDouble();
        System.out.println("Введите количество рублей:");
        double ruble = sc.nextDouble();
        //Вычисляем кол-во долларов
        double dollar = ruble/rate;
        System.out.println("-Курс доллара: "+ rate);
        System.out.println("- Количество рублей: "+ ruble);
        int dollarInt1 = (int)(dollar*100)/100;//Вычисляем целую часть долларов
        int dollarInt2 = (int)(dollar*100)%100;//Вычисляем дробную
        System.out.println("- Итого: " + dollarInt1+","+dollarInt2 + " долларов");



    }
}

