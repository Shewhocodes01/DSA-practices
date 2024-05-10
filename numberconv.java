import java.util.Scanner;
public class numberconv {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // System.out.println("enter the binary number");
        // int num=sc.nextInt();int dec=0,pow=1,rem=1;
        // while(num!=0)
        // {
        //     rem=num%10;
        //     rem*=pow;
        //     dec+=rem;
        //     pow=pow*2;
        //     num=num/10;
        // }
        //        System.out.println("the decimal value of number is:"+dec);



        //decimal to binary conversion 
        System.out.println("enter the decimal number");
        int num=sc.nextInt();int pow=1;int bin=0;
        while(num!=0)
        {
        int rem=num%2;
          rem=rem*pow;     
            bin+=rem;
            num=num/2;
            pow*=10;
        }
      System.out.println("the decimal conversion is:"+bin);
    }
}   
        
        




        