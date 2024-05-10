import java.util.Scanner;
public class binarysearch {



     static boolean binsearch(int arr[],int start,int end ,int target)
     {       
        int mid=0;
        while(start<=end)
        {
              mid=(start+end)/2;
             if(target==arr[mid])
             {
                return true;
             }  
             else if(target<arr[mid])
             {
                end=mid-1;
             }
             else if(target>arr[mid])
             {
                start=mid+1;
             }
     }  return false;
    }







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
        System.out.println("enter target element");
        int target=sc.nextInt();
        
        System.out.println(binsearch(arr,0,n-1,target));
    }
    
}
