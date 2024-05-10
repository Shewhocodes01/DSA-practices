import java.util.Scanner;
public class nestedloops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //rectangular pattern
        // for(int i=1;i<=4;i++)
        //  {
        //     if(i==1||i==4)
        //     { for(int k=1;k<=6;k++)
        //         {
        //         System.out.print("*");
        //         }
        //         System.out.println("");
        //     }
            
        //     else if(i==2|| i==3)
        //     { 
        //         for(int k=1;k<=6;k++)
        //         {
        //              if(k==1 || k==6)
        //             System.out.print("*");
        //             else{
        //                 System.out.print(" ");
        //             }
                    
        //         }
        //         System.out.println("");
        //     }
          

        //triangular pattern
        // for(int i=4;i>=1;i--)
        // {    
        //     for(int k=i;k>=1;k--)
        //     {
        //     System.out.print("*");
        //     }

        
        // System.out.println();
        // }


        //printing triangular prism
        // System.out.println("enter the number of rows and columns ");
        // Scanner sc=new Scanner(System.in);
        // int row= sc.nextInt();
        // int m=1;
        // for(int i=row;i>=1;i--)
        // { 
        //     for(int k=1;k<=i;k++)
        //     {
        //         if(k!=i)
        //         System.out.print(" ");
        //         else if(k==i)
        //         { for(int l=1;l<=m;l++)
        //             {
        //                 System.out.print("*");
        //             }
        //             System.out.println();
        //             m=m+2;
        //         }
         //   }


         //numerical rectangular pattern
        //  System.out.println("enter number of rows");
        //  int row=sc.nextInt();
        //  for(int i=1;i<=row;i++)
        //  {
        //       //for printing forward nos
        //        for(int k=i;k<=row;k++)
        //        {
        //         System.out.print(k);
        //        }
        //        //for printing reverse nos 
        //        for(int m=1;m<= i-1;m++)
        //        {
        //        System.out.print(m);
        //        }
        //        System.out.println();
        //  }



        //new pattern binary
       // System.out.println("enter number of rows");
       // System.out.println("enter number of columns ");
        //int row=sc.nextInt();int column=sc.nextInt();
        // for(int i=1;i<=row;i++)
        // {
        //    if(i%2!=0)
        //    { 
        //     for(int k=1;k<=column;k++)
        //     {
        //         if(k%2==0)
        //         System.out.print("2");
        //         else
        //         System.out.print("1");
        
        //     }
                
        //    }
        //    {
        //     if(i%2==0)
        //     {
        //         for(int k=1;k<=column;k++)
        //          {
        //             if(k%2!=0)
        //             {
        //                   System.out.print("2");
        //             }
        //             else{
        //                 System.out.print("1");
        //             }
        //          }
        //     }
        //     System.out.println("");
        //    }
        // }

        //SMART METHOD 
        // for(int i=1;i<=row;i++)
        // {
        //     for(int j=1;j<=column;j++)
        //     {
        //            if((i+j)%2==0)
        //            {
        //             System.out.print("1");
        //            }
        //            else{
        //             System.out.print("2");
        //            }
        //     }

        //     System.out.println(" ");
        // }


        //TRIANGULAR PRISM WITH NUMBERS
            //  System.out.println("enter the number of rows");
            //  {
            //         int row = sc.nextInt();
            //         for(int i=1;i<=row;i++)
            //         {
            //             for(int k=1;k<=row-i;k++)     //loop for spaces
            //                { 
            //                 System.out.print(" ");

            //                }
            //                for(int k=1;k<=i;k++)    //loop for printing forward nos
            //                {
            //                   System.out.print(k);

            //                }
            //                for(int k=i-1;k>=1;k--)    //loop for printing reverse nos
            //                {
            //                 System.out.print(k);
            //                }
            //                System.out.println("");
            //         }  
            //     }



            
                
               //triangular pattern with spaces
          //      System.out.println("enter number of rows ");
          //      int n=sc.nextInt();int count=1;
          //      for(int i=1;i<=n;i++)
          //      {    if(i==n)
          //       {                                   // last row case
          //          for(int j=1;j<=count;j++)
          //          {
          //           System.out.print(n);
          //           } break;
          //       }
          //           for(int k=1;k<=n-i;k++)    //printing beginning spaces
          //           {
          //               System.out.print(" ");
          //           }
          //      for(int k=1;k<=count;k++)
          //      {  
                
          //        if(k==1 || k==count)      //k is running count times, count=space+digit and count starts with 1
          //        System.out.print(i);
          //        else
          //        System.out.print(" "); 
          //      }
          //        count+=2;
          //      System.out.println();
          //      }



          // sc.close();      
          // System.out.println("enter number of rows");
          // int row=sc.nextInt();
          // for(int i=1;i<=row;i++)
          // {
          //       for(int j=row-i;j>0;j--)
          //       {
          //         System.out.print(" ");
          //       }
          //       for(int k=1;k<=(2*i)-1;k++)
          //       {
          //         System.out.print("*");
          //       }
          //       System.out.println();
          // }  
          
          

          System.out.println("enter number of rows");
          int row=sc.nextInt();
          for(int i=1;i<=row;i++)
          {
            for(int j=1;j<=row-i;j++)
            {
              System.out.print(" ");

            }
            for(int k=1;k<=2*i-1;k++)
            {
              if(k==1||k==2*i-1||i==row)
              {
                System.out.print(i);

              }
              else
              {
                System.out.print(" ");
              }
            }System.out.println();

          }
          
            
     }
    }


