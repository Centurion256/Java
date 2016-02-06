public class Square{

     public static void main(String []args){
         
         double a;
         double b;
         double c;
         double p;
         double S;
         
         Console console = new Console();
         
         System.out.println("Insert value of the 1st side of triangle");
         a=Double.parseDouble(console.readLine());
         System.out.println("Insert value of the 2nd side of triangle");
         b=Double.parseDouble(console.readLine());
         System.out.println("Insert value of the 3rd side of triangle");
         c=Double.parseDouble(console.readLine());
         
         p=(a+b+c)/2;
         S=(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
         
         System.out.println("Square equals "+ S );
    }
}