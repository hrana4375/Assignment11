
package set;
import java.util.*;
public class Hash_Map {
    public static void main(String args[]) {
        Map hashmap = new HashMap(); 
        hashmap.put("abc", 100);
        hashmap.put("xyz", 200);
        hashmap.put("pqr", 500);
        
        System.out.println(hashmap+"\n");
        
        hashmap.remove("abc");
        System.out.println(hashmap+"\n");
        
        HashSet hs= new HashSet(hashmap.entrySet());
        System.out.println(hs+"\n");

        if((hashmap.containsKey("abc")==true))
            System.out.println("Exists");
        else
            System.out.println("Not Exists");
    }
    
}
