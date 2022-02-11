//package test;

//import domain.Exercise;
import java.util.Scanner; 

public class TestResult 
{

    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in); 
        System.out.println("Write number:");
        int number = console.nextInt();
        console.close();
        
        System.out.println("Is your number Amstrong`s number:"+Exercise.Amstrong_Number(number));
    }
}