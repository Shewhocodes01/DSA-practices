import java.util.Scanner;

public class array3 {
  //   static void swap(int arr[],int left,int right)
//             {    int temp=0;
//                      temp=arr[left];
//                      arr[left]=arr[right];
//                      arr[right]=temp;
                     
//             }
            
//             static void arraysorted(int arr[],int left,int right)
//             {     
//                 while(left<=right)
//                  {  
//                       if(arr[left]%2!=0 && arr[right]%2==0)                         //  two pointer approach
//                 {
//                     swap(arr,left,right);
//                     left++;right--;
//                 }
//                 if(arr[left]%2==0)
//                 {
//                     left++;
//                 }
//                 if(arr[right]%2==1)
//                 {
//                     right--;
//                 }
//             }
//         }
//         static int[]  large(int arr[],int left,int right)
//         {    int ans[]=new int[arr.length] ;
//             int k=0;
//             while(left<=right)
//             {
//             if(Math.abs(arr[left])>Math.abs(arr[right])) 
//             {
//                 ans[k++]=arr[left]*arr[left];
//                 left++;
//             }
//             else{
//                 ans[k++]=arr[right]*arr[right];
//                 right--;
//             }

//         }
//             return ans;

//         }
//         static void printarray(int arr[],int n)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 System.out.println(arr[i]);
//             }
//         }
//              public static void main(String[] args) 
//              {
        
//             Scanner sc=new Scanner(System.in);
//             System.out.println("enter array size");
//             int n=sc.nextInt();
//             int arr[]=new int[n];
//             int left=0;int right=n-1;
//             System.out.println("enter positive negative elements ");
//             for(int i=0;i<n;i++)
//             {
//                 arr[i]=sc.nextInt();
//             }
//                int ans[]=new int[n];
//           //  arraysorted(arr,left,right);
//              ans= large(arr,left,right);
//             printarray(ans,n);
//             sc.close();
//              }
//             }
//}




static int sum=0;
       static int sumarray(int arr[])
       {      
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }return sum;
       }       
    static boolean partition(int arr[],int prefix,int suffix)                    //prefix sum approach
    {
        for(int i=1;i<arr.length;i++)
               {
                    prefix+=arr[i-1];
                    suffix= sum-prefix;
                    if(prefix==suffix)
                    {
                        return true;
                    }
               }return false;
               public static void main(String[] args) 
             {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size");            // 5 elements
            int n=sc.nextInt();
            int arr[]=new int[n];            //0 to 5 index array created
        
            System.out.println("enter array elements ");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            } 
               int sum=sumarray(arr);
               int prefix=0;int suffix= sum;
               System.out.println("ans is"+ partition(arr,prefix,suffix));
              //printarray(arr,n);
              sc.close();
             }
            }
        

