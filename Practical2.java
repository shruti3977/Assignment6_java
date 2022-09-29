//This Program is prepared by 21CE118 Shruti Sangani
//Part-6 Practical-2
/* Aim :: Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to
display the numbers stored at odd indexes by thread1 and display numbers stored at even
indexes by thread2.
 */
import java.util.Random;

public class Practical2
{
    public static void main(String args[])
    {
        int[] a=new int[15];
        int i;
        for(i=0;i<15;i++)
        {
            a[i]=new Random().nextInt(100);//Random() Method use for take random number from computer
        }
        System.out.println("15 Random Number is :: ");
        for (i=0;i<15;i++)
        {
            System.out.print(a[i] + " ");
        }

        Thread t1=new Thread()
        {
            public void run()
            {
                for (int i=1;i<15;i=i+2)
                {
                    System.out.println("Odd : "+a[i]);
                }
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                for (int i=0;i<15;i=i+2)
                {
                    System.out.println("Even : "+a[i]);
                }
            }
        };
        t1.start();//start method
        t2.start();
    }
}
