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

        System.out.println("Введите число:");
        calc.add(sc.nextInt());

        while (sc.nextLine() != "stop") {

            System.out.println("Введите знак +, -, *, /");
            System.out.println("или знак отмены ~");
            char sign = sc.next().charAt(0);
            if (sign == '~') {
                calc.pop();
                calc.pop();
                System.out.println(calc.get(calc.size() - 1));
            } 
            else {
                System.out.println("Введите число:");
                calc.add(sc.nextInt());
                // System.out.println(calc);
                int res = 0;
                if (sign == '+')
                    res = calc.get(calc.size() - 2) + calc.get(calc.size() - 1);
                if (sign == '-')
                    res = calc.get(calc.size() - 2) - calc.get(calc.size() - 1);
                if (sign == '*')
                    res = calc.get(calc.size() - 2) * calc.get(calc.size() - 1);
                if (sign == '/')
                    res = calc.get(calc.size() - 2) / calc.get(calc.size() - 1);
                calc.add(res);

                System.out.println(res);
            }
        }
        sc.close();

        System.out.println(calc);
    }
}
