import java.util.Scanner;
public class twodarray {
    // static void transpose(int matrix[][],int r,int c)
    //     {
    //     for(int i=0;i<r;i++)
    //     {
    //         for(int j=i;j<c;j++)
    //         {    int temp=matrix[i][j];
    //              matrix[i][j]=matrix[j][i];
    //              matrix[j][i]=temp;
    //         }
    //     }
    // }
    //   static void swap(int arr[],int start,int end)
    // {
    //           int temp=arr[start];
    //           arr[start]=arr[end];
    //           arr[end]=arr[temp];
    // }
//    static void reverse(int arr[])
//    {
//      int start=0;int end=arr.length-1;
//      while(start<end)
//      {
//        int temp=arr[start];
//               arr[start]=arr[end];
//                arr[end]=temp;
//         start++;end--;
//      }
//    }


   static void print(int arr[][])
   {
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(arr[i][j]);
            }System.out.println(" ");
         }
   }



   static void pascal(int [][]ans,int n)
   {
   for(int i=0;i<n;i++)
{     ans[i]=new int[i+1]; 
    ans[i][0]=ans[i][i]=1;  //rows n columns both r defined
    for(int j=1;j<=i-1;j++)
    {      
          ans[i][j]=ans[i-1][j]+ans[i-1][j-1];

    }
}
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter no of rows and columns of matrix");               //for transpose matrix is square
        // int n=sc.nextInt();
        // int m[][]=new int[n][n];
        // System.out.println("enter elements");
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         m[i][j]=sc.nextInt();
        //     }
        // } print(m);  
        //  transpose(m,n,n);
        //   for(int i=0;i<n;i++)
        //   {
        //       reverse(m[i]);
        //  }
        //  print(m);


    






//pascal triangle 
System.out.println("enter number of rows");
int n=sc.nextInt();
int ans[][]=new int[n][];

pascal(ans,n);
print(ans);
        }
    }


