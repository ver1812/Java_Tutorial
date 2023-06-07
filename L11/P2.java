import java.io.*;
import java.util.*;

class P2{
    public static void main(String[] args) {
        HashSet<String> python = new HashSet<String>();
        python.add("amit");
        python.add("neha");

        HashSet<String> js = new HashSet<String>();
        js.add("amit");
        js.add("sumit");

        // find all names 
        HashSet<String> names = new HashSet<>(python);
        names.addAll(js);
        System.out.println(names);

        // find common names --> amit
        HashSet<String> r2 = new HashSet<>(python);
        r2.retainAll(js);
        System.out.println(r2);


        //find python not js 
        HashSet<String> r3 = new HashSet<>(python);
        r2.removeAll(js);
        System.out.println(r3);

        //find js not python
        HashSet<String> r4 = new HashSet<>(js);
        r4.removeAll(python);
        System.out.println(r4);


    }
}