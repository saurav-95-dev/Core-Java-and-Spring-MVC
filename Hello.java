import java.util.*;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Profession implements Comparable<Profession> {
    String role;
    int salary;

    public Profession(int salary, String role) {
        this.salary = salary;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int compareTo(Profession that) {
        if (this.role.length() > that.role.length())
            return 1;
        else if (this.role.length() < that.role.length())
            return -1;
        else
            return 0;
    }
}

class Tech {
    int rating;
    String stack;

    public Tech(int rating, String stack) {
        this.rating = rating;
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "rating=" + rating +
                ", stack='" + stack + '\'' +
                '}';
    }
}

class Hello {
    public static void main(String[] args) {

        Comparator<Tech> t1 = new Comparator<Tech>() {
            public int compare(Tech s1, Tech s2) {
                return Integer.compare(s1.rating, s2.rating);
            }
        };

        Comparator<Student> c4 = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.name.length(), s2.name.length());
            }
        };

        Comparator<Student> c3 = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        };

        Comparator<Integer> com = (i, j) -> Integer.compare(i % 10, j % 10);

        Comparator<String> c1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        List<Integer> l = new ArrayList<>(Arrays.asList(12, 13, 55, 71, 90, 88));
        Collections.sort(l, com);
        System.out.println("Sorted Integers: " + l);

        List<Student> v = new ArrayList<>(Arrays.asList(
                new Student(25, "Saurabh dev"),
                new Student(21, "Laukik"),
                new Student(15, "Himanshu"),
                new Student(28, "Aviral"),
                new Student(22, "Ali")
        ));

        Collections.sort(v, c3);
        System.out.println("Sorted Students by Age: " + v);

        Collections.sort(v, c4);
        System.out.println("Sorted Students by Name Length: " + v);

        List<Profession> p = new ArrayList<>(Arrays.asList(
                new Profession(3000000, "Software Engineer"),
                new Profession(102300, "BA"),
                new Profession(102000, "Tester"),
                new Profession(220080, "Manager"),
                new Profession(10000, "Service Desk")
        ));

        Collections.sort(p);
        System.out.println("Sorted Profession by Role Length: " + p);

        List<Tech> t = new ArrayList<>(Arrays.asList(
                new Tech(4, "Java"),
                new Tech(6, "Springboot"),
                new Tech(3, "C"),
                new Tech(2, "COBOL")
        ));

        Collections.sort(t, t1);
        System.out.println("Sorted Tech by Rating: " + t);
    }
}
