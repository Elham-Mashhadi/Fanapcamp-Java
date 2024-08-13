package test.person;

import test.Classroom;
import test.Study;

public class Student extends Person implements Study {

    private long studentId;
    private String entranceYear;
    private String field;
    private Classroom classroom;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    public void read(){
        System.out.println("studying");
    }
    public void participateInClass(Classroom classroom){
        this.classroom=classroom;
        System.out.println(classroom.getName());
    }

    public Student(String firstName, String lastName, String nationalCode, Gender gender, long studentId, String entranceYear, String field) {
        super(firstName, lastName, nationalCode, gender);
        this.studentId = studentId;
        this.entranceYear = entranceYear;
        this.field = field;
    }
}
