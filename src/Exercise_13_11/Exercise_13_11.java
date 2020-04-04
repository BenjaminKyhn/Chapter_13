package Exercise_13_11;

public class Exercise_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon1 = new Octagon(5);
        Octagon octagon2 = octagon1.clone();

        if (octagon1.compareTo(octagon2) == 0)
            System.out.println("The two octagons have equal areas.");
        else
            System.out.println("The two octagons have different areas.");
    }
}
