import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class task1 {

    public static void main(String[] args) {

        LinkedList<Integer> listlink = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            listlink.add((int) (Math.random() * 100));
        }
        System.out.println(listlink);
        
        System.out.println(list(listlink));
    }

    static LinkedList<Integer> list (LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.addFirst(list.get(i));
            list.remove(i + 1);
        }
        return list;
    }
}
