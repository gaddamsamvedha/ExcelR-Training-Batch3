import java.util.HashSet;

public class Demo031 {
        public static void main(String[] args) {
   
        HashSet<Object> set = new HashSet<>();
        
        set.add(10);         
        set.add("Hello, World!");   
        set.add(3.14);    
        set.add(true);          
        set.add('A');               
      
        for (Object obj : set) {
            System.out.println(obj);
        }
    }
}
