import java.util.*;
import java.lang.*;
class BubbleSort
{
   int a[],size;                                  //instance variables
  BubbleSort(int n)                                //constructor
  {
     size=n;
     a=new int[size];
  }
  void read()
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter "+size+" elements to sort:");
      for(int i=0;i<size;i++)
            a[i]=in.nextInt();
   }
   void bsort()
   {
      for(int i=0;i<size-1;i++)
      {
                 for(int j=0;j<size-i-1;j++)
                 {
                      if(a[j]>a[j+1])
                      {
                         int temp=a[j];
                         a[j]=a[j+1];
                         a[j+1]=temp;
                      }
                 }
      }
    }
    void display()
    {
     for(int x:a)                                       
        System.out.print(x+"\t");
     System.out.println();
    }
}
class BubbleST
{
     public static void main(String args[])
     {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter size of array to be sorted:");
      int sz=input.nextInt();
      BubbleSort b=new BubbleSort(sz);
      b.read();
      System.out.println("Before sorting:");
      b.display();
      b.bsort();
      System.out.println("After sorting..");
      b.display();
    }
}   

