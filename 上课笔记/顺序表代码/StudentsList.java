package ds01;

public class StudentsList {
    private Student [] students;
    private int maxLength;
    private int length;

    public StudentsList(int maxLength){
        this.maxLength = maxLength;
        students = new Student[maxLength];
    }

    public int getLength() {
        return this.length;
    }

    public void insert(int index, Student newStudent) throws Exception {
        if (index < 0 || index >= this.maxLength) {
            throw new Exception("角标超出了范围");
        }

        for (; index <= this.length; index++) {
            Student nextStudent = this.students[index];
            this.students[index] = newStudent;
            newStudent = nextStudent;
        }

        this.length ++;
    }

    public Student getStudentByIndex(int index){
        return this.students[index];
    }
}
