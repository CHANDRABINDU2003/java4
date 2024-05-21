
package Hash;

import java.util.HashSet;

public class HashSetx {
    public static void main(String[] args) {
        HashSet<String> fruit = new HashSet<String>();
        fruit.add("apple");
        fruit.add("mango");
        for(String x : fruit){
        System.out.println(x);
    }
        System.out.println(" ");
        System.out.println(fruit.size());
        fruit.clear();
        System.out.println(fruit.size());
    boolean value = fruit.isEmpty();
        System.out.println(value);
            
            }
 
}
