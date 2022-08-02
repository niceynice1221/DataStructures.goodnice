import java.util.*;

class TestLinkedCollection {
public static void main(String[] args) {
LinkedCollection mydata = new LinkedCollection();
System.out.println(mydata.isEmpty());
for(int i = 1;i<=5;i++) {
mydata.addL(input());
}
System.out.println("Data<1>: " + mydata);
boolean b = mydata.contains(input());
System.out.println(b);
mydata.remove(input());
System.out.println(mydata.size());
System.out.println("Data<2>: " + mydata);;
}

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}
