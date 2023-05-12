package summary4.domain;

import summary4.domain.Groups;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int YearBD;
    private String group;
    private int course;
    private double avdGrade;

    public Student(int id, String firstName, String lastName, int yearBD, String group, int course, double avdGrade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        YearBD = yearBD;
        this.group = group;
        this.course = course;
        this.avdGrade = avdGrade;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearBD() {
        return YearBD;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getAvdGrade() {
        return avdGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", YearBD=" + YearBD +
                ", group=" + group +
                ", course=" + course +
                ", avdGrade=" + avdGrade +
                '}';
    }
}
