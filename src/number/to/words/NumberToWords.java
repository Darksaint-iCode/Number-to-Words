/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.to.words;

import java.util.Scanner;

/**
 *
 * @author Ibro Yusuf Ola
 */
public class NumberToWords {

    /**
     * @param args the command line arguments
     */
    
    static String valueIn[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty",
        "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Hundreed", "Thousand", "Million"};
    
    static Scanner inputNum = new Scanner(System.in);
    static int dNum, length;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Input number you want to convert: ");
        dNum = inputNum.nextInt();
        checkLength();
    }

    private static void checkLength() {
        length = String.valueOf(dNum).length();
        System.out.println("\nLength of your Number is: " + length);
    }
    
}
