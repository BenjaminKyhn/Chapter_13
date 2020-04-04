package Exercise_13_22;

public class Exercise_13_22 {
    public static void main(String[] args) {
        ComparableSquare square1 = new ComparableSquare(5);
        ComparableSquare square2 = new ComparableSquare(4);

        System.out.println(((square1.compareTo(square2) == 1) ? "Square 1 has " : "") +
                ((square1.compareTo(square2) == -1) ? "Square 2 has " : "") +
                ((square1.compareTo(square2) == 0) ? "The two squares have the same area." : "the larger area."));
    }
}
