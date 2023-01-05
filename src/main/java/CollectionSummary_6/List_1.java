package CollectionSummary_6;

import java.lang.reflect.Method;
import java.util.*;

public class List_1 {
    public static void main(String[] args){
        String[] arr = new String[]{"whoami", "lsb_release -a", "uname -a", "ls -l /etc/*-release"};
        List<String> lst = new ArrayList<>();
        ArrayList<String> lst2 = new ArrayList<>();

        lst.add("who am i");
        lst.add("fuck you");
        lst.add("delete");
        lst2.add("fuck you");
        lst2.add("kkk");

        System.out.println(lst.toString());
        System.out.println(lst.size());
        System.out.println(lst.get(0));
        System.out.println(lst.toString());
        lst.remove("delete");
        lst.set(0, "Altered");
        System.out.println(lst.toString());
        System.out.println(lst.contains("who am i"));
        System.out.println(lst.containsAll(lst2));
        System.out.println(lst.indexOf("fuck you"));
        System.out.println(lst.lastIndexOf("fuck you"));
        System.out.println(lst.retainAll(lst2));
        System.out.println(lst.isEmpty());
        System.out.println(lst.subList(0 ,1));
        System.out.println(lst.stream());

        System.out.println();
        Arrays.toString(List.class.getMethods());


    }
}
