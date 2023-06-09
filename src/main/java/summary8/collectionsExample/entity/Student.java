package summary8.collectionsExample.entity;

import java.util.Objects;

public class Student {
    private int personalCode;
    private String name;
    private String description;

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return personalCode == student.personalCode && Objects.equals(name, student.name) && Objects.equals(description, student.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalCode, name, description);
    }

    @Override
    public String toString() {
        return "Student{" +
                "personalCode=" + personalCode +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
