package CollectionQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBySalaryThenName {
    public static void main(String[] args) {
        Student stud1 = new Student("Pawan" , 45000);
        Student stud2 = new Student("Arabali" , 85000);
        Student stud6 = new Student("Aarabali" , 85000);
        Student stud3 = new Student("Vansh" , 30000);
        Student stud4 = new Student("Kunal" , 60000);
        Student stud5 = new Student("Jay" , 30000);

        List<Student> list = new ArrayList<>();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        list.add(stud5);
        list.add(stud6);

        System.out.println("Before");
        for(Student st : list){
            System.out.println("Name : " + st.getName()+ ", "+ "Salary = "+  st.getSalary());
        }
 //       System.out.println(list);       // want to print directly then override toString()

 //       Collections.sort(list,(a,b) -> (int) (b.getSalary() - a.getSalary()));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {

                int res = Double.compare(b.getSalary(), a.getSalary());
                if(res == 0){
                    return a.getName().compareTo(b.getName());
                }
                return res;
            }
        });

        System.out.println("After");
        for(Student st : list){
            System.out.println("Name : " + st.getName()+ ", "+ "Salary = "+  st.getSalary());
        }


    }
}

class Student {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Student(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
