import java.util.ArrayList;

/*
Simple java program to deceleration of arraylist
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        // adding an element

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(50);
        for (Integer integer : a) {
            System.out.println(integer);
        }
        // printing as a set
        System.out.println("set : " + a);
        // adding element at some index i [ 10 100 20 30 50] without removing
        a.add(1,100);
        System.out.println(a);
        // modifying the value at index i
        a.set(2, 10);
        System.out.println(a);
        // removing the element
        a.remove(1);
        System.out.println(a);
        // removing element
        a.remove(Integer.valueOf(100));
        System.out.println(a);
        // checking if an element exists
        boolean ans = a.contains(200);
        System.out.println(ans);
        // if we don't specify class, you can put anything inside a
        ArrayList av = new ArrayList<>();
        av.add("sunny");
        av.add(100);
        av.add(true);
        System.out.println(av);
    }
}