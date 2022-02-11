//package test;

//import domain.Exercise;
import java.util.Scanner; 

public class TestResult 
{

    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in); //Викликаємо сканер
        System.out.println("Write number:");
        int number = console.nextInt();//Скануємо число
        console.close();// ВИключаємо сканер
        
        System.out.println("Is your number Amstrong`s number:"+Exercise.Amstrong_Number(number));//Вивожу результат з функції Amstrong_Number
    }
}
