import java.io.*;
public class raf
{
public static void main(String args[])
{
RandomAccessFile rfile;
try
{
rfile=new RandomAccessFile("city.txt","rw");
rfile.seek(rfile.length());
rfile.writeBytes("KPRCAS");
rfile.close();
}
catch(IOException ioe)
{
System.out.println(ioe);
}
}
}

