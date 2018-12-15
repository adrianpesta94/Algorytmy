package Dwukierunkowa;

public class LinkedList {

    private List first;
    private List last;

    public LinkedList(){
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

    public void addLast(int value){
        List list = new List(value);
        if (isEmpty()){
            first = list;
        }else {
            last.next = list;
            list.prev = last;
        }
        last = list;
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
        if (first == null){
            last = null;
        }else {
            first.next.prev = null;
        }
        first = first.next;
        return poll;
    }

    public List pollLast(){
        List poll = last;
        if (first.next == null){
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
        return first == null;
    }

}
