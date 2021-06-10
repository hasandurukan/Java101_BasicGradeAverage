package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int mathematics,physics,chemistry,turkish,history,music;

	    System.out.print("Mathematics grade :");
        mathematics=input.nextInt();

        System.out.print("Physics grade :");
        physics=input.nextInt();

        System.out.print("Chemistry grade :");
        chemistry=input.nextInt();

        System.out.print("Turkish grade :");
        turkish=input.nextInt();

        System.out.print("History grade :");
        history=input.nextInt();

        System.out.print("Music grade :");
        music=input.nextInt();

        int gradeAverage=(mathematics+physics+chemistry+turkish+history+music)/6;
        System.out.println("Your average grade is :"+gradeAverage);
        System.out.print(gradeAverage>59?"You passed!":"You Failed");
    }
}
