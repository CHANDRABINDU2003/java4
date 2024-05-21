
package Hash;

import java.util.HashMap;
public class HashMapx {
    public static void main(String[] args) {
        HashMap<Integer,String> customer = new HashMap<Integer , String>();
        customer.put(101," value1");
         customer.put(102," value2");
          customer.put(103," value3");
           customer.put(104," value4");
           System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        //see this answer properly
        System.out.println(customer.get(106));
        
    }
  
}
