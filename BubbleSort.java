import java.util.*;
public class BubbleSort
{ 
static void bubbleSort(int[] a)
{
    int n =a.length;
    int k = 0;
    for (int i = 0; i < n - 1; i++) 
    {  
        for (int j = 0; j < n - i - 1; j++)
         {
            if (a[j] > a[j + 1]) 
            {
                k = a[j];
                a[j] = a[j + 1];
                a[j + 1]=k;
            }
        }
    }
}

    public static void main(String args[])
    {
         Scanner sc =new Scanner(System.in);
         System.out.print(" enter the number : ");
        int n = sc.nextInt();
        int a[]= new int[n];
        System.out.println("enter" + n + "integer");
        long startTime = System.currentTimeMillis();
        for(int i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
         System.out.print(" array before sortingggg: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        } 
         System.out.println();
    bubbleSort(a);
    System.out.print(" array after sortingggg: ");
    for(int i=0;i<a.length;i++)
    {

        System.out.print(a[i] + " ");
    }
        long endTime = System.currentTimeMillis();

    long timeTaken = endTime - startTime;
    System.out.println("\ntime in milliseconds is : "+timeTaken);
}

}