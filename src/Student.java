import org.junit.Test;

import java.util.Scanner;

/**
 * @author Vivian
 * @create 2022-02-04 10:38 AM
 */
public class Student {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str1 = input.nextLine();
        System.out.print("Enter another: ");
        String str2 = input.nextLine();
        System.out.println("Your first has "+str1.length()+" characters.");
        System.out.println("Your second has "+str2.length()+" characters.");

        if(str1.length()>=str2.length()){
       System.out.println("The longer one is "+str1);
        }else{
        System.out.println("The longer one is "+str2);
        }
        input.close();
    }
    @Test
    public  void test(){

    }
}




