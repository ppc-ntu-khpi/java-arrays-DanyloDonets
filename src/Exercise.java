//package domain;
//Перевірте чи є задане число числом Армстронга

public class Exercise 
{
    public static boolean Amstrong_Number(int number)
    {
        int[] numbers;//Створюю масив
        numbers = new int[(int) (Math.log10(number) + 1)];
        int check_number = 0; // Змінна суми чисел
        int step = (int) (Math.log10(number) + 1); //Кількість цифр в числах
        int buff = number;//Буфер
        for(int i = 0; i < step; i++)
        {
            numbers[i] = buff%10;//Узнаю останнє число 
            check_number += Math.pow(numbers[i],step);//підношу число до степеня та сумую його в змінну check_number
            buff /= 10;// віднімаю число яке підносив в зміну check_number
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
