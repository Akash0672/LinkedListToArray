import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListToArray {

    

    public static void main(String[] args) 
    {
        

        System.out.print("Enter N : ");
        Scanner sc=new Scanner(System.in);
        int nranked=sc.nextInt();
        System.out.print("Enter P : ");
        int pleft=sc.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.print("ranked : ");
        for(int i=0;i<nranked;i++)
        {
            linkedList.add(sc.nextInt());
        }
        System.out.print("Enter left : ");

        for(int i=0;i<pleft;i++)
        {
            
        }

        
        Integer[] array = linkedList.toArray(new Integer[0]);

        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
    }
}