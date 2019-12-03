package novemberdemo;
import java.util.*;  
class LinkedHashSetD{  
 public static void main(String args[]){  
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("a");    
               set.add("b");    
               set.add("c");   
               set.add("d");  
               set.add("e");  
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
 }  
}  
