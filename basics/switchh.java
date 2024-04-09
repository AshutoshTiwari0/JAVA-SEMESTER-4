package SEMSTEREXAM.basics;

import java.util.*;
public class switchh {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a number");
        int a=ob.nextInt();
        System.out.println("enter choice");
        int ch=ob.nextInt();
        switch(ch)
        {
            case 1:
            if(a%2==0)
            {
                System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }
            break;
            case 2:
            System.out.println("check number is 7");
            if(a==7)
            {
                System.out.println("no is equal to 7");
            }
            break;
            default:
            System.out.println("wrong choice");
            ob.close();
        }
    }
}
