import java.util.ArrayList;

public class Exercise_13_03 {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(47);
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(3);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size(); i++) {
            double currentMin = list.get(i).doubleValue();
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin > list.get(j).doubleValue()){
                    currentMin = list.get(j).doubleValue();
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list.remove(currentMinIndex);
                list.add(currentMinIndex, list.get(i));
                list.remove(i);
                list.add(i, currentMin);
            }
        }
    }
}
