import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject(){
        dateCreated = new Date();
    }

    /** Construct a geometric object with a color and filled value */
    protected GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2){
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    /** Return color */
    public String getColor(){
        return color;
    }

    /** Set new color */
    public void setColor(String color){
        this.color = color;
    }

    /** Return filled */
    public boolean isFilled(){
        return filled;
    }

    /** Set new filled */
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /** Get date created */
    public Date getDateCreated(){
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method gerPerimeter */
    public abstract double getPerimeter();
}
