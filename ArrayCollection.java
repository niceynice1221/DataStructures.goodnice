public class ArrayCollection {
    private Object[] elementData;
    private int size = 0;

    public ArrayCollection(int n) {
        elementData = new Object[n];
        size = 0;
    }

    int size() {
        return size;
    }

    public void add(Object d) {
        elementData[size] = d;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int search(Object x) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(x)){
               return i;
            }
        return -1;
    }
    }
    public boolean contains(Object object) {
        return search(object) != -1;
    }
    public String toString() {
        String ans = "";
        for(int i=0; i<size; i++){
        ans = ans + elementData[i] + ",";
        }
        return ans;
        }
    public void remove(Object obj) {
        int n = search(obj);
        if (n == -1) {
            System.out.print("no such object");
        } else {
            for (int i = n + 1; i < size; i++) {
                elementData[i - 1] = elementData[i];
            }
            size--;
            elementData[size] = null;
        }
    }
}

