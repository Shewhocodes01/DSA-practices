import java.util.*;
public class twodarrayassign {
    //  static int ans[]=new int[2];
    // static void findx(int [][]arr,int r,int c,int x)
    // {
    //     for(int i=0;i<r;i++)
    //     {
    //         for(int j=0;j<c;j++)
    //         {
    //             if(arr[i][j]==x)
    //             {
                                                                            //ques 1 
    //                System.out.println(i+" "+j);
    //                return;
    //             }
    //         }
    //     }
    //       System.out.println(-1);
    // }

    // static void print(int arr[][],int r,int c)
    // {
    //     for(int i=0;i<r;i++)
    //     {
    //         for(int j=0;j<c;j++)
    //         {
                
    //                 System.out.print(arr[i][j]);
    //             }System.out.println();
    //         }
    // }



    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter rows and columns of array");
    //      int r=sc.nextInt();
    //      int c=sc.nextInt();
    //      int arr[][]=new int[r][c];
    //      System.out.println("enter array elements");
    //      for(int i=0;i<r;i++)
    //      {
    //          for(int j=0;j<c;j++)
    //          {
    //              arr[i][j]=sc.nextInt();
    //          }
    //      }
        // System.out.println("enter element x to be found");
        // int x=sc.nextInt();
        // findx(arr,r,c,x);


    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
    //     int arr[]=new int[n*m];
    //     System.out.println("enter array elements");
    //     for(int i=0;i<m*n;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     Arrays.sort(arr);
    //     int ans[][]=new int[n][m];
    //     int k=0;
    //     while(k<arr.length)
    //     {
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<m;j++)
    //         {
    //              ans[i][j]=arr[k++];
    //         }
    //     }
    // }
    //          print(ans,n,m);
    // System.out.println("enter range of row");
    // int row[]=new int [2];
    // row[0]=sc.nextInt();row[1]=sc.nextInt();
    // System.out.println("enter column range");
    // int column[]=new int[2];
    // column[0]=sc.nextInt();
    // column[1]=sc.nextInt();
    // int sum=0;
    // for(int i=row[0];i<=row[1];i++)
    // {
    //     for(int j=column[0];j<=column[1];j++)
    //     {
    //         sum+=arr[i][j];
    //     }
    // } 
    // System.out.println("sum:"+sum);


    // static void findElement(int arr[][],int r,int c,int x)
    // {
    //         int i=0;int j=c-1;
                
                    
    //                while(i<r && j>=0)
    //                 {
    //                     if(arr[i][j]==x)
    //                     {
    //                     System.out.println(i+" "+j);
    //                     return;
    //                     }
    //                     else if(x>arr[i][j])
    //                     {
    //                         i++;
    //                     }
    //                     else if(x<arr[i][j])
    //                     {
    //                         j--;
    //                     }
                        
    //                 }System.out.println("-1");
    // }
    
    
    //         public static void main(String[] args) {
    //             Scanner sc=new Scanner(System.in);
    //             System.out.println("enter rows and columns");
    //             int r=sc.nextInt();
    //             int c=sc.nextInt();
    //             int arr[][]=new int[r][c];
    //             for(int i=0;i<r;i++)
    //             {
    //                 for(int j=0;j<c;j++)
    //                 {
    //                     arr[i][j]=sc.nextInt();
    //                 }
    //             } 
                
    //             System.out.println("enter x");
    //             int x=sc.nextInt();
    //             findElement(arr,r,c,x);
                
    //             }
    //         }
        




    //assign 2 



    static void transpose(int arr[][],int r1,int c1,int ans[][])
    {     
        {
            for(int i=0;i<c1;i++)
            {
                for(int j=0;j<r1;j++)
                {
                    ans[i][j]=arr[j][i];
                }
            }
        }
    }
    
static void rotate(int ans[][],int c1,int r1)
{
    for(int k=0;k<r1;k++)                       //to fix column
        {    
            
                 int start=0;int end =c1-1;
                 while(start<end)
                 {
                    int temp=ans[start][k];
                    ans[start][k]=ans[end][k];
                    ans[end][k]=temp;
                    start++;end--;
                 }
           
                }
        }
    static void print(int ans[][],int c,int r)
     {
         for(int i=0;i<c;i++)                                           //ques 2
         {
             for(int j=0;j<r;j++)
             {
                
                     System.out.print(ans[i][j]+" ");
                 }System.out.println();
             }
     }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimension of first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int m1[][]=new int[r1][c1];
        int ans[][]=new int[c1][r1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        transpose(m1,r1,c1,ans);
        rotate(ans,c1,r1);
        print(ans,c1,r1);
        
       
        




    }
}





//ques 3
 static void toeplitz(int arr[][],int r,int c)
                
            {
                    for(int i=1;i<r;i++)
                    {
                        for(int j=1;j<c;j++)
                        {   
                            
                            if(arr[i][j]!=arr[i-1][j-1])
                            {
                                System.out.println("false");return;
                            }
                        }
                    }
                      System.out.println("true");
                }
        




        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter rows and columns");
            int r=sc.nextInt();
            int c=sc.nextInt();
            int arr[][]=new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            toeplitz(arr,r,c);
        }
    }






//ques 4


//diagonal traversal of matrix
public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter rows and columns");
            int r=sc.nextInt();
            int c=sc.nextInt();
            int arr[][]=new int[r][c];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            } 
            
            int ans[]=new int[r*c];
            int count=0;int row=0;int column=1;
           
            while(row<r)
            {    int i=row;int j=0;                               //row is being used to keep track of total rows 
            while(i>=0 && j<c)
            {   
                ans[count]=arr[i][j];                        //i is initialized with row to start from current row and 0th column
                i--;j++;count++;
            }row++;
            
           }
            row-=1;                                         //column is being used to keep track of total columns 
             while(column<c)
             {        
               int k=r-1;int l=column;
             while(k>=0 && l<c)
             { 
                
               ans[count] =   arr[k][l];
               k--;l++;count++;
             }   column++;
            }
              for(int m=0;m<r*c;m++)
              {
                System.out.print(ans[m]);
              }
            }
        }



        //assign 3 

        //ques 1   prefix sum matrix
        //int i=0;
    //         for(int column=1;column<c;column++)
    //         {
    //             arr[i][column]+=arr[i][column-1];

    //         }
    //         int j=0;
    //         for(int row=1;row<r;row++)
    //         {
    //             arr[row][j]+=arr[row-1][j];
    //         }
    //         for(int k=1;k<r;k++)
    //         {
    //             for(int l=1;l<c;l++)
    //             {
    //                   arr[k][l]+=arr[k-1][l]+arr[k][l-1];  
    //             }
    //         }
    //          print(arr,r,c);




    