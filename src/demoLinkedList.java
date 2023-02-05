import java.util.*;
public class demoLinkedList {
    public static void main (String [] args){
        LinkedList i = new LinkedList();
        i.add("name");
        i.add(30);
        i.add(null);
        i.add("name");
        i.set(0,"software");
        i.add(0,"world");
        i.removeLast();
        i.addFirst("ccc");
        System.out.println(i);

    }
}
