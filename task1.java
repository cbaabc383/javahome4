import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task1 {

    public static void main(String[] args) {

        LinkedList<Integer> listlink = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            listlink.add((int) (Math.random() * 100));
        }
        System.out.println(listlink);

        for (int i = 0; i < listlink.size(); i++) {
            listlink.addFirst(listlink.get(i));
            listlink.remove(i + 1);
        }
        System.out.println(listlink);
    }
}