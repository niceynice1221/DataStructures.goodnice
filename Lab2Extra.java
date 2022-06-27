import java.util.Scanner;
import java.util.Arrays;
public class Lab2Extra{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String[] str = sc.nextLine().split(",");
        int[] num = new int[str.length];
        System.out.print("output: ");
        for(int i = 0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        System.out.println(num[num.length - 1]);
    }
}