//package domain;
//Перевірте чи є задане число числом Армстронга

public class Exercise 
{
    public static boolean Amstrong_Number(int number)
    {
        int[] numbers;
        numbers = new int[(int) (Math.log10(number) + 1)];
        int check_number = 0;
        int step = (int) (Math.log10(number) + 1);
        int buff = number;
        for(int i = 0; i < step; i++)
        {
            numbers[i] = buff%10;
            check_number += Math.pow(numbers[i],step);
            buff /= 10;
        }
        if(check_number == number)
        {
            return true;
        }
        else
        {
          return false;
        }
    }
}