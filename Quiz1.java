import java.util.Scanner;
public class Quiz1{
public static void main (String[]args){//Chapter 5: Sort Algorithm
    String arr[] = getData(5);
    printArr(arr);

    for(int i =0; i< arr.length -1; i++){//SelectionSort//
        int index = i;
        for(int j = i+1; j < arr.length;j++){
            if (arr[j].compareToIgnoreCase(arr[index])> 0) {
                index = j;
            }
        }
        String smallerNum = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNum;//SelectionSort//
    }
    printArr(arr);
}//main//

public static String [] getData(int n){//getData to Insertionsort//
    String [] data = new String [n];
    Scanner sc = new Scanner(System.in);
for (int i = 0; i<n; i++){
    data[i] = sc.nextLine();
}
return data ;//getData to Insertionsort//
}//getData//

public static void printArr(String[]arr){//printArr to Bubble sort// 
    for(int i=0; i< arr.length; i++){
        System.out.println(arr[i] + " ");
    }
    System.out.println();//printArr to Bubble sort// 
    }//prinArr//
}