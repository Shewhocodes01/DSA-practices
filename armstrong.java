import java.util.Scanner;
public class armstrong {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int limit=sc.nextInt();
        int t=0,a=0;int sum=0;
        for(int i=1;i<=limit;i++)
        {
            t=i;
            sum=0;
            while(t!=0)
            {
                a=t%10;
                sum+= a*a*a;
                t=t/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }sc.close();
    }
}
