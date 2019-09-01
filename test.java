import java.util.Scanner;

public class test{

    public static void main(String[] args){

        String str1 = "this-is.first:sentence/.";
        String str2 = "this=is.second:sentece.";
    
        String[] arr = cleanUp(str1, str2);
        
        for (String string : arr){
            System.out.println("string after cleanup(): " + string);
        }
    }

    public static String[] cleanUp(String str1, String str2) {
        String[] arr = {str1, str2};
        for (int i = 0; i<arr.length; i++){
            arr[i] = arr[i].replaceAll("\\p{Punct}"," ");
            System.out.println("string cleaned: " + arr[i]);
        }
        return arr;
    }

}