package StreamQuestion;


import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    int age;
    double salary;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    Employee(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", " + age + ", ₹" + salary + ")";
    }
}

class Company {
    String name;
    List<Employee> employees;

    Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }
}

public class AdvancedStreamQuestion {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Nikhil", "IT", 32, 90000),
                new Employee("Ravi", "HR", 28, 45000),
                new Employee("Atul", "IT", 35, 120000),
                new Employee("Aniket", "Finance", 40, 80000),
                new Employee("Pawan", "IT", 29, 70000),
                new Employee("Tejas", "Finance", 31, 110000),
                new Employee("Omi", "HR", 38, 60000),
                new Employee("Ramesh", "IT", 41, 95000)
        );

        // 2️⃣ Base list of companies (for question 10)
        List<Company> companies = List.of(
                new Company("AlphaCorp", List.of(
                        new Employee("Nikhil", "IT", 32, 90000),
                        new Employee("Ravi", "HR", 28, 45000)
                )),
                new Company("BetaTech", List.of(
                        new Employee("Atul", "IT", 35, 120000),
                        new Employee("Aniket", "Finance", 40, 80000),
                        new Employee("Pawan", "IT", 29, 70000)
                )),
                new Company("GammaSoft", List.of(
                        new Employee("Tejas", "Finance", 31, 110000),
                        new Employee("Omi", "HR", 38, 60000),
                        new Employee("Ramesh", "IT", 41, 95000)
                ))
        );

        /*1️⃣ Get all employee names in uppercase who work in the "IT" department.
         2️⃣ Find the average salary of employees older than 30.
         3️⃣ List names of top 3 highest-paid employees.
         4️⃣ Find if any employee’s salary exceeds ₹1,00,000.
          5️⃣ Sort employees by salary (descending) and then by name.
           6️⃣ Extract all departments (unique) from the employee list.
            7️⃣ Calculate total salary of all employees using mapToDouble() and sum().
             8️⃣ Get the second-highest salary in the company.
              9️⃣ Find all employees whose names start with "N" or "R" and collect their names sorted.
               🔟 Flatten a list of companies, each containing a list of employees, into a single list of employee names.
  */

    //1️⃣ Get all employee names in uppercase who work in the "IT" department.
        Map<String, List<String>> itEmployee = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(e -> e.getName().toUpperCase(), Collectors.toList())
                ));

        List<String> itEmployee2 = employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .map(e -> e.getName().toUpperCase())
                .collect(Collectors.toList());

//        System.out.println(itEmployee.getOrDefault("IT", Collections.emptyList()));
//        System.out.println(itEmployee2);

        //2️⃣ Find the average salary of employees older than 30.
        OptionalDouble avg = employees.stream()
                .filter(e -> e.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .average();

        System.out.println(avg.getAsDouble());

       // 3️⃣ List names of top 3 highest-paid employees.

        List<String> top3 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .toList();

        System.out.println(top3);


        //4️⃣ Find if any employee’s salary exceeds ₹1,00,000.
        List<String> highSal = employees.stream()
                .filter(n -> n.getSalary() > 100000)
                .map(Employee::getName)
                .toList();

       // System.out.println(highSal);

        // 5️⃣ Sort employees by salary (descending) and then by name.
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName).reversed())
                .toList();

        //System.out.println(sorted);

        //6️⃣ Extract all departments (unique) from the employee list.
        Map<String, List<String>> grupedByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        //System.out.println(grupedByDept);


        //            7️⃣ Calculate total salary of all employees using mapToDouble() and sum().
        OptionalDouble sumOfSalary = employees.stream()
                .mapToDouble(n -> n.getSalary())
                .reduce(Double::sum);

        System.out.println(sumOfSalary);
        //             8️⃣ Get the second-highest salary in the company.
        double secondHighest = employees.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(secondHighest);



        //              9️⃣ Find all employees whose names start with "N" or "R" and collect their names sorted.
        List<Employee> sortNmae = employees.stream()
                .filter(n -> n.getName().startsWith("N") || n.getName().startsWith("R"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        // List<String> selectedNames = employees.stream()
        //                .map(Employee::getName)
        //                .filter(name -> name.startsWith("N") || name.startsWith("R"))
        //                .sorted()
        //                .toList();

        System.out.println(sortNmae);
        //               🔟 Flatten a list of companies, each containing a list of employees, into a single list of employee names.

        List<String> allNmaes = companies.stream()
                .flatMap(company -> company.employees.stream())
                .map(Employee::getName)
                .toList();

        System.out.println(allNmaes);
    }
}

/*      Mistakes done by me :

        ✅ 1. Using groupingBy() when simple filter + map was enough

Your code (extra/unnecessary grouping):

Map<String, List<String>> itEmployee = employees.stream()
    .collect(Collectors.groupingBy(
        Employee::getDepartment,
        Collectors.mapping(e -> e.getName().toUpperCase(), Collectors.toList())
    ));


Better:

employees.stream()
    .filter(e -> "IT".equals(e.getDepartment()))
    .map(e -> e.getName().toUpperCase())
    .toList();

Mistake Summary:

You introduced grouping logic where the problem only needed filtering.

Why interviewers care:

Choosing the simplest correct stream pipeline shows you understand what each collector is meant for.

✅ 2. Wrong sorting in Question 6

Your code:

.sorted((a,b) -> a.length() - b.length())
.sorted()


The second .sorted() overrides the first sorting, losing the “sort by length” requirement.

Correct:
.sorted(Comparator.comparingInt(String::length)
        .thenComparing(Comparator.naturalOrder()))

What to remember:

Use .thenComparing() for multi-level sorting, not multiple .sorted() calls.

✅ 3. Using reduce(Double::sum) instead of sum()

Your code:

OptionalDouble sumOfSalary = employees.stream()
        .mapToDouble(n -> n.getSalary())
        .reduce(Double::sum);


Better:

double totalSalary = employees.stream()
        .mapToDouble(Employee::getSalary)
        .sum();

Why avoid reduce for numeric sum?

mapToDouble().sum() is clearer, faster, and optimized.

Using reduce() here is considered anti-pattern in interviews.

✅ 4. Getting Optional values using .get()

Your code:

avg.getAsDouble();


If no employee age > 30 exists → runtime exception.

Safer:
avg.orElse(0);

Interview takeaway:

Always handle Optionals safely → .orElse(), .orElseThrow(), .ifPresent()

✅ 5. Checking null using x -> x != null

Better:

.filter(Objects::nonNull)

Why?

Cleaner, readable, and widely recognized in interviews.

✅ 6. Complex sorting reversed incorrectly

Your code:

.sorted(Comparator.comparingDouble(Employee::getSalary)
        .thenComparing(Employee::getName)
        .reversed())


This reverses both conditions combined, which is okay only if intended.
However, interviewers may expect explicit intent:

Cleaner:
.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
        .thenComparing(Employee::getName))

* */