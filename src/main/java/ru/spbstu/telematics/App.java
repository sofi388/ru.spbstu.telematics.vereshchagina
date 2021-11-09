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
            Scanner in = new Scanner(System.in);
            System.out.print("\nPut the string length: ");
            System.out.print("\nIf you want quit - press 999: ");
            length = in.nextInt();

        }
        public void makeString()
        {
            int index = 0;
            str1 = new char[length];
            for (int i = 0; i < length; i++)
            {
                index = rnd(0,25);
                str1[i] = alphabet[index];
            }
            System.out.print(str1);
        }
    };

    public static void main( String[] args )
    {
         MakeStr str = new MakeStr();
            while(true)
            {
                str.putLength();
                if (str.length == 999)
                    break;
                str.makeString();
            }
    }
}
