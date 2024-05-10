import java.util.Scanner;

public class recursion {
    


// static int factorial(int n)
// {
//         if(n==0)
//         {                                                        
//             return 1;
//         }
//            //recursive work
//          return factorial(n-1)*n;
         


// }
// public static void main(String[] args) {
//    System.out.println( factorial(5));
// }
// }



// static int fibonacci(int n)
// {
//      if(n==0)
//      {                              //base case 
//         return 0;
//      }
//      if(n==1)
//      {
//         return 1;
//      }
//                   //recursive work
//      return fibonacci(n-1)+fibonacci(n-2);                //self work



// }                                                                    //fibo

// public static void main(String[] args) {
//    System.out.println( fibonacci(6));
// }
// }








// static int ans=0;

// static int count(int n)                             //to return count of digits
// {
//     if(n/10==0)
//     {
//        return ans++;
//     }count(n/10);
//     return ans++;
   
   
// }
// public static void main(String[] args) {                    //take care of increment oprators
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter number");
//     int n=sc.nextInt();
//     System.out.println(count(n)+1);
// }
// }









static void multiple(int n,int k)
{                                                                   //to return k multiples 
        if(k==1)
        {   System.out.println(n);
            return;
           
        }  
      
       multiple(n,k-1);
       System.out.println(n*k);
      
       return ;

        
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number and number of multiples");
    int n=sc.nextInt();
    int k=sc.nextInt();
    multiple(n,k);
}
}






// static int ans=0;
// static int armstrong(int n)
// {
//     if(n%10==0)
//     {
//         return 0;
//     }
    
//        ans+=armstrong(n/10)+Math.pow(n%10,3);
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





static int ans=0;
static int multi(int n,int k)
{
    if(k==1)
    {
        return n;
    }
    ans =multi(n,k-1)+n;                                    //to return n*k
    return ans ;

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n and k");
    int n=sc.nextInt();
    int k=sc.nextInt();
    System.out.println(multi(n,k));
}
}








//assign ques 1 
   static int pattern(int n)
{
    if(n<=0)
    {
        
        return n;
        
    }
     System.out.println(n);
    return pattern(n-5);
   
} 
static void pattern2(int n,int ans)
{
     if(ans>=n)
     {
        System.out.println(n);
        return;
     }System.out.println(ans);
     pattern2(n,ans+5);

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter initial value");
    int n=sc.nextInt();
    int ans=pattern(n);                        //storing a negative value
    pattern2(n,ans);

    
}
}





//assign ques 2
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





static int sum(int n)
{
    if(n==1)
    return 1;
    if(n%2==1)              //series sum 1-2+3-4
    {
        return sum(n-1)+n;
        
    }
    else{
         return sum(n-1)-n;
        
    }
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter limit");
    int n=sc.nextInt();
    System.out.println(sum(n));




