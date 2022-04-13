import java.util.Scanner;

/**
 * @author Vivian
 * @create 2022-02-11 11:11 AM
 */
public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        int input = scnr.nextInt();
        int max = 0;

        while(input >= 0){
            if(input > max ){
                max = input;
            }
            input = scnr.nextInt();
        }
        System.out.println(max);

    }
}
