
package set;
import java.util.*;

public class Set {
    
    public static void main(String[] args) {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        HashSet hashset2 = new HashSet();
        hashset.add("1");
        hashset.add("2");
        hashset.add("3");
        hashset1.add("2");
        hashset1.add("3");
        hashset1.add("6");
        hashset.retainAll(hashset1);
        
        
        System.out.println(hashset);

       }
    
}
