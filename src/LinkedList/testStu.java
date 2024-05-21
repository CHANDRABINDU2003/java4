
package LinkedList;

import java.util.LinkedList;
public class testStu {
    public static void main(String[] args) {
        LinkedList<StudentsInf> list= new LinkedList<StudentsInf>();
         StudentsInf s1 = new StudentsInf(1,"udita","eleven");
         StudentsInf s2 = new StudentsInf(2,"udita","eleven");
         StudentsInf s3 = new StudentsInf(3,"udita","eleven");
         StudentsInf s4 = new StudentsInf(4,"udita","eleven");
         
          list.add(s1);
         
           list.add(s2);
         
            list.add(s3);
         
             list.add(s4);
             for(StudentsInf x : list){
                 System.out.println(x.id+" "+x.name+" "+x.session);
             }
         
    }
}
