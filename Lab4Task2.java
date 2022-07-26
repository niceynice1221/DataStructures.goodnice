public class Lab4Task2 {
    public static void main(String[] args) {

        int data[]= {4,2,3,9,8,1,0,5};
        int out[] = selectionSort(data);
        Lab4Task1.printArray(out);
        }
        public static int[] selectionSort(int[] d){
        int[] ans = new int[d.length];
        for(int i =0;i<d.length;i++){
            ans[i]=d[i];
        }
        for (int i = 0; i < ans.length - 1; i++)
        {
        int index = i;
        for (int j = i + 1; j < ans.length; j++)
        if (ans[j] < ans[index])
        index = j;
        int smallerNumber = ans[index];
        ans[index] = ans[i];   
        ans[i] = smallerNumber;
        System.out.print(i+": ");
        Lab4Task1.printArray(ans);
        }
        return ans;
        }
     }// class

