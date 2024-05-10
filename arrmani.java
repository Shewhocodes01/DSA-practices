
// import java.util.Scanner;


// public class arrmani {
    
                                          
                                                                           
       
//   public static void swap(int arr[],int i,int j)
// {   
    
//      int temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
    
// }static void reverse(int[]arr,int i,int j)
//         {
//           while(i<j)
//         {                                                //to swap array in place 
//         swap(arr,i,j);
//         i++;j--;
//          }
//         }

// public static void print(int arr[])
// {
//   for(int x:arr)
//   {
//     System.out.println(x);
//   }
// }


//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter array size");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("enter array elements");
//         for(int i=0;i<n;i++)
//         {                                                     //to rotate array in place
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("enter number of steps of rotation");
//         int k=sc.nextInt();
//         k=k%n;
        
//         reverse(arr,0,n-k-1);
//         reverse(arr,n-k,n-1);
        
//         reverse(arr,0,n-1);
        
        
        
//          print(arr);
// }
// }
    


// static int large=0;
//   public static int array(int arr[])
//   {large=Integer.MIN_VALUE;
    
//        for(int i=0;i<arr.length;i++)
//        {
//             if(arr[i]>large)
//             {
//                 large=arr[i];
//             }
//        }return large;
// int ans=array(arr);      //stores largest value 
        // for(int i=0;i<arr.length;i++)
        // {                                                   //second largest element
        //     if(arr[i]==ans)
        //     {
        //         arr[i]=Integer.MIN_VALUE;
        //     }
        // }
        //   ans=array(arr);
        // System.out.println("the second largest element is"+ans);
        
       
           
  
import java.util.Scanner;


public class arrmani
{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
       System.out.println("enter number of queries");
       int q=sc.nextInt();
       int frearray[]=new int[100007];
       for(int x:arr)
       {
             frearray[x]++;                      //traversing the array elements and manipulating frearray
       }
       while(q>0)
       {
             System.out.println("enter number to be searched");
             int number=sc.nextInt();
             if(frearray[number]>0)
             {
              System.out.println("yes");
             }
             else{
              System.out.println("no");
             }q--;
       }
}
}  
    



// System.out.println("enter the value of target sum");
// int target=sc.nextInt();
// System.out.println("enter the length of array");
// int len=sc.nextInt();
// int arr[]=new int[len+1];
// int count=0;
// System.out.println("enter elements");
// for(int j=0;j<len;j++)                                //target sum
// {
//     arr[j]=sc.nextInt();
// }
// for(int i=0;i<len;i++)
// {
//     for(int k=i+1;k<len;k++)
//     {
//          if((arr[i]+arr[k])==target)
//          {
//             count++;
//          }
//     }
// }

// System.out.println("the number of pairs is:"+count);


  


        
        




        



    



    


       
    
    //PROBLEMS ON ARRAYS ASSIGN 1 
    // Scanner sc=new Scanner(System.in);
    // System.out.println(" enter no of elements in array");
    // int n=sc.nextInt();
    // int arr[]=new int[n];
    
    // System.out.println("enter difference value");
    
    // int x=sc.nextInt(),ans=0;
    // System.out.println("enter elements");
    // for(int i=0;i<arr.length;i++)
    // {
    //   arr[i]=sc.nextInt();
    // }
    // Arrays.sort(arr);
    // for(int k=0;k<arr.length;k++)
    // {
    //   for(int m=1;m<arr.length;m++)
    //   {
    //     if(Math.abs(arr[k]-arr[m])==x)
    //     {
    //           ans=1;
    //     }
    //   }if(ans==1)
    //   System.out.println("yes");
    //   break;
    // }
    // if(ans==0)
    // System.out.println("no");






    //TO FIND MISSING VALUE   assign ques 3
    // System.out.println(" enter no of elements in array");
    //  int n=sc.nextInt();int ans=0;
    //  int arr[]=new int[n];
    // System.out.println("enter elements");
    //  for(int i=0;i<n;i++)
    //  {
    //    arr[i]=sc.nextInt();
    //  }
    //  for(int i=1;i<n;i++)
    //  {
    //       for(int k=0;k<n;k++)
    //       {
    //         if(arr[k]==i)
    //         { ans=-1;
    //           break;
    //         }
    //       }
    //     if(ans!= -1);
    //     {
    //       System.out.println("the missing element is"+i);break;
    //     } 
    //  }
     



  //   System.out.println(" enter no of elements in array");
  //   int n=sc.nextInt();int ans=0;
  //   int arr[]=new int[n];
  //   System.out.println("enter elements");
  //    for(int i=0;i<n;i++)
  //    {
  //     arr[i]=sc.nextInt();
  //  }
  //   for(int i=1;i<n;i++)
  //    {
  //        for(int k=0;k<n;k++)
  //         {
  //          if(arr[k]==i)
  //          { ans=-1;
  //            break;
  //        }
  //        }
  //      if(ans!= -1);
  //       {
  //         System.out.println("the missing element is"+i);break;
  //      } 
  //   }


// 


    
    //sc.close();
    
    
    
          
    //  }
     
  //}
    

