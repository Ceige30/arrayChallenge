package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println("Enter a grade");
        double grade = scInt.nextDouble();
        System.out.println("Enter the student's name that got that grade");
        String name = scString.nextLine();
        double sum = 0;
        int x = 0;
        int num = 0;
        double grades [] = new double[1000];
        String names [] = new String[1000];

        while(true)
        {
            grades [x] = grade;
            names [x] = name;
            sum += grade;
            x++;
            num++;
            System.out.println("Enter another grade or enter -1 to stop and see the grades and students");
            grade = scInt.nextDouble();
            if(grade == -1.0) {
                break;
            }
            System.out.println("Enter the student's name that got that grade");
            name = scString.nextLine();
        }
        System.out.println("The list of student names is:");
        for(int i = 0; i <= num; i++)
        {
            System.out.println("Student " + (i+1) + ": " + names[i]);
        }
        System.out.println("");
        System.out.println("The average grade was: " + sum/num);
    }
}