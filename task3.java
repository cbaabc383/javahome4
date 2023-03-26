import java.util.Scanner;
import java.util.Stack;

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
Пример

1
+
2
ответ:
3

+
4
ответ:
7

Отмена
3
*
3

ответ:
9

Пример 2
Ввод: 1
Ввод: +
Ввод: 2
Вывод: 3

Ввод:+
Ввод:4
Вывод 7
Ввод:*
Ввод:3
Вывод 21
Отмена
Вывод 7
Отмена
Вывод 3
Ввод:-
Ввод:1
Вывод 2

Дополнительно каскадная отмена - отмена нескольких операций
 */
public class task3 {
    public static void main(String[] args) {
        Stack<Integer> calc = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-e число:");
        // int number_1 = sc.nextInt();
        calc.add(sc.nextInt());
        System.out.println("Введите знак :");
        char sign = sc.next().charAt(0);
        System.out.println("Введите 2-e число:");
        // int number_2 = sc.nextInt();
        // calc.add(number_2);
        calc.add(sc.nextInt());
        sc.close();
        int res = 0;
        if (sign == '+') res = calc.get(calc.size()-2) + calc.get(calc.size()-1);
        if (sign == '-') res = calc.get(calc.size()-2) - calc.get(calc.size()-1);
        if (sign == '*') res = calc.get(calc.size()-2) * calc.get(calc.size()-1);
        if (sign == '/') res = calc.get(calc.size()-2) / calc.get(calc.size()-1);
        // if (sign == '-') res = number_1 - number_2;
        // if (sign == '*') res = number_1 * number_2;
        // if (sign == '/') res = number_1 / number_2;
        // System.out.printf("%d %c %d = %d", number_1, sign, number_2, res);
        System.out.println(res);
        System.out.println(calc);
    }
}
