//This program is prepared by 21CE118 Shruti Sangani
//Part-6 practical-4
/*Aim ::  Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the
priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the
‘THIRD’ thread to 7.
Set and get Priority methods are used to execute the object on resource.
 */
public class Practical4
{
    public static void main(String args[])
    {
        FIRST obj1=new FIRST();
        obj1.setName("FIRST");
        SECOND obj2=new SECOND();
        obj2.setName("SECOND");
        THIRD obj3=new THIRD();
        obj3.setName("THIRD");

        obj1.setPriority(3);//setPriority method for change priority
        obj2.setPriority(7);
        obj3.setPriority(5);

        obj1.start();
        obj2.start();
        obj3.start();
    }
}
class FIRST extends Thread
{
    public void run()
    {
        System.out.println("Priority of Thread "+Thread.currentThread().getName()+" :: "+Thread.currentThread().getPriority());
    }
}
class SECOND extends Thread
{
    public void run()
    {
        System.out.println("Priority of Thread "+Thread.currentThread().getName()+" :: "+Thread.currentThread().getPriority());
    }
}
class THIRD extends Thread
{
    public void run()
    {
        System.out.println("Priority of Thread "+Thread.currentThread().getName()+" :: "+Thread.currentThread().getPriority());
    }
}
