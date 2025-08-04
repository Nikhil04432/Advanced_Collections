package Comparable;

public class Student implements Comparable<Student>{
    private String name;
    private double roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name= '" + name + '\'' +
                ", roll=" + roll +
                "}\n";
    }

    @Override
    public int compareTo(Student o) {
        // return this.getRoll() - o.getRoll();            // return double but we need int so

        return Double.compare(this.getRoll(), o.getRoll());     // directly pass to Double's natural ordering
    }


}
