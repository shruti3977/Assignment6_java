//This Program is prepared by 21CE118 Shruti Sangani
//Part-6 Practical-5
/* Aim :: Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the priority of
the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the ‘THIRD’ thread to 7
wait() method is a part of Thread Class.
 */
public class Practical5 {
    public static void main(String args[]) throws InterruptedException
    {
        thread f=new thread();
        thread s=new thread();
        thread t=new thread();

        f.setPriority(3);
        s.setPriority(5);
        t.setPriority(7);

        f.start();
        s.start();
        t.start();
    }
}
class thread extends Thread
{
    public void run()
    {
        A();
        System.out.println("Priority of this  thread is :: " + Thread.currentThread().getPriority());
    }
    public synchronized void A()
    {
        try
        {
            wait(5000);//wait() method
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupt");
        }
    }
}
