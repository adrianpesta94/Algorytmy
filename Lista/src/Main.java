import Dwukierunkowa.Linked;

public class Main {

    public static void main(String[] args) {

        Linked lista = new Linked();

        lista.addFirst(22);
        lista.addFirst(23);
        lista.addFirst(24);

        lista.addLast(34);
        lista.addLast(35);
        lista.addLast(36);

        lista.show();
        lista.showReverse();

        lista.pollFirst();
        lista.pollLast();

        lista.show();
        lista.showReverse();

        lista.peekFirst(23);
        lista.show();

        lista.peekLast(35);
        lista.showReverse();
    }

}
