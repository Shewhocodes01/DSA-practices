import java.util.Scanner;
public class assign1
{  
     public static void main(String[] args) {
     
    

    Scanner sc=new Scanner(System.in);
    // double f=1.53;
    // float a;
    //  a=float(f);
    // to print ascii value of a character
    //int a=   'c';   //by implicit type casting char value will be promoted to int 
    
    //System.out.println("the value of character is"+a);




    // taking input problems
//     System.out.print("enter name");
//     System.out.print("enter roll no.");
//     System.out.print("enter field of interest");
//      System.out.println("");



// swapping values without third variable
   // int a= 12;
   // int b=20;
   // a=a+b;
   // b=a-b;
   // a=a-b;
   // System.out.println("value of a="+a);
   // System.out.println("value of b="+b);


   //  while(true)
   //  {
   //     System.out.println("enter positive no.");
   //     int a=sc.nextInt();
   //     if(a<0)
   //     {System.out.println("number entered is negative");
   //     continue;}
   //     System.out.println(a);


   // //switch case program
   // System.out.println("enter 1 for addition, 2 for sub , 3 for mult, 4 for div");
   // int op= sc.nextInt();
   // System.out.println("enter two numbers");
   // int a=sc.nextInt();
   // int b=sc.nextInt();
   // switch(op)
   // {
   //    case 1: System.out.println(a+b);break;
   //    case 2:System.out.println(a-b);break;
   //    case 3: System.out.println(a*b);break;
   //    case 4 :System.out.println(a/b);break;
   //    default: System.out.println("tahnkyou ");
   // }


   //conversion of marks to grades 
   // System.out.println("enter your marks");
   // int marks=sc.nextInt();
   // if(marks>90 && marks<=100)
   // {
   //    System.out.println("grade is a+");    //optimized approach is to make just 1 comparison 
   // }
   // else if (marks>80 && marks<=90)
   // {
   //    System.out.println("grade is a");
   // }


   // fibonacci
   // System.out.println("enter number of terms");
   // int n=sc.nextInt();int a=-1,b=1,count=1;
   // while(count<=n)
   // {   int c=a+b;
   //    System.out.print(c+" ");
   //    a=b;
   //    b=c;
   //    count++;

   // }
  

   // //to calculate factorial

   // System.out.println("enter number");
   // int n=sc.nextInt();int pro=1;
   // for(int i=n;i>=1;i--)
   //  {
   //    pro=pro*i;
   //  }
   // System.out.println("the factorial is "+pro);


   //program to check armstrong numbers

   //System.out.println("enter the number");
   // System.out.println("enter the limit");
   // int limit =sc.nextInt(),sum=0,cube=1,rem=0,n=0;
   // for(int num=1;num<=limit;num++)
   // { 
   //    sum=0;
   //    n=num;
   // while(n!=0)
   // {
   //    rem=n%10;
   //    cube= rem*rem*rem;
   //    sum+=cube;
   //    n=n/10;
   // }  if(sum==num)
   // {
   //    System.out.println(sum);
   // }



   
//    // printing triangular prism of prime numbers    //HARD
//     System.out.println("enter number of lines");
//     int n=sc.nextInt(),count=0,number=2;
//     //for(int m=1;m<=n;m++)
//    //{
//     for(int i=1;i<=n;i++)
//     {
//        for(int k=1; k<=n-i ;k++)
//        {                            //printing spaces
//        System.out.print(" ");
//     } 
//     for(int k=1;k<=i;)
//     {
//      for(int j=1;j<=number;j++)   //loop for finding prime no.
//      {
//         if(number%j==0)           //to find required prime nos and print them
//         {
//           count++;
//         }

//     }
//     if(count==2)
//      {
//         System.out.print(number+" "); 
//         k++;  
//     }
//      number+=1;
//       count=0;
//   }
//     System.out.println();
    
  // } 
 // }
// }
// }
  
   
   





 //CHECK WHETHER A PRIME NO CAN BE EXPRESSED AS SUM OF 2 PRIME NO
//  System.out.println("enter a number");
//  int num=sc.nextInt();int count=0;
//  for(int k=1;k<=num-2;k++)
//  {
//        if((num-2)%k==0)
//        {
//          count++;
//        } 
      
//  }if(count==2)
//  {
//    System.out.println("number can be expressed");
//  }
//  else{
//    System.out.println("number cant be expressed");
//  }







//alphabet barfi 
System.out.println("enter no of rows");
int row=sc.nextInt();
for(int i=1;i<=row;i++)
{
  for(int k=1;k<=row-i;k++)
  {
    System.out.print(" ");
  }char c='A';
  for(int j=1;j<=2*i-1;j++)
  {
    System.out.print(c);
    c++;
  }System.out.println();
}
for(int r=row-1;r>=1;r--)
{
  for(int k=1;k<=row-r;k++)
  {
    System.out.print(" ");
  }char c='A';
  for(int j=1;j<=2*r-1;j++)
  {
  System.out.print(c);
  c++;
  }System.out.println();
}
}
}











