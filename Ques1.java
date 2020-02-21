//Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques1 {
    
    
    public static void main(String[] args) {
        
        List<Float> list = new ArrayList<>();
        Float sum = 0.0F;
        
        list.add(23.56F);
        list.add(678.35F);
        list.add(2322.56F);
        list.add(1.56F);
        list.add(111.99F);
        
        Iterator<Float> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            
            float f = iterator.next();
            sum += f;
            
        }
        System.out.println(sum);
    }
    
    
}
