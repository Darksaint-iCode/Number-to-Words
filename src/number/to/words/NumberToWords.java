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
    static int dNum, length, tempC, digitC, countedD;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Input number you want to convert: ");
        dNum = inputNum.nextInt();
        checkLength();
        checkDigit();
    }

    private static void checkLength() {
        length = String.valueOf(dNum).length();
        System.out.println("\nLength of your Number is: " + length);
        System.out.println("");
    }

    private static void checkDigit() {
        //making a copy of the input number
        tempC = dNum;
        
        //counting digits in the input number
        while(dNum > 0)
        {
            dNum = dNum / 10;
            countedD++;
        }
        while(tempC > 0)
        {
            digitC = tempC % 10;
            if(digitC == 0){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[0]);  
            }else if(digitC == 1){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[1]);  
            }else if(digitC == 2){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[2]);  
            }else if(digitC == 3){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[3]);  
            }else if(digitC == 4){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[4]);  
            }else if(digitC == 5){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[5]);  
            }else if(digitC == 6){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[6]);  
            }else if(digitC == 7){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[7]);  
            }else if(digitC == 8){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[8]);  
            }else if(digitC == 9){
                System.out.println("Digit at place "+countedD+" is: "+valueIn[9]);  
            }else{
                System.out.println("Digit at place " + countedD + " is not recognised by Machine :(");     
            }
            tempC = tempC / 10;
            countedD--;
        }
    }
    
}
