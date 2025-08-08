package ComparatorPractice;

import java.util.ArrayList;
import java.util.List;

public class SortStudByMarks {
    public static void main(String[] args) {
        List<Student> stud = new ArrayList<>();
        stud.add(new Student("Ram", 90));
        stud.add(new Student("Bob", 67));
        stud.add(new Student("Alice", 82));
        stud.add(new Student("Merry", 39));
        stud.add(new Student("Don", 95));


        for(Student st : stud){
            System.out.print("Name : " + st.getName()+" "+ "Marks: " + st.getMarks()+ "    ");
        }
        System.out.println();

        // 98 56
        stud.sort((a, b) -> a.getMarks() - b.getMarks());

        for(Student st : stud){
            System.out.print("Name : " + st.getName()+" "+ "Marks: " + st.getMarks()+ "    ");
        }
    }
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks){
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
