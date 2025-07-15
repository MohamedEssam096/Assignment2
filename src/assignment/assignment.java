package assignment;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args){
        // the First Exercise//
        int num=1;
        while (num<=10) {
            System.out.println(num);
            num++;
        }
        //the second exercise//
        System.out.println("Enter the number");
        int number;
        Scanner input= new Scanner(System.in);
        number = input.nextInt();
        if (number%2==0){
            System.out.println("The number is even");
        }
        else System.out.println("the number is odd");
        //the third exercise//
        System.out.println("Enter the day");
        int day;
        Scanner week = new Scanner(System.in);
        day =week.nextInt();
        switch (day){
            case 1:
                System.out.println("Saterday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("fridday");
                break;
            default:
                System.out.println("Enter valid day");
        }
    }
}
