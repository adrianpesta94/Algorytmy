package Dwukierunkowa;

public class Linked {

    private List first;
    private List last;

    public Linked(){
        first = null;
        last = null;
    }

    public void addFirst(int value){
        List list = new List(value);
        if (isEmpty()){
            last = list;
        }else {
            first.prev = list;
        }
        list.next = first;
        first = list;
    }

    public void  addLast(int value){
        List list = new List(value);
        if (isEmpty()){
            first = list;
        }else {
            last.prev = list;
            list.next = last;
        }
        last = list;
    }

    public void show(){
        System.out.print("Lista: początek -> koniec: ");
        List current = first;
        while (current != null){
            current.Linked();
            current = current.next;
        }
        System.out.println(" ");
    }

    public void showReverse(){
        System.out.print("Lista: koniec -> początek: ");
        List current = last;
        while (current != null){
            current.Linked();
            current = current.prev;
        }
        System.out.println(" ");
    }

    private boolean isEmpty(){
        return first == null;
    }

}
