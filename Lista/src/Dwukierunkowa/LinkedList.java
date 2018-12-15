package Dwukierunkowa;

public class LinkedList {

    private List first;
    private List last;

    public LinkedList(){
        first = last = null;
    }

    public void addFirst(int value){
        List add = new List(value);
        if (isEmpty()){
            last = add;
        }else {
            first.prev = add;
        }
        add.next = first;
        first = add;
    }

    public void addLast(int value){
        List add = new List(value);
        if (isEmpty()){
            first = add;
        }else {
            last.next = add;
            add.prev = last;
        }
        last = add;
    }

    public List peekFirst(int value){
        List peek = new List(value);
        if (first == null){
            first.prev = null;
        }else if (first.prev == null){
            first.next = null;
        }
        return peek;
    }

    public List peekLast(int value){
        List peek = new List(value);
        if (last == null){
            last.next = null;
        }else if (last.next == null){
            last.prev = null;
        }
        return peek;
    }

    public List pollFirst(){
        List poll = first;
        if (first.next == null){
            last = null;
        }else {
            first.next.prev = null;
        }
        first = first.next;
        return poll;
    }

    public List pollLast(){
        List poll = last;
        if (last.prev == null){
            first = null;
        }else {
            last.prev.next = null;
        }
        last = last.prev;
        return poll;
    }

    public void show(){
        System.out.print("Lista: początek - koniec: ");
        List show = first;
        while (show != null){
            show.Linked();
            show = show.next;
        }
        System.out.println(" ");
    }

    public void showReverse(){
        System.out.print("Lista: koniec - początek: ");
        List reverse = last;
        while (reverse != null){
            reverse.Linked();
            reverse = reverse.prev;
        }
        System.out.println(" ");
    }

    public boolean isEmpty(){
//        List empty = first;
//        while (empty != null) {
//            if (empty.value != value) {
//                return true;
//            }
//            empty = empty.next;
//        }
//        return false;
        return first == null && last == null;
    }
}