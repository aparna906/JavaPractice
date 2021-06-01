/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_27_01_2021;

import java.util.Scanner;

/**
 *
 * @author gauri
 */
    public class ConvertNumToWord {
  private static final String[] units = {
    "",
    " one",
    " two",
    " three",
    " four",
    " five",
    " six",
    " seven",
    " eight",
    " nine"
  }; 
  private static final String[] twoDigits = {
    " ten",
    " eleven",
    " twelve",
    " thirteen",
    " fourteen",
    " fifteen",
    " sixteen",
    " seventeen",
    " eighteen",
    " nineteen"
  };
  private static final String[] tenMultiples = {
    "",
    "",
    " twenty",
    " thirty",
    " forty",
    " fifty",
    " sixty",
    " seventy",
    " eighty",
    " ninety"
  };
  private static final String[] placeValues = {
    "",
    " thousand",
    " lakh",
    " crore",
    " arab",
    " kharab"
  };
        
  private static String convertNumber(long n) {    
    String word = "";    
    int i = 0;
    boolean firstIteration = true;
    int a;
    do {
      a = firstIteration ? 1000 : 100;
      // take 3 or 2 digits based on iteration
      int num = (int)(n % a);          
      if (num != 0){
        String str = ConversionForUptoThreeDigits(num);
        word = str + placeValues[i] + word;
      }
      i++;
      // next batch of digits
      n = n/a;
      firstIteration = false;
    } while (n > 0);
    return word;
  }
    
  private static String ConversionForUptoThreeDigits(int n) {
    String word = "";    
    int num = n % 100;
    if(num < 10){
      word = word + units[num];
    }
    else if(num < 20){
      word = word + twoDigits[num%10];
    }
    else{
      word = tenMultiples[num/10] + units[num%10];
    }
    
    word = (n/100 > 0)? units[n/100] + " hundred" + word : word;
    return word;
  }
    
  public static void main(String[] args) {
    int digit;
    Scanner scan= new Scanner(System.in);
        System.out.println("Enter The Digit");
        digit = scan.nextInt();
        System.out.println("Conver Digit :  " + convertNumber(digit));
  }
}

