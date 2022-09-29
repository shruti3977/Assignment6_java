//This Program is prepared by 21CE118 Shruti Sangani
//Part-6 Practical-3
/*Aim :: Write a program to increment the value of one variable by one and display it after one
second using thread using sleep() method.
 */
public class Practical3 extends Thread//Thread class
{
    public static void main(String arghs[]) {
        try
        {
            for (int i=0;i<10;i++)
            {
                Thread.sleep(1000);//sleep method
                System.out.print(i + " ");
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
