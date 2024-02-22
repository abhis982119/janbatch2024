package org.pbatch.interview.createimmutableobject;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        ImmutableObject immutableObject = new ImmutableObject(10, Student.builder().name("Swati").build(), Employee.builder().name("Sima").build());
        System.out.println(immutableObject);

        Student student = immutableObject.getStudent();
        student.setName("Laila");

        Employee employee = immutableObject.getEmployee();
        employee.setName("Samosa");

        ImmutableObject clonedImmutableObject = immutableObject.clone();
        clonedImmutableObject.getEmployee().setName("Samosa");

        System.out.println(immutableObject);

    }
}
