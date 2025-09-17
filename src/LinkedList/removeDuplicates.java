package LinkedList;

public class removeDuplicates {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.deleteDuplicates();
        list.display();
    }

}
