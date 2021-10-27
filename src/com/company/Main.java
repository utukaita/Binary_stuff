package com.company;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Homework 4
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("current time: " + calendar.getTime());
        //Homework 5
        int sum = 0;
        try (Scanner scanner = new Scanner(new File("nums.txt"))){
            for (int i = 1; i <= 15; i++) {
                int num = scanner.nextInt();
                sum += num;
            }
            System.out.println(sum);

        }
        catch (Exception e) {
            System.out.println("got exception: " + e);
            System.exit(1);
        }
        try (Scanner scanner1 = new Scanner (new File("aasi.txt"));
             PrintWriter writer2 = new PrintWriter (new FileWriter("text.txt"))) {
            while (scanner1.hasNextLine()){
                String currentLine = scanner1.nextLine();
                String[] words = currentLine.split(" ");
                for (String a : words)
                    writer2.print(a.length() + " ");
                writer2.println("");
            }
        }
        catch(Exception e) {
            System.out.println("got exception: " + e);
            System.exit(1);
        }
    }
}