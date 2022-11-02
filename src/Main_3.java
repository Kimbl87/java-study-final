import java.util.Scanner;

public class Main_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordWin = "";
        Integer lengthUniqWin=0;

        System.out.println("������� ����������� �����:");
        int length = sc.nextInt();
        System.out.println("���������� �����: " + length);
        String arrWords[] = new String[length];
        //���� �� ��������� ������� ����� (���� � ������� ���������� ��������)
        for (int i = 0; i < length; i++){
            System.out.println("������� ����� "+ (i+1)+" :");
//          ������ i-��� ����� �������
            arrWords[i] = sc.next();
//          ��������� ����� �� ������ �������� � �������� ��� ������
            char[] arrChars = arrWords[i].toCharArray();
            int wordLength = arrWords[i].length();
//            ���������� ������� ���������� �������� � ����� arrWords[i]
            int count = 1;//�������� � 1, �� ��������� ����� ������ ���������, ������ �� �� �� ��������� � ��������� �����
//            �����  j-��� ������ � ��������� ����������� �� �� � ����������� �������� ������� ��������
            for (int j = 0; j < wordLength-1; j++){
                boolean uniq = true; //������� ������������ �����, �������� ��������, ��� ������ �� �������� - ���� �� ���������� - �������� �� ������
//            ���������� ������ j � ��������� ����� ����
                for (int k = j + 1; k < wordLength; k++){
                    if (arrChars[k] == arrChars[j]) uniq = false ; //���� ������ �� ����������
                }
                if (uniq) count++;
            }
            //���������� ���-�� ���������� �������� � ������� �����������, ���� ������ - ������ ����� ���������� � ������� ����������
            if (count > lengthUniqWin){
                    lengthUniqWin = count;
                    wordWin = arrWords[i];
            }
        }
        //������� ����������
        System.out.println(wordWin);
    }
}