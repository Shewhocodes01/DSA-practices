import java.util.Scanner;
  public class recursion2 {
//                                                                 //recursion on arrays 
// static int max(int arr[],int idx)
// {
//   if(idx==arr.length-1)
//   {
//     return arr[idx];            // concept assume first value to be max
//   }
//      return Math.max(arr[idx],max(arr,idx+1));             //self work
// }
// public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   int arr[]=new int[6];
//   System.out.println("enter array elemenst");
//   for(int i=0;i<6;i++)
//   {
//     arr[i]=sc.nextInt();
//   } int idx=0;
//   System.out.println(max(arr,idx));

// }
//  }







// static int ans=0;

// static int sum(int arr[],int idx)
// {
//   if(idx==arr.length-1)
//   {
//     return arr[idx];          //base case
//   }
//     ans=arr[idx]+sum(arr,idx+1);     //self work is to add current value to the sum of entire array returned through recursion
//     return ans;

// }
// public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter array size");
//   int n=sc.nextInt();
//   int arr[]=new int [n];
//   System.out.println("enter array elements");
//   for(int i=0;i<n;i++)
//   {
//     arr[i]=sc.nextInt();
//   }int idx=0;
//   System.out.println(sum(arr,idx));

  

// }
//   }






// static void allidx(int arr[],int x,int idx)
// {
//   if(idx>=arr.length)
//   {
//         return;              // base case 
//   }
//   if(arr[idx]==x)
//   {
//     System.out.println(idx);        //self work
//   }
//   allidx(arr,x,idx+1);
// }

// public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter array elements");
//   int arr[]=new int[7];
//   for(int i=0;i<7;i++)
//   {
//       arr[i]=sc.nextInt();
//   }
//   System.out.println("enter target element");
//   int x=sc.nextInt();
//   int idx=0;
//  allidx(arr,x,idx);
  
// }
//  }



    
  //to return all indexes of an element present in the array 
//   static ArrayList<Integer> allindexes(int arr[],int n,int idx,int x)
//   {
//         if(idx==n)
//         {                                                       //base case to return empty arraylist
//             return new ArrayList<Integer>();
//         }
//         ArrayList<Integer> ans =new ArrayList<>();               //to create an arraylist to store current ans 

//         if(arr[idx]==x)
//         {                                      // self work to add that index in ans 
//                ans.add(idx);
//         }
//         ArrayList<Integer> smallans=allindexes(arr,n,idx+1,x); //recursive work
//          ans.addAll(smallans);
//          return ans;
//   }
   

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int arr[]=new int[5];
//     System.out.println("enter array elements");
//     for(int i=0;i<5;i++)
//     {
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("enter target value");
//     int x=sc.nextInt();
//     int idx=0;
//     ArrayList<Integer> ans=allindexes(arr,5,idx,x);
//     for(Integer i:ans)
//     {
//         System.out.println(i);
//     }
// }
//  }











// static void combo(int arr[],int i)
// {
//     if(i==arr.length)
//     {
//         return;                         //base case
//     }
//         for(int j=i+1;j<arr.length;j++)
//         {
//             System.out.println(arr[i]+" "+arr[j]);          //loop is the self work
            
//         }
//         combo(arr,i+1);                 //to start from the next index --> recursive
//     }




// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter array size");
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     for(int i=0;i<n;i++)
//     {
//         arr[i]=sc.nextInt();
//     }
//     //System.out.println("enter value of r");
//     int i=0;
//     combo(arr,i);
// }
//  }





//assign prob__on__rec4 ques 3 

// static int count=0;
// static int isprime(int n,int k)
// {
//         if(k==1)
//         {  count++;
//           return count;
//         } if(n%k==0)
//         {
//             count++;
//         } 
//         isprime(n,k-1);
//        return count;
// }
// public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter a number");
//   int n=sc.nextInt();
//   int k=n;
//    int ans=isprime(n,k);
//    if(ans==2)
//    {
//     System.out.println("is prime");
//    }
//    else
//    {
//     System.out.println("not prime");
//    }
// }
// }




//ques 4 
// static int binary(int n)
// {   int rem=0;int ans=0;
//    int power=0;
// {    while(n!=0)
//     {
//      rem=n%2;
//     ans+=(rem*Math.pow(10,power));
//     power++;
//      n=n/2;
//     }
//      return ans;
// }
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter number");
//     int n=sc.nextInt();
//    System.out.println( binary(n));

    
// }
// }

//using recursion decimal to binary conversion
// static int ans=0;
// static int binary(int n,int power)
// {     
//      if(n==0)
//      {
//           return ans;           //base case
//      }
//      int rem=n%2;
//       ans+= (rem*Math.pow(10,power));         //ans shouldnt be in int because it will be invalid forced coercion
//      power++;
//      return binary(n/2,power);       //recursive work
    

// }

// public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter number");
//   int n=sc.nextInt();int power=0;
//    System.out.println(binary(n,power));
// }
//   }





  //assign 5 ques 1
//   static int count=0;
//   static int paths(int a[][],int i,int j,int m,int n)         //in starting array gets 0,0 as index
//   {
//          if(i==m-1 && j==n-1)   //reached end point
//          {
//                return 1;
//          }
//          if(i>=m||j>=n)               //index out of bound 
//          {
//           return 0;
//          }
//          return paths(a,i+1,j,m,n)+paths(a,i,j+1,m,n);      //2 recursive calls and + is the self work

//   }
//       public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter dimensions of array");
//     int m=sc.nextInt();
//     int n=sc.nextInt();
//      int arr[][]=new int[m][n];
//      System.out.println(paths(arr,0,0,m,n));                 //starting from top right
//   }
// }


// static void sum(int arr[])
// {
                     
//     if(arr.length==0)
//     {
//       return;                           //base case
//     }
     
//      int a[]=new int [arr.length-1];       //creating new array that will have size one less 
//     for(int i=1;i<arr.length;i++) 
//     {
//          a[i-1]=arr[i]+arr[i-1];
//                                                //each index will hold sum of previous two 
//     }  
  
//     sum(a);     //a is copied to array which becomes old array, a stores sum which is new array
     
//   for(int i=0;i<arr.length;i++)
//   {
//      System.out.print(arr[i]+" ");
     
//   }System.out.println();
// }

// public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("enter array elements");
//   int n=sc.nextInt();
//   int arr[]=new int[n];
//   for(int i=0;i<n;i++)
//   {
//     arr[i]=sc.nextInt();
//   }
//   sum(arr);   
  
// }
// }







//assign 5 ques 2

// static void triangle(int arr[])
// {
     
//    if(arr.length<1)
//    {                            //base case
//     return ;
//    }
//    int arr1[]=new int [arr.length-1];    //new array created

//   for(int i=1;i<arr.length;i++)
//   {
//     arr1[i-1]= arr[i]+arr[i-1];                 //self work
   
//   }
  
//   triangle(arr1);                  //recursive work
//   for(int x:arr)
//   {
//     System.out.print(x+" ");
//   }
// System.out.println();

// }


public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the length of array: ");
                int n = scn.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the elements of array: ");
                for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                }
                System.out.println("Enter r: ");
                int r = scn.nextInt();
                printCombination(arr, n, r);
        }
        public static void printCombination(int[] arr, int n, int r) {
                // A temporary array to store all combination one by one
                int data[]=new int[r];
                // Print all combination using temporary array 'data[]'
                combination(arr, n, r, 0, data, 0);
        }
        public static void combination(int[] arr, int n, int r, int index, int[] data, int i) {
                // Current combination is ready to be printed, print it
                if (index == r) {
                        for (int j=0; j<r; j++)
                                System.out.print(data[j]+" ");
                        System.out.println("");
                        return;
                }
                // When no more elements are there to put in data[]
                if (i >= n)
                        return;
                // current is included, put next at next location
                data[index] = arr[i];
                combination(arr, n, r, index+1, data, i+1);
                // current is excluded, replace it with next (Note that i+1 is passed, but index is not changed)
                combination(arr, n, r, index, data, i+1);
        }
}