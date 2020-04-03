import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    /** Override the protected clone method defined in the Object class, and strengthen its accessibility */
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        House houseClone = (House) super.clone();
        // Deep copy on whenBuilt
        houseClone.whenBuilt = (java.util.Date) (whenBuilt.clone());
        return houseClone;
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(House o) {
        if (area > o.area)
            return 1;
        else if (area < o.area)
            return -1;
        else
            return 0;
    }
}
