package company;
// Имееться прямоугольное отверстие размерами a и b, определить ,можно ли  его полностью закрыть круглой картонкой радиусом r.
public class Main {

    public static void main(String[] args) {
        int a = 5; //длинна
        int b = 6;//ширина
        int r = 3;// если значение радиуса увеличить , тогда условие  положительное.

        if (r * r >= (a * a + b * b) / 4)
            System.out.println("Можно");
        else
            System.out.println("Нельзя");
    }
}
