
    //{ Driver Code Starts
//Initial Template for Java


// import java.util.*;




// //User function Template for Java

// class area {
//      static int closestNumber(int N , int M) {
//         // code here
//        int N1=N;
//        int N2=M;
//        N1=Math.abs(N1);
//        N2=Math.abs(N2);
       
//        int i=N2;
//        while (i < N1 || (i + N2) <= N1)
//        {
//            if(i<N1 && (i+N2)>N1)
//            {
//                if((N1-i)<=(N1-(i+N2)))   //differences are equal
//                {
//                    if(N1==N)
//                    return i;
//                    else return i*-1;
//                }
//                else if(N1-(i+N2)<N1-i)
//                {    if(N1==N)
//                {
//                    return i+N2;
//                }
//                else
//                {
//                    return i*-1;
//                }
               
//            }
//        }i+=N2;
       
//     }return 0;
// }
// }

// public class solution{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter n and m");
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int ans=area.closestNumber(n,m);
//         System.out.println(ans);

//     }

   
        
//     }

    
    

// // import java.util.*;

// // class area {
// //     static int closestNumber(int N, int M) {
// //         int N1 = Math.abs(N);
// //         int N2 = Math.abs(M);

// //         int i = N2;
// //         while (i < N1 || (i + N2) <= N1) {
// //             if (i < N1 && (i + N2) > N1) {
// //                 if ((N1 - i) <= (N1 - (i + N2))) {
// //                     return (N == N1) ? i : -i;
// //                 } else {
// //                     return (N == N1) ? i + N2 : -i;
// //                 }
// //             }
// //             i += N2;
// //         }
// //         return 0; // Return 0 if no valid result is found
// //     }
// // }

// // public class solution {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter n and m");
// //         int n = sc.nextInt();
// //         int m = sc.nextInt();
// //         int ans = area.closestNumber(n, m);
// //         System.out.println(ans);
// //     }
// // }

    




//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
        sc.close();
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    if(n>=3)
	    return a[2];
	    return -1;
    }
}

