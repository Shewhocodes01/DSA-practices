import java.util.Scanner;
 class testing {
    public static long fibonacci(long n)
    {

    
    long a=1,b=0;long c=0;

    while(n>0)
    {
         c=a+b;
        a=b;b=c;
        n--;

    }return c;
}
 }

public class  primpalin
{


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number");




    long n=sc.nextLong();
    long ans=testing.fibonacci(n);
    System.out.println(ans);
}
}
   //             int n=sc.nextInt();int count =0,rev=0,rem=0;
//             int num=n;
//             while(n!=0)
//             {
//                  rem= n%10;
//                 rev=rev*10+rem;
//                 n=n/10;
//             }
//             if(rev==num)
//             {
//                 for(int i=1;i<=num;i++)
//                 {
//                     if(num%i==0)
//                     {
//                         count++;
//                     }

//                 }
//                 if(count==2)
//                 {
//                     System.out.println("number is prime palindrome");
//                 }
//             }sc.close();
//         }
//     }
