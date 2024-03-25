/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_09_arraystuff;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Administrator
 */
public class Lab_09_ArrayStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        
        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.println(dataPoints[e]);
        }
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("|");
        }
        int sum = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++)
        {
            sum = sum + dataPoints[e];
            System.out.println("The sum of the data is " + sum);           
        }
        int ave = sum/dataPoints.length;
        System.out.println("The average of the data is " + ave);
        System.out.println("");
        
        System.out.println("Pick a number from 1-100");
        int input = 0;
        input = in.nextInt();
        in.nextLine();
        for(int e = 0; e < dataPoints.length; e++)
            if(dataPoints[e] == input)
            {
                System.out.println("Your input: " + input + "has been found at: " + e);
            }
        System.out.println("Pick another number from 1-100");
        input = in.nextInt();
    }
    
}
