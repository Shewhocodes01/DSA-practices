
   //poa 2 assign
    // System.out.println("enter array size of a and b");
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
    //     int a[]=new int[n];
    //     int b[]=new int[m];
    //     System.out.println("enter array elements");
    //     for(int i=0;i<n;i++)
    //     {
    //         a[i]=sc.nextInt();
    //     }
    //     for(int i=0;i<m;i++)
    //     {
    //         b[i]=sc.nextInt();
    //     }
    //     int common=0;
    //     for(int i=0;i<m;i++)
    //     {
    //         for(int j=0;j<n;j++)
    //         {
    //             if(b[i]==a[j])
    //             {
    //                 common++;
    //             }
    //         }
    //     }
    //     int ans=(n+m)-common;
    //     System.out.println("the number of elements in union set is:"+ans);
    // }
//}




// int s=arr[0];int count=0;
//  for(int i=0;i<n;i++)
//  {   int j=i+1;                                                      // to return subarray for given sum
//     s=arr[i];
//       while(s<sum && j<n)     
//       {
//         s=s+arr[j];
//         j++;
//       if(s==sum)
//       {
//         System.out.println("given indexes"+ i+(j-1));
//         count++;
//       }}
//       if(count>0)
//       {
//             break;
//       }
    
//     }



// int arr1[]=new int[n];
//        for(int i=1;i<=n;i++)
//        {                                //for storing integers in array 1 
//         if(arr1[i-1]==i)
//         {
//           arr1[i-1]==-1;
//         }
//       }
     
     
//            for(int j=0;j<n;j++)
//            {
//             if(arr1[j]!=-1)
//             {

            
//             System.out.println("missing element is"+arr1[j]);
//            }
// }


// }
// }


//poa 3 ques 1 

import java.util.Scanner;



public class arrassign2
{
    Scanner sc=new Scanner(System.in);
     System.out.println("enter array size");
     int n=sc.nextInt();
     System.out.println("enter value of m");
     int m=sc.nextInt();
     int arr[]=new int [n];
     for(int i=0;i<n;i++)
     { 
        arr[i]=sc.nextInt();
     }    int count=0;
      for(int j=1;j<n;j++)
      {
            if(arr[i]!=arr[i-1])
            {
                count++;
            }
      }      if(count>=m)
      {
        System.out.println("yes");

      }  else{
        System.out.println("no");
      }
       }


//ques 2
//        Scanner sc=new Scanner(System.in);
// System.out.println("enter array size");
// int n=sc.nextInt();
// int arr[]=new int[n];
// for(int i=0;i<n;i++)
// {
 //   arr[i]=sc.nextInt();}
// }int count=0;
// for(int j=1;j<n;j++)
// {
//     arr[j]=arr[j-1]+arr[j];
    
// }
// for(int j=n-1;j>=0;j--)
// {
//     if(arr[j]%2==1)    //no odd
//     {   count++;
//         for(int k=0;k<j;k++)
//         {
//             if(arr[k]%2==0)
//             {                   //even no
//                   count++;       //odd-even
//             }
//           }  }
//         else if(arr[j]%2==0)    //even no
//         {  
//             for(int k=0;k<j;k++)   
//             {     
//                 if(arr[k]%2==1)   //even -odd
//                 {
//                     count++; 
//                 }
//             }
//         } 
    
// }
// System.out.println("no of subarrays is"+count);






