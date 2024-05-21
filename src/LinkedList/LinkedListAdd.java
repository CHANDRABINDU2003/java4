
package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<String> country= new LinkedList<String>();
        country.add("bangladesh");
        country.add("india");
        country.add("brazil");
        country.add("pakistan");
        country.add(2, "element");
        country.addFirst("Japan");
        country.addLast("nepal");
        country.remove(4);
       
        country.remove("india");
        Scanner sc = new Scanner(System.in);
        for(String x : country){
            System.out.println(x);
        }
    }
}
