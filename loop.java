
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // System.out.println("enter a number");
        // int num=sc.nextInt();
        // int k=0;int rem=0;int sum=0;1
        // while(num!=0)
        // { rem =num%10;
        //     sum+=rem;
        //     num =num/10;
            
        //     k= k+1;
        // }
        // System.out.println("the number of digits is"+k);
        // System.out.println("the sum of digits is"+sum);



        // reversing the digits of a number
        // int num=sc.nextInt();
        // int rev=0,rem=0;
        //   while(num!=0)
        //  {
        //     rem=num%10;
        //      rev=rev*10+rem;
        //      num=num/10;
        //   }
        //   System.out.println("the reverse ddigit is"+rev);



        //printing factorial upto first n numbers
        // System.out.println("enter the number");   
        // int num = sc.nextInt();
        // int i=0;int pro=1;int k=0;
        // for( i=1;i<=num;i++)
        // {
        
        //   for(k=1;k<=i;k++)
        //   {
        //     pro*=k;
        //   }
        
          
        //   System.out.println("the factorial of "+i +"is"+pro);
        //   pro=1;
        // }


        //exponent 
  //       System.out.println("enter the value of a and b");
  //       int a =sc.nextInt();
  //       int b= sc.nextInt();int value=1;
  //       for(int i=1;i<=b;i++)
  //       {
  //         value=value*a;

  //       }        
  // System.out.println("the value is:"+value);sc.close();

// int num=sc.nextInt();
// int rem=0;int sum=0;
// while(num!=0)
// {
//   rem=num%10;
//   sum=sum+rem;
//   num=num/10;
// }
// System.out.println(sum);





// System.out.println("enter a number");
// int n=sc.nextInt();
// if(n%15==0)
// {
//   System.out.println("not matching the required condition");
// }
// else if(n%3==0 || n%5==0)
// {
//   System.out.println("no is divisible by 5 or 3 but not by fifteen");
// }
// else
// {System.out.println("not matching required condition");
//     }



// if(n%15!=0 && (n%3==0 || n%5==0))
// {
//     System.out.println("number is divisible by 3 or 5 but nor by 15");
// }
// else{
//   System.out.println("not matching the required condition");
// }





// System.out.println("enter month no");
// int n=sc.nextInt();
// if(n>=1 && n<=7)
// {
//   if(n==2)
//   {
//     System.out.println("28 or 29");
//   }
//   else if(n%2==1)
//   {
//     System.out.println("31");
//   }
//   else
//   {
//     System.out.println("30");
//   }

// }
// else if(n>=8 && n<=12 )
// {
//   if(n%2==0)
//   {
//     System.out.println("31");
//   }
//   else{
//     System.out.println("30");
//   }
// }
// else 
// {
//   System.out.println("invalid input ");
// }

// System.out.println("emter month no");
// int n=sc.nextInt();
// if(n==1|| n==3|| n==5||n==7||n==8||n==10||n==12)
// {
//   System.out.println("31");
// }
// else  if(n==4||n==6||n==9||n==11)
// {
//   System.out.println("30");
// }
// else
// {
//   System.out.println("28 or 29");
// }


// int n=sc.nextInt();
// int sum=0;
// while(n>0)
// {
//   sum=sum+n;
//   n--;
// }
// System.out.println("sum of first n numbers "+sum);      //we can use direct sum formula to optimize the code 




int a=24;
int b=-12;
System.out.println( a/b);
  }
   
}
