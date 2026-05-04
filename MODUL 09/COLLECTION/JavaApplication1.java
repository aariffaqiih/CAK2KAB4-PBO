import java.util.*;

public class JavaApplication1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(200);
        list.add("Hello");
        list.add(235);
        list.add("Donny");

        // normal loop
        System.out.println("Normal loop");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }

        // loop using for-element
        System.out.println("for-element loop");
        for (Object o : list) {
            System.out.println(o);
        }

        // Loop using iterator
        System.out.println("loop using iterator");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println(o);
        }

        // loop using lambda Expression
        System.out.println("loop using lambda expression");
        list.forEach(o -> System.out.println(o));

        // loop using reference
        System.out.println("loop using reference");
        list.forEach(System.out::println);
    }
}