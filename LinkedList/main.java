package LinkedList;

public class main {
    public static void main(String[] args) {
        singleLL list = new singleLL(); 
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(69);
        list.insertLast(99);
        list.insert(9, 2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
    }
}
