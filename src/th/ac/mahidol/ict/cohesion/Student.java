package th.ac.mahidol.ict.cohesion;

public class Student {
    private String name;
    private int age;
    private double[] grades;

    // Functional cohesion
    public double computeGPA() {
        double sum = 0;
        for (double i: grades) {
            sum += i;
        }
        return sum/grades.length;
    }

    // Sequential cohesion: format and then validate the GPA
    public void formatAndValidateGPA() {
        double gpa = computeGPA();
        // format the GPA to be 2 decimal points
        String strGpa = String.format("%.2f", gpa);
        // check if the GPA is valid
        if (gpa >= 0) {
            System.out.println("Formatted GPA: " + strGpa);
        } else {
            System.out.println("Error");
        }
    }

    // Communicational cohesion
    public void currentAndCumulativeGPA() {
        // compute both current and cumulative GPA based on the same data
        double currentGPA = 0;
        double cumulativeGPA = 0;
        double sum = 0;
        for (int i=2; i<=4; i++) {
            sum += grades[i];
        }
        currentGPA = sum/3;
        sum = 0;
        for (int i=0; i<grades.length; i++) {
            sum += grades[i];
        }
        cumulativeGPA = sum/grades.length;
        System.out.println("Current GPA: " + currentGPA);
        System.out.println("Cumulative GPA: " + cumulativeGPA);
    }

    // Procedural cohesion
    public void gpaRelatedWork() {
        // compute GPA
        double gpa = computeGPA();
        // print the GPA from the printer
        printGPA(gpa);
        // computer cumulative GPA
        double sum = 0;
        for (int i=0; i<grades.length; i++) {
            sum += grades[i];
        }
        double cumulativeGPA = sum/grades.length;
        // print the cumulative GPA
        printGPA(cumulativeGPA);
    }

    // Temporal cohesion
    public void initialize() {
        this.grades =  new double[5];
        grades[0] = 3.5;
        grades[1] = 4;
        grades[2] = 1;
        grades[3] = 1.5;
        grades[4] = 2;
        preparePrinter();
    }

    // Logical cohesion
    public void gpaOptions(int flag) {
        if (flag == 0) {
            setName("Joe");
        } else if (flag == 1) {
            setAge(22);
        } else if (flag == 3) {
            System.out.println(computeGPA());
        }
    }

    // Coincidental cohesion
    public void chaotic() {
        computeGPA();
        setClassName("ITCS431 SW Design and Dev");
        getTuitionFee();
        adjustUI();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.initialize();
        System.out.println("GPA: " + s1.computeGPA());
        s1.formatAndValidateGPA();
        s1.currentAndCumulativeGPA();
        s1.gpaRelatedWork();
        s1.gpaOptions(0);
    }

    public void printGPA(double gpa) {
        // sent the GPA to the printer to print
    }

    public void preparePrinter() {
        // prepare the printer driver and the connection to the printer
    }

    public void setClassName(String name) {
        // set the class name
    }

    public void getTuitionFee() {
        // return tuition fee of the semester
    }

    private void adjustUI() {
        // fix the size of the window
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
