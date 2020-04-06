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
        "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety","Unit", "Hundred", "Thousand", "Ten Thousand", "Hundred Thousand",
        "Million"};
    
    static Scanner inputNum = new Scanner(System.in);
    static int dNum, ndNum, length, tempC, digitC, countedD;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Input number you want to convert: ");
        dNum = inputNum.nextInt();
        ndNum = dNum;
        checkLength();
        checkDigit();
//        printWords();
    }

    private static void checkLength() {
        length = String.valueOf(dNum).length();
        System.out.println("\nLength of your Number is: " + length);
        System.out.println("");
        if(length == 1){
            System.out.println("Unit Form is: " + valueIn[28]);
        }else if(length == 2){
            System.out.println("Unit Form is: " + valueIn[10]);
        }else if(length == 3){
            System.out.println("Unit Form is: " + valueIn[29]);
        }else if(length == 4){
            System.out.println("Unit Form is: " + valueIn[30]);
        }else if(length == 5){
            System.out.println("Unit Form is: " + valueIn[31]);
        }else if(length == 6){
            System.out.println("Unit Form is: " + valueIn[32]);
        }else if(length == 7){
            System.out.println("Unit Form is: " + valueIn[33]);
        }else{
            System.out.println("Unit Form is Unknown :(");
        }
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
                System.out.println("Digit at place " + countedD + " is: " + valueIn[0]);  
            }else if(digitC == 1){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[1]);  
            }else if(digitC == 2){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[2]);  
            }else if(digitC == 3){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[3]);  
            }else if(digitC == 4){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[4]);  
            }else if(digitC == 5){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[5]);  
            }else if(digitC == 6){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[6]);  
            }else if(digitC == 7){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[7]);  
            }else if(digitC == 8){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[8]);  
            }else if(digitC == 9){
                System.out.println("Digit at place " + countedD + " is: " + valueIn[9]);  
            }else{
                System.out.println("Digit at place " + countedD + " is not recognised by Machine :(");     
            }
            tempC = tempC / 10;
            countedD--;
        }
    }

//    private static void printWords() {        
//        System.out.println("");
//        if(length == 1 && digitC == 0){
//            System.out.println("In Word: " + valueIn[0]);
//        }else if(length == 1 && digitC == 1){
//            System.out.println("In Word: " + valueIn[1]);
//        }else if(length == 1 && digitC == 2){
//            System.out.println("In Word: " + valueIn[2]);
//        }else if(length == 1 && digitC == 3){
//            System.out.println("In Word: " + valueIn[3]);
//        }else if(length == 1 && digitC == 4){
//            System.out.println("In Word: " + valueIn[4]);
//        }else if(length == 1 && digitC == 5){
//            System.out.println("In Word: " + valueIn[5]);
//        }else if(length == 1 && digitC == 6){
//            System.out.println("In Word: " + valueIn[6]);
//        }else if(length == 1 && digitC == 7){
//            System.out.println("In Word: " + valueIn[7]);
//        }else if(length == 1 && digitC == 8){
//            System.out.println("In Word: " + valueIn[8]);
//        }else if(length == 1 && digitC == 9){
//            System.out.println("In Word: " + valueIn[9]);
//        }
//        else if(ndNum == 10){
//            System.out.println("In Word: " + valueIn[10]);
//        }else if(ndNum == 11){
//            System.out.println("In Word: " + valueIn[11]);
//        }else if(ndNum == 12){
//            System.out.println("In Word: " + valueIn[12]);
//        }else if(ndNum == 13){
//            System.out.println("In Word: " + valueIn[13]);
//        }else if(ndNum == 14){
//            System.out.println("In Word: " + valueIn[14]);
//        }else if(ndNum == 15){
//            System.out.println("In Word: " + valueIn[15]);
//        }else if(ndNum == 16){
//            System.out.println("In Word: " + valueIn[16]);
//        }else if(ndNum == 17){
//            System.out.println("In Word: " + valueIn[17]);
//        }else if(ndNum == 18){
//            System.out.println("In Word: " + valueIn[18]);
//        }else if(ndNum == 19){
//            System.out.println("In Word: " + valueIn[19]);
//        }
//        else if(ndNum == 20){
//            System.out.println("In Word: " + valueIn[20]);
//        }else if(ndNum == 30){
//            System.out.println("In Word: " + valueIn[21]);
//        }else if(ndNum == 40){
//            System.out.println("In Word: " + valueIn[22]);
//        }else if(ndNum == 50){
//            System.out.println("In Word: " + valueIn[23]);
//        }else if(ndNum == 60){
//            System.out.println("In Word: " + valueIn[24]);
//        }else if(ndNum == 70){
//            System.out.println("In Word: " + valueIn[25]);
//        }else if(ndNum == 80){
//            System.out.println("In Word: " + valueIn[26]);
//        }else if(ndNum == 90){
//            System.out.println("In Word: " + valueIn[27]);
//        }
//        //Fix
//        else if(length == 2 && digitC == 1){
//            System.out.println("In Word: " + valueIn[1] + " " + valueIn[28]);
//        }
//        else{
//            System.out.println("Issue getting word :(");
//        } 
//    }
    
}
