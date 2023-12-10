package Lesson4.model;

public class Teacher extends User{
    int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }


    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
