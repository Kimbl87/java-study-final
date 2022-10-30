import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        char[] ea = sc.next().toCharArray(); //ea - Equation array
        int a, b, c, x = 0;

        if (ea[0] == 'x'){
            b = Character.getNumericValue(ea[2]);
            c = Character.getNumericValue(ea[4]);
            if (ea[1] == '-') b *= -1;
            x = c- b;
        }

        if (ea[2] == 'x'){
            a = Character.getNumericValue(ea[0]);
            c = Character.getNumericValue(ea[4]);
            x = c - a;
            if (ea[1] == '-') x *= -1;
        }

        if (ea[4] == 'x'){
            a = Character.getNumericValue(ea[0]);
            b = Character.getNumericValue(ea[2]);
            if (ea[1] == '-') b *= -1;
            x = a + b;
        }

        System.out.println("x="+ x);
    }
}

