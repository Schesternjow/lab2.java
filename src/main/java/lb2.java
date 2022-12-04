import java.util.Random;
import java.util.Scanner;

public class lb2
{
    public static void main (String[] args)
    {
        double average = 0.0;
        double summa = 0.0;
        double schetchik = 0.0;
        int stroka, stolbec;

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть кількість рядків масиву: ");
        stroka = in.nextInt();

        System.out.print("Введіть кількість стовпчиків масиву: ");
        stolbec = in.nextInt();

        int vibor = 0 ;
        System.out.print("Введіть 1, щоб заповнити масив з клавіатури, 2 - заповнити рандомн" + vibor + "\n");
        vibor = in.nextInt();
        int[][] arr = new int[stroka][stolbec];

        if (vibor == 1)
        {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    System.out.print("Введіть елементи масиву[" + i + "][" + j + "]:");
                    arr[i][j] = in.nextInt();
                }
            }
        }
        in.close();

        if (vibor == 2)
        {
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    arr[i][j] = rand.nextInt(10)+1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "\t");
                if (arr[i][j] > average)
                {
                    summa += arr[i][j];
                    schetchik++;
                }
                average = summa/schetchik;
            }
            System.out.println();
        }
        System.out.println("Середнє арифметичне елементів масиву = " + average);
    }
}