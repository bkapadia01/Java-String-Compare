package com.mycompany.app;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class App{
    public static void main(String[] args){

        //Setup application to recieve user input for 2 sentences
        //Checks to make sure that the field is not empty
        //Request user input again if empty field detected
        String str1, str2 = ""; 
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter First Sentence: ");
        while((str1 = scanObj.nextLine()).isEmpty()) {
            System.out.print("Empty Line - Enter 1st Sentence: ");
          }
          System.out.println("Enter Second Sentence: ");
          while((str2 = scanObj.nextLine()).isEmpty()) {
              System.out.print("Empty Line - Enter 2nd Sentence:");
            }
        scanObj.close();
        
        // Takes the two senteces from user input and...
        // returns with punctuations and extra spaces removed
        String[] arr = cleanUp(str1, str2);
        int i = 1;
        for (String string : arr){
            System.out.println("Cleaned Sentence"  + i + ": \n\t"+ string);
            i++;
        }

        //Takes the 2 sentences free from punctuations or extra spaces
        //Runs it through the CheckDiff funcion to find diffrences the 2 senteces.
        //Ignoring the cases, if the 2 sentences are the same, return prompt saying the senteces are same
        //else, it will return the differnce in the sentence
        ArrayList<String> sentence = checkDiff(arr);
    }

    private static ArrayList<String> checkDiff(String arr[]) {
        if (arr[0].equalsIgnoreCase(arr[1])){
            System.out.println("The 2 sentences are the same");
        } else {
            ArrayList<String> sentence1 = new ArrayList<>(Arrays.asList(arr[0].toLowerCase().split("\\s+")));
            //System.out.println(sentence1);
            ArrayList<String> sentence2 = new ArrayList<>(Arrays.asList(arr[1].toLowerCase().split("\\s+")));
            //System.out.println(sentence2);
            System.out.println("The  2 sentences are the different");
            sentence2.removeAll(sentence1);
            System.out.println("The list of words that are different in Sentence 1 compared to Sentence 2 are:\n\t" + sentence2);
        }
        return null;
    }

    public static String[] cleanUp(String str1, String str2) {
        String[] arr = {str1, str2};
        for (int i = 0; i<arr.length; i++){
            arr[i] = arr[i].replaceAll("\\p{Punct}","").replaceAll("\\s+", " ");
            System.out.println("string cleaned: " + arr[i]);
        }
        return arr;
    }
}