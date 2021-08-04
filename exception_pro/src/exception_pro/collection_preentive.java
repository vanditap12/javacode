package exception_pro;
import java.util.*;
public class collection_preentive
{
 public static void main(String[] args)
 {
     List<Integer> list = new ArrayList<Integer>();

     for (int i = 0; i < 10; i++) // Adding the int primitives type values
     {  
         // If elements are added  using add() method then compiler automatically treats as
         // add(Integer.valueOf(i))
         list.add(i);
         //  This is what compiler does and
         // hence the goal achieved.
         // Print the primitive values
         System.out.println(i);
     }
 }
}
