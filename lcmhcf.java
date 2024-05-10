public class lcmhcf {
    System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ans=1;int i=2;
    while(a!=1 || b!=1)
    {
        while(a%i==0 || b%i==0)
        {   if(a%i==0)
            {  
            a=a/i;
            }
            if(b%i==0)
            {
                b=b/i;
            
            }ans*=i;
        }i++;
        
    }
    System.out.println("lcm is"+ans);
}


long hcf=1;
//         if(A<=B)
//         {
//             for(long i=1;i<=A;i++)
//             {
//                 if(A%i==0 && B%i==0)
//                 {
//                     if(i>hcf)
//                     {
//                         hcf=i;
//                     }
//                 }
//             }a[1]=hcf;