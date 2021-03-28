import java.util.HashSet;

import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet <Double> hash = new HashSet<Double>();
        hash.add(20.0);
        hash.add(20.0);
        Iterator h = hash.iterator();
        while(h.hasNext()){
            System.out.println(h.next());
        }
        //only one 20.0 , no duplicate elements
    }
}
