import java.util.*;
public class SelectionSort1
{ 
static void selectionSort(int[] a)
{
    int n =a.length;
    int k;
    for (int i = 0; i < n - 1; i++) 
    {    int Index=i;
        for(int j=i+1;j<n;j++)
        {
            if (a[Index] > a[j]) 
            { 
                Index=j;
            }
        }
                k = a[Index];
                a[Index] = a[i];
                a[i]=k;
            
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
    selectionSort(a);
    System.out.print(" array after sortingggg: ");
    for(int i=0;i<a.length;i++)
    {

        System.out.print(a[i] + " ");
    }
        long endTime = System.currentTimeMillis();

    long timeTaken = (endTime - startTime)/1000;
    System.out.println("\ntime in Seconds is : "+timeTaken);
}

}