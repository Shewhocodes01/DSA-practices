import java.util.*;
public class practice 
{    
    public static void main(String[] args) {
      
    
// static void printinc(int n)
// {
//         if(n==1)                     
//         {
//            System.out.println(1);
//            return;
//          }                          //base case

                     
// System.out.println(n);                      //self work
//    printinc(n-1);
//         }

// public static void main(String args[])
// {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the limit");
//         int n=sc.nextInt();
//         printinc(n);

// }

// static int factorial(int n)
// {
//       if(n==1)
//       {
//         return 1;
//       }
//       return factorial(n-1)*n;
    
      
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     System.out.println(factorial(n));
    




// static int fibo(int n)
// {
//      if(n==1 || n==2 )
//      {
//         return n-1;
//      }   

//     return fibo(n-1)+fibo(n-2);


// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the term to be found");
//     int n=sc.nextInt();
//     System.out.println(fibo(n));



//static int ans=0;



//program to find sum of digits
// static int findsum(int n)
// {
//     if(n/10==0)
//     {
//         return n%10; 
//     }
    
//        ans+=n%10+findsum(n/10);                 //adding the last digit and then reducing the value
//        return ans;
       
      

// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter digit");
//     int n=sc.nextInt();
//     System.out.println(findsum(n));
    




//to find p^q using recursion 

// static int power(int p,int q)
// {
//     if(q==0)
//     {
//         return 1;
//     }
//      return power(p,q-1)*p;
//                                                   //self work



// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter p and q");
//     int p=sc.nextInt();
//     int q=sc.nextInt();
//     System.out.println(power(p,q));
//    static int smallans=0;
// static int power(int p,int q)
// {    if (q==0) 
//      {
//         return 1;
//     }
//     if(q%2==0)
//     {
//         smallans= power(p,q/2);
//         return smallans*smallans;
//     }
//     else{
//          smallans=power(p,q/2);
//          return smallans*smallans*p;

//     }

// }

// static int ans=0;

// static int count(int n)
// {
//     if(n/10==0)
//     {
//        return ++ans;
//     }count(n/10);
//     return ++ans;
   
   
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter number");
//     int n=sc.nextInt();
//     System.out.println(count(n))
// static int pattern(int n)
// {
//     if(n<=0)
//     {
        
//         return n;
        
//     }
//      System.out.println(n);
//     return pattern(n-5);
   
// } 
// static void pattern2(int n,int ans)
// {
//      if(ans>=n)
//      {
//         System.out.println(n);
//         return;
//      }System.out.println(ans);
//      pattern2(n,ans+5);

// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter initial value");
//     int n=sc.nextInt();
//     int ans=pattern(n);                        //storing a negative value
//     pattern2(n,ans);

// static int ans=0;


// static void multiple(int n,int k)
// {
//         if(k==1)
//         {   System.out.println(n);
//             return;
           
//         }  
      
//        multiple(n,k-1);
//        System.out.println(n*k);
      
//        return ;

        
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter number and number of multiples");
//     int n=sc.nextInt();
//     int k=sc.nextInt();
//     multiple(n,k);
// }
// }





// static int ans=0;
// static int armstrong(int n)
// {
//     if(n%10==0)
//     {
//         return 0;
//     }
    
//       ans+=armstrong(n/10)+Math.pow(n%10,3);
//       return ans;


// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter number");
//     int n=sc.nextInt();
//      int ans= armstrong(n);
//      if(ans==n)
//      {
//         System.out.println("armstrong number");
//      }
//      else{
//         System.out.println("not an armstrong number");
//     }
// }
// }



// static int ans=0;
// static int multi(int n,int k)
// {
//     if(k==1)
//     {
//         return n;
//     }
//     ans =multi(n,k-1)+n;
//     return ans ;

// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter n and k");
//     int n=sc.nextInt();
//     int k=sc.nextInt();
//     System.out.println(multi(n,k));
// }
// }



// static int ans=0;


// static int sum(int n)
// {
//     if(n==1)
//     {
//         return 1;
//     }
//     return sum(n-1)+n;
// }
// static int summation(int n,int m)
// {
//       if(m==1)
//       { return  sum(n);
      

//       }
//       ans=summation(summation(n,m-1),1);
//       return ans;
// }


// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter value of n and m");
//     int  n=sc.nextInt();
//     int m=sc.nextInt();
//     System.out.println(summation(n,m));
// }
// }




// static int sum(int n)
// {
//     if(n==1)
//     return 1;
//     if(n%2==1)
//     {
//         return sum(n-1)+n;
        
//     }
//     else{
//          return sum(n-1)-n;
        
//     }
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter limit");
//     int n=sc.nextInt();
//     System.out.println(sum(n));
// }
// }


// static int mod=0;
// static int gcd(int n,int m)
// {
//      while(n%m!=0)
//      {
//            mod=n%m;
//           n=m;
//           m=mod;
//      }
//      return mod;
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter n and m");
//     int n=sc.nextInt();     //big
//     int m=sc.nextInt();
//     System.out.println(gcd(n,m));

// }
// }



// static void pa(int arr[],int idx)
// {
//     if(idx==0)
//     {
//         System.out.println(arr[idx]);
//         return;
//     }
    
//     pa(arr,idx-1);
//      System.out.println(arr[idx]);          //last element we will print 
   

// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int arr[]={10,12,16,19,22,25};
//     int idx=arr.length-1;
//       pa(arr,idx);


// }
// }



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

// static void newarray(int arr[],int n,int r)
// {
//    int data[]=new int[r];
//    combo(arr,n,r,data,0,0);
// }

// static void combo(int arr[],int n,int r,int data[],int index,int i)
// {

//           if(i==r)
//           {
//             for(int j=0;j<r;j++)
//             {
//                System.out.print(data[j]+" ");
//             }
//             System.out.println();
//             return;
//           }
//           if(index>=n)                        //2 base cases for when subset limit is reached                 
//                                          //array possibility limit exceeded
//           {
//             return;
//           }

//          data[i]=arr[index];               //index denotes level
//          combo(arr,n,r,data,index++,i+1);
//          combo(arr,n,r,data,index++,i++);

      
// }

// public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter array elements");
//    int n=sc.nextInt();
//    int arr[]=new int[n];
//    for(int i=0;i<n;i++)
//    {
//       arr[i]=sc.nextInt();
//    }
//    System.out.println("enter value of r");
//    int r=sc.nextInt();
//    newarray(arr,n,r);
      
   
// }

// }






// public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter array length");
//    int n=sc.nextInt();
//    int arr[]=new int[n];
//    for(int i=0;i<n;i++)
//    {
//       arr[i]=sc.nextInt();
//    }
//    System.out.println("enter element");
//    int x=sc.nextInt();
//    for(int i=n-1;i>=0;i--)
//    {
//          if(arr[i]==x)
//          {
//             System.out.println(i);
//             break;
//          }
//    }
// }
// }
// char c= '\u0000';
// System.out.println(c);
// // String d="\0";
// // System.out.println(d);
//     }
// }

}





    

