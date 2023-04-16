public class Demo {
   public void sum(int a, int b){
      System.out.println("The sum of two integers is: "+(a+b));
   }
   
   public void sum(int a, int b, int c){
      System.out.println("The sum of three integers is: "+(a+b+c));
   }
   
   public void sum(double a, double b){
      System.out.println("The sum of two doubles is: "+(a+b));
   }
   
   public static void main(String args[]){
      Demo obj= new Demo();
      obj.sum(10, 20);
      obj.sum(10, 20, 30);
      obj.sum(10.5, 20.5);
   }
}
