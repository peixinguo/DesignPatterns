package patterns.adapter.iterenum;

import java.util.ArrayList;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("s");
        list.add("f");
        Enumeration<?> enumeration = new IteratorEnumeration(list.iterator());

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
