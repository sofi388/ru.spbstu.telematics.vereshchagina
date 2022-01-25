package ru.spbstu.telematics;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static class MakeStr
    {
    private static char[] alphabet =
            {
                 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            };
        public int length = 0; //длина строки
        char str1[];
       // private Random rnd;

        public static int rnd(int min, int max)
        {
            max -= min;
            return (int) (Math.random() * ++max) + min;
        }
        public void putLength()
        {
            Scanner sc = new Scanner(System.in);
            // int number;
            do {
                System.out.print("\nPut the string length: ");
                System.out.print("\nIf you want quit - press 999: ");
                while (!sc.hasNextInt()) {  //проверка положительного int (целочисленного)
                    System.out.println("That not a number!");
                    sc.next(); // this is important!
                }
                length = sc.nextInt();
            } while (length <= 0);

        }
        public int makeString()
        {
            int index = 0;
	    int length1 = 0;
		
            str1 = new char[length];
            for (int i = 0; i < length; i++)
            {
                index = rnd(0,25);
                str1[i] = alphabet[index];
		length1++;
            }
            System.out.print(str1);
            return length1;
        }
    };

    public static void main( String[] args )
    {
	 int strLength;
         MakeStr str = new MakeStr();
            while(true)
            {
                str.putLength();
                if (str.length == 999)
                    break;
                strLength = str.makeString();
            }
    }
}
