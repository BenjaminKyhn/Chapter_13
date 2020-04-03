import java.util.ArrayList;

public class Exercise_13_02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        average(list);
    }


    public static void average(ArrayList<Integer> list){
        double sum = 0;
        for (Integer i :
                list) {
            sum += i;
        }
        System.out.println("The average in list is " + sum/list.size());
    }
}
