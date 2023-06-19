import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student("Luca");
        Student student2 = new Student("Rosa");

        // Add grades for each student
        student1.addGrade(29);
        student1.addGrade(28);
        student1.addGrade(30);

        student2.addGrade(27);
        student2.addGrade(30);
        student2.addGrade(28);

        // Calculate and display the average grade for each student
        double averageGrade1 = student1.getAverageGrade();
        double averageGrade2 = student2.getAverageGrade();

        System.out.println("Average grade for " + student1.getName() + ": " + averageGrade1);
        System.out.println("Average grade for " + student2.getName() + ": " + averageGrade2);

        // Compare the average grades and display the student with the higher average grade
        if (averageGrade1 > averageGrade2) {
            System.out.println(student1.getName() + " has a higher average grade.");
        } else if (averageGrade2 > averageGrade1) {
            System.out.println(student2.getName() + " has a higher average grade.");
        } else {
            System.out.println("Both students have the same average grade.");
        }
    }
}