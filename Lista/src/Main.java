import Dwukierunkowa.Linked;

public class Main {

    public static void main(String[] args) {

        Linked listaDwukierunkowa = new Linked();

        listaDwukierunkowa.addFirst(22);
        listaDwukierunkowa.addFirst(23);
        listaDwukierunkowa.addFirst(24);

        listaDwukierunkowa.addLast(34);
        listaDwukierunkowa.addLast(35);
        listaDwukierunkowa.addLast(36);

        listaDwukierunkowa.show();
        listaDwukierunkowa.showReverse();

        listaDwukierunkowa.pollFirst();
        listaDwukierunkowa.pollLast();

        listaDwukierunkowa.show();
        listaDwukierunkowa.showReverse();

        listaDwukierunkowa.peekFirst(23);
        listaDwukierunkowa.show();

        listaDwukierunkowa.peekLast(35);
        listaDwukierunkowa.showReverse();
    }

}
