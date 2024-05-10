//  import java.util.Scanner; 
//      class Area {
//      double a,b,c;                 //assign ques                                 
//     public double getArea()  
         
//              //input without parameter

//     {
//      double area=0.5*b*c;
//      return area;
//     }
//    public double getperi()
//     {
//      double peri=a+b+c;
//      return peri;
//     }
//  }

//     public class oopsassign
//     {
//      public static void main(String[] args) {
//          Area obj=new Area();
//          obj.a=3;
//          obj.b=4;
//          obj.c=5;
//          System.out.println("area is"+obj.getArea());
//          System.out.println("perimeter is;"+obj.getperi());

//      }
//      }                            





// import java.util.Scanner;    //input with parameter
// class Area{
//     public double returnArea(double length,double breadth)
//     {
//         double area= length *breadth;
//         return area;
//     }

// }
// public class oopsassign{
//     public static void main(String[] args) {
//         Area obj=new Area();
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter length and breadth");
//         double l= sc.nextDouble();
//         double b=sc.nextDouble();
//         System.out.println("area is ;"+obj.returnArea(l,b));

//     }
// }




// class ParameterPrinter {
    
//     public void printValues(int x, double y, String z) {
//         System.out.println("x = " + x);
//         System.out.println("y = " + y);
//         System.out.println("z = " + z);
//     }
// }
//     public class oopsassign{
//     public static void main(String[] args) {
//         ParameterPrinter printer = new ParameterPrinter();
//         printer.printValues(10, 3.14, "hello");
//     }
//     }
    


 import java.util.Scanner;
  class employee 
  {
     public void display( String name,int year,String address)
     {
          System.out.println("name       "+ "yr of joining       "+"address");
          System.out.println(name+"   "+year+"    "+address);
        
    

     }
 }
  public class oopsassign{   
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         employee obj1=new employee();
         
        
          System.out.println("enter name,yr of joining ,address");
           String n= sc.nextLine();
          
           int yr=sc.nextInt();
        //    sc.nextLine();                 
           String add= sc.nextLine();
          obj1.display(n,yr,add); 
             
    
         sc.close();
     }

 }









