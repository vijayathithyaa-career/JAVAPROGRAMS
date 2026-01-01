import java.io.*;
import java.lang.*;
public class strext
  {
    public static void main(String args[])
    {
      String s1="Computer Technology";
      System.out.println("Single Character Extraction");
      char ch;
      ch="Computer".charAt(3);
      System.out.println("3rd Character Extraction");
      System.out.println("More than One Character Extraction");
      int st=5;
      int end=16;
      char buf[]=new char[end-st];
      s1.getChars(st,end,buf,0);
      System.out.println(buf);
      System.out.println("String To Array Extraction");
      char[] c="Hello".toCharArray();
      System.out.println(c);
    }
  }
