package SEMSTEREXAM.basics;

import java.io.*;
public class filehandling {
public static void main(String[] args) throws IOException {
File fr=new File("secondfile.txt");
if(fr.createNewFile())
{
    System.out.println("file created at "+fr.toString());
}
else
{
    System.out.println("not created");
}
}

}
