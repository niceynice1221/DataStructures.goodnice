import java.util.Scanner;
public class Lab1Task8{
    public static void main(String[] args) {
        int arr[] = getData(3);
        System.out.println(printArr(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / (arr.length * 1.0);
        System.out.println("sum = " + sum);
        System.out.println("average = " + avg);

    }

    public static String printArr(int[] x) {
        String s = "";
        for (int i = 0; i < x.length; i++) {
            s = s + x[i];
            if (i < x.length - 1) {
                s = s + ",";
            }
        }
        return s;
    }

    public static int[] getData(int x) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[x];
        for (int i = 0; i < x; i++) {
            int n = sc.nextInt();
            a[i] = n;
        }
        return a;
    }
}