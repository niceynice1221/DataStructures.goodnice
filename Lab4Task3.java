import java.util.*;
public class Lab4Task3 {
    public static void main(String[] args) {

        int data[] = { 4, 2, 3, 9, 8, 1, 0, 5 };
        // int data[]= getData(8);
        int out[] = insertSort(data);
        Lab4Task1.printArray(out);
    }//main

    public static int[] insertSort(int[] d) {
        int[] ans = new int[d.length];
        for (int i = 0; i < d.length; i++) {
            ans[i] = d[i];
        }
        for (int j = 1; j < ans.length; j++) {
            int key = ans[j];
            int i = j - 1;
            while ((i > -1) && (ans[i] > key)) {
                ans[i + 1] = ans[i];
                i--;
            }
            ans[i + 1] = key;
            System.out.print(j+": ");
            Lab4Task1.printArray(ans);
        }
        return ans;
    }//insertion
// import java.util.*;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = in.nextInt();
        }
        return ans;
    }
// class
    public static int[] getData(int n) 
        int[] ans = new int[n];
        Scanner in = new Scanner(System.in); 