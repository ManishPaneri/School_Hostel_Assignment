package school;

import java.util.Objects;

public class Student {

    private String rollNumber;

    private Classes classes;

    private String foodPreference;

    public Student(String rollNumber, Classes classes, String foodPreference){
        this.rollNumber = rollNumber;
        this.classes = classes;
        this.foodPreference = foodPreference;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public Classes getClasses() {
        return classes;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber);
    }
}
