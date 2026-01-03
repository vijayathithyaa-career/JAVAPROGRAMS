import java.io.*;
import java.lang.*;
class aThread extends Thread
{
public void run()
{
System.out.println("Thread A Started");
for(int i=0;i<=5;i++)
System.out.println(i+"*"+"7="+(i*7));
System.out.println("Thread A Exit");
}
}
class bThread extends Thread
{
public void run()
{
System.out.println("Thread B Started");
for(int i=0;i<=4;i++)
System.out.println(i+"*"+"13="+(i*13));
System.out.println("Thread B Exit");
}
}
class cThread extends Thread
{
public void run()
{
System.out.println("Thread C Started");
for(int i=0;i<=4;i++)
System.out.println(i+"*"+"13="+(i*13));
System.out.println("Thread C Exit");
}
}
public class mThread
{
public static void main(String args[])
{
aThread a=new aThread();
bThread b=new bThread();
cThread c=new cThread();
c.setPriority(Thread.MAX_PRIORITY);
b.setPriority(Thread.MIN_PRIORITY);
a.setPriority(Thread.MIN_PRIORITY);
c.start();
b.start();
a.start();
}
}

