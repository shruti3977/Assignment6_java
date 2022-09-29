//This Program is prepared by 21CE118 Shruti Sangani
//Part-6 Practical-1
/* Aim :: Write a program to create thread which display “Hello World” message.
A. by extending Thread class
B. by using Runnable interface.
 */
public class Practical1 implements Runnable //Runnable interface
{
    public void run()
    {
        System.out.println("Hello World");
    }
    public static void main(String[] args)
    {
        Practical1 t=new Practical1();
        t.run();
    }
}