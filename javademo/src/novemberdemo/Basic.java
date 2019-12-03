package novemberdemo;



import java.util.*;
public class Basic {
    public static void main(String[] args) {
        ArrayList array = new ArrayList<>();
        array.add(new String("Subract"));
        array.add('A');
        array.add(new String("from"));
        array.add(256);
        array.add(Double.valueOf((int) 12.79));
        array.add(Integer.valueOf(1048576));
        System.out.println(array);
    }
}