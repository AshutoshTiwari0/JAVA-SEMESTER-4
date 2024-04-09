package SEMSTEREXAM.basics;

import java.io.*;
public class buffereader {
    public static void main(String[] args) throws IOException{
        //found in I/O package
        //it inputs string type so always convert it to integer
        /*
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter a number");
                String a=br.readLine();  //this is input
                int a1=Integer.parseInt(a);
                System.out.println(a1);
                */
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter a name");
                String name=br.readLine();
                System.out.println(name);
                System.out.println("enter age of "+name);
                String age=br.readLine();
                int a=Integer.parseInt(age);
                System.out.println("age is "+a);
                
    }
}
