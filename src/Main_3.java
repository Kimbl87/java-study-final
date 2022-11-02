import java.util.Scanner;

public class Main_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordWin = "";
        Integer lengthUniqWin=0;

        System.out.println("Введите колличество строк:");
        int length = sc.nextInt();
        System.out.println("Количество строк: " + length);
        String arrWords[] = new String[length];
        //Цикл на обработку каждого слова (Ввод и подсчет уникальных символов)
        for (int i = 0; i < length; i++){
            System.out.println("Введите слово "+ (i+1)+" :");
//          Вводим i-ное слово массива
            arrWords[i] = sc.next();
//          Разбиваем слово на массив символов и выясняем его размер
            char[] arrChars = arrWords[i].toCharArray();
            int wordLength = arrWords[i].length();
//            Определяем счетчик уникальных символов в слове arrWords[i]
            int count = 1;//Начинаем с 1, тк последняя буква всегда уникальна, потому же ее не проверяем в следующем цикле
//            Берем  j-ный символ и проверяем встречается ли он в последующих символах массива символов
            for (int j = 0; j < wordLength-1; j++){
                boolean uniq = true; //Признак уникальности буквы, пытаемся доказать, что символ не уникален - если не получается - значение не меняем
//            сравниваем символ j с символами после него
                for (int k = j + 1; k < wordLength; k++){
                    if (arrChars[k] == arrChars[j]) uniq = false ; //Если символ не уникальный
                }
                if (uniq) count++;
            }
            //Сравниваем кол-во уникальных символов с прошлым победителем, если больще - меняем слово победителя и счетчик победителя
            if (count > lengthUniqWin){
                    lengthUniqWin = count;
                    wordWin = arrWords[i];
            }
        }
        //Выводим победителя
        System.out.println(wordWin);
    }
}