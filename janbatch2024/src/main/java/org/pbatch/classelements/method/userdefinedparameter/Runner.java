package org.pbatch.classelements.method.userdefinedparameter;

public class Runner  {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Swati");
        student.setRollNumber(1303213004);

        print(student);
    }

    public static void print(Student student){
        System.out.println(student);
    }
}
