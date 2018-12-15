package Dwukierunkowa;

public class List {

    public int value;
    public List prev;
    public List next;

    public List(int value) {
        this.value = value;
        next = prev = null;
    }

    public void Linked(){
        System.out.print(value + " ");
    }
}
