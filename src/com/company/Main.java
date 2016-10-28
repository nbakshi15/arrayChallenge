package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("How many students would you like to enter?");
        int numStudents = input1.nextInt();
        int count = 0;
        int sum = 0;
        String name[] = new String[numStudents];
        int grade[] = new int[numStudents];
        for(int j = 0; j < numStudents; j++) {
            System.out.print("Enter the student name: ");
            name[j] = input1.next( );
            System.out.print("Enter the grade: ");
            grade[j] = input1.nextInt( );
            sum = sum + grade[j];
            //System.out.println(sum);
            //System.out.println(count);
        }
        int average = sum/numStudents;
        System.out.println("The list of the class:" + Arrays.toString(name));
        System.out.println("The class average:" + average);
    }
        }
