import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Pham Van A", 10, 1));
        students.add(new Student("Hoang Van A", 9, 2));
        students.add(new Student("Nguyen Van B", 5, 3));
        students.add(new Student("Hoang Van C", 10, 4));
        students.add(new Student("Pham Van A", 5, 5));
        students.add(new Student("Pham Van G", 4, 6));
        students.add(new Student("Pham Van H", 10, 7));
        students.add(new Student("Pham Van I", 2, 8));
        students.add(new Student("Hoang Van G", 1, 9));
        students.add(new Student("Hoang Van A", 7, 10));


        System.out.println("");
        for (Student i : students) {
            System.out.println(i);
        }

        // #1. Sắp xếp học sinh theo fullName, neu giống fullName thì ai nhiều tuổi hơn thì đứng trước.

        System.out.println("========== Task1 ===============");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getFullName().compareTo(o2.getFullName()) == 0) {
                    return o2.getAge() - o1.getAge();
                }
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        for (Student i : students) {
            System.out.println(i);
        }
        System.out.println("========== Task1 ===============");

        System.out.println("========== Task2 ===============");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if ((o1.getAge() - o2.getAge() == 0)) {
                    return o2.getGPA() - o1.getGPA();
                }
                return o1.getAge() - o2.getAge();
            }
        });
        for (Student i : students) {
            System.out.println(i);
        }
        System.out.println("========== Task2 ===============");

        System.out.println("========== Task3 ===============");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String sO1 = getName(o1.getFullName());
                String sO2 = getName(o2.getFullName());
                return sO1.compareTo(sO2);
            }
        });

        for (Student i : students) {
            System.out.println(i);
        }
        System.out.println("========== Task3 ===============");


    }

    public static String getName(String s) {
        s = s.trim();
        if (s.indexOf(" ") > 0) {
            int position = s.lastIndexOf(" ");
            return s.substring(position + 1);
        } else {
            return s;
        }
    }

}
