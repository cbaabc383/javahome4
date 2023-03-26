import java.util.LinkedList;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> que = new LinkedList<String>();
        enqueue(que, "tktbjbkd");
        enqueue(que, "5465");
        enqueue(que, "5klv");
        dequeue(que);
        first(que);
        System.out.println(que);
    }
    static void enqueue(LinkedList<String> list, String elem) {
        list.add(elem);
    }

    static void first(LinkedList<String> list) {
       System.out.println(list.get(0));
    }

    static void dequeue(LinkedList<String> list) {
        System.out.println(list.get(0));
        list.remove(0);
     }
    
}
