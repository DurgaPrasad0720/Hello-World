import java.util.Scanner;
public class bmicalculator{
    public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter your weight in kilograms:");
       float weight=scanner.nextFloat();
       System.out.println("Enter your height in meters:");
       float height=scanner.nextFloat();
       float bmi=weight/(height*height);
       System.out.println("your body mass index is:"+bmi);
       if(bmi<18.5){
        System.out.println("Under weight");
       }
       else if((bmi>=25)&&(bmi<=29.5)){
        System.out.println("Over weight");
       }
       else if(bmi>=30){
        System.out.println("Obesity");
       }
       else{
        System.out.println("Morderate weight");
       }
       scanner.close();
   }
}
