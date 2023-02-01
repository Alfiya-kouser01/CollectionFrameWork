import sun.plugin2.message.Serializer;

import java.util.*;
public class demoArrayList {
    public static void main(String[] args) {
        ArrayList demo =new ArrayList();
        demo.add("A");
        demo.add(10);
        demo.add("B");
        demo.add(null);
        System.out.println(demo);
        demo.remove(2);
        System.out.println(demo);
        demo.add(2,"M");
        demo.add(3,"N");
        System.out.println(demo);
        System.out.println(demo instanceof Serializer);
        System.out.println(demo instanceof Cloneable);
        System.out.println(demo instanceof RandomAccess);


    }
}
