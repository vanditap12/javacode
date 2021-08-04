package exception_pro;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
  
class Arraylist_array {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
  // 1.Using T[] toArray(T[] a)
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
        for (Integer x : arr)
            System.out.print(x + " ");
       //2.Using Object[] toArray() method
        Object[] objects = al.toArray();
        for (Object obj : objects) // Printing array of objects
            System.out.print(obj + " ");
    }
}

