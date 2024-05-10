import java.util.Scanner;
public class sorting {
    
    //  static int[] selection(int arr[])
    // {
    //       for(int i=0;i<arr.length-1;i++)               //to count the passes
    //       {   
    //           int min_idx=i;      //the place from where i is beginning the part before that is sorted so we assume that i to be the smallest element
    //         for(int j=i+1;j<arr.length;j++)
    //         {
                
    //              if(arr[j]<arr[min_idx])
    //              {
    //                   min_idx=j;       //one swap in one iteration of i
    //              }

    //         }  
    //            int temp=arr[i];
    //               arr[i]=arr[min_idx];              //after execution of these statements value of i changes 
    //               arr[min_idx]=temp;

    //         } return arr;
    //  }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int arr[]={5,3,2,1,4};
    //      selection(arr);
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         System.out.print(arr[i]+" ");
    //      }






    



//     static int[] insertionSort(int arr[],int n)
//     {
//           for(int i=0;i<n-1;i++)     //for taking account of unsorted part
//           {
//                int j=i+1;               // we consider first element as sorted 
//                while(j>0 && arr[j-1]>arr[j])      //for inserting a particular element at its correct position 
//                 {
//                     int temp=arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//                     j--;
//                 }
//                }
//                     return arr;
//             }   
        
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter array size");
//         int n=sc.nextInt();int arr[]=new int[n];
//         System.out.println("enter array elements");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         insertionSort(arr,n);
//         for(int k=0;k<n;k++)
//         {
//             System.out.print(arr[k]+" ");
//         }
//     }
// }







//quick sort

// static void swap(int arr[],int i,int j)
// {
//     int temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }
// static int partition(int arr[],int start,int end)
// {
//     int pivot =arr[end];            //chose the pivot element
//      int i=start-1;int j=start;
//       for(;j<end;j++)
//       {
//         if(arr[j]<=pivot)
//         {
//             i++;
//             swap(arr,i,j);
        
//         }

//       }  
      
//       return i+1;
//     }
// static void quicksort(int arr[], int start,int end)
// {
//     if(start>=end)
//     {
//         return;       //base case 
//     }
//      pi= partition(arr,start,end);    //self work
//     quicksort(arr,start,pi-1);
//     quicksort(arr,pi+1,end);        //recursive work

// }

    
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter array size and elements");
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     for(int i=0;i<n;i++)

//     {
//         arr[i]=sc.nextInt();

//     }

//    quicksort(arr,0,n-1);
//    for(int k=0;k<n;k++)
//    {
//     System.out.print(arr[k]+" ");
//    }
   
// }
// }






//bubble sort 
// static void bubble(int arr[],int n)
// {
//     boolean check=true;
//     for(int i=0;i<n-1;i++)
//     {
//          check=true;
//          for(int j=1;j<n-i;j++)
//          {
//             if(arr[j-1]>arr[j])
//             {
//                 check=false;
//                 int temp=arr[j-1];
//                 arr[j-1]=arr[j];
//                 arr[j]=temp;
//             }
//             if(check==true)
//             return;
//          }
//     }
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter array elements");
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     for(int i=0;i<n;i++)
//     {
//         arr[i]=sc.nextInt();

//     }
//     bubble(arr,n);
//     for(int x:arr)
//     {
//         System.out.print(x+" ");
//     }
// }
// }







static void mergesort(int arr[],int start ,int end)
{
    if(start>=end)
    {                     //base case
       return;
    }
    int mid=(start+end)/2;
    mergesort(arr,start,mid);     //recursive function being called --> expected to sort this given array 
    mergesort(arr,mid+1,end );    // since we need two sorted subarrays we call recursive function two times 
    merge(arr, start,mid,end);    //self work --> combine the two sorted subarrays 
     
}
 static void merge(int arr[],int start, int mid, int end)
 {       
    int n1=mid-start+1;
    int n2=end-mid;
       int leftsubarray[]= new int[n1];
       int rightsubarray[]= new int[n2];
       for(int i=0;i<n1;i++)
       {
           leftsubarray[i]=arr[i];
       }                                    // filling of the two sorted subarrays 
       for(int j=0;j<n2;j++)
       {
          rightsubarray[j]=arr[mid+1+j];
       }
      int i=0;  //points at the left subarray
      int j=0;    // points to the right subarray
      int k=start;
      while(i<n1 && j<n2 )
       {
           if(leftsubarray[i]<rightsubarray[j])
           {
            arr[k++]=leftsubarray[i++];
           }
           else 
           {
            arr[k++]=rightsubarray[j++];
           }
       }
       while(i<n1)
       {
           arr[k++]=leftsubarray[i++];
       }                                                      //these while loops are for the extra elements
       while(j<n2)
       {
         arr[k++]=rightsubarray[j++];
       }
 }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int start=0;int end=n-1;
    mergesort(arr,start,end);
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+" ");
    }
}
}