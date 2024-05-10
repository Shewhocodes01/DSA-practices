import java.util.*;
 class check {
  
  static void display(String name,int acc_no,String acc_type)
  {  
     System.out.println("Name of customer"+name);
     System.out.println("Account number"+acc_no);
     System.out.println("Account type"+acc_type);
    
        
    }
    static void deposit(double balance,double depoAmt)
    {
       balance+=depoAmt;
       System.out.println("Available balance"+balance);
    }
    static void withdraw(double balance,double withdrawAmt)
    {
      if(balance<withdrawAmt){
        System.out.println("insufficient balance");}
        else{
          balance-=withdrawAmt;
          System.out.println("Available balance"+balance);
        }
      }
    }

  public class Main{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter name,acc number and acc type");
        String name=sc.next();
        int acc_no=sc.nextInt();
        String acc_type=sc.next();
        Main.display(name,acc_no,acc_type);
        withdraw();



    }
  }
    
}
