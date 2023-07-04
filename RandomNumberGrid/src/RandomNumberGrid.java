/*
 *  Assignment: Assignment #6
 *  Description: This program uses 2D arrays to print out random numbers in rows and columns (0-9) , depending on what is asked from the user.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 210-01
 *  Semester: Fall 2019
 */
import java.util.Scanner;   //imported scanner class
import java.lang.Math;  // imported for random numbers
public class RandomNumberGrid {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in); // scans the users input
        //declared for row and column numbers
        int rowNum = -1;
        int colNum = -1;
        //while loop to check that number is between 0 and 9
        while (rowNum < 0 || rowNum > 9) {
            System.out.println("Enter # of rows: ");    // prompts user to enter number for rows
            rowNum = input.nextInt();   // holds rows number entered from the user
            if (rowNum < 0 || rowNum > 9) { //if statement to make sure numbers are between 0 and 9
                System.out.println("Error: Enter a number between 0-9. Try again.");    // occurs if number isn't between 0 and 9
            }
        }
        while (colNum < 0 || rowNum > 9) {  //while loop to check that number is between 0 and 9
            System.out.println("Enter # of columns: "); // prompts user to enter number for columns
            colNum = input.nextInt();   // holds number for columns number entered by user
            if (colNum < 0 || rowNum > 9) { //if statement to make sure numbers are between 0 and 9
                System.out.println("Error: Enter a number between 0-9. Try again.");    // occurs if the number isn't between 0 and 9
            }
        }
        int [][] twoDArray = new int [rowNum] [colNum]; // declared 2D array for row and column numbers
        //prints out the table for the user, along with the labels for columns and rows
        System.out.println("Random integers table: ");
        System.out.print("   |   ");
        // for loop to see what number the user enters, prints out the labels
        for (int j = 0; j < colNum; j++) {
            int col = j + 1;
            System.out.print(col+"   ");
        }
        System.out.println(""); // space between the numbers
        // for loop for the labels under column numbers
        for (int j = 0; j < colNum; j++) {
            System.out.print("-----");
        }
        System.out.print("\n"); //new line
        //prints out the random numbers for the user
        for(int i = 0; i < rowNum; i++) {
            int row = i+1;
            System.out.print(row+"  |   "); // prints out the row number with a | between
            for (int j = 0; j < colNum; j++) {  // for loop to get random numbers depending on columns entered in
                twoDArray[i][j] = (int) (Math.random() * 9);    //makes sure random numbers are between 0 and 9
                System.out.print(twoDArray[i][j] + "   ");  // prints out the 2d array with a space for the numbers
            }
            System.out.println(""); // space line
        }
    }
}