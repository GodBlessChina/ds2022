package ds01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {
        // StudentsList studentsList = new StudentsList(1024);
        Student s1 = new Student();
        s1.setAge(19);
        s1.setName("张三");

        Student s2 = new Student();
        s2.setAge(20);
        s2.setName("李四");

        Student s3 = new Student();
        s3.setAge(21);
        s3.setName("王五");

//        ArrayList<Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
        System.out.println();

//        studentsList.insert(0,s1);
//        studentsList.insert(0,s2);
//        studentsList.insert(0,s3);

//        for (int i = 0; i < studentsList.getLength(); i++) {
//            System.out.println(studentsList.getStudentByIndex(i).getName());
//        }
    }
}
