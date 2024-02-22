package org.pbatch.interview.createimmutableobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
public final class ImmutableObject implements Cloneable{

      private final int value;

      private final Student student;

      private final Employee employee;


      public Student getStudent() throws CloneNotSupportedException {
            return student.clone();
      }

      public Employee getEmployee(){
            return new Employee(employee.getName());
      }


      @Override
      protected ImmutableObject clone() throws CloneNotSupportedException {
            Student clonedStudent = Student.builder().name(student.getName()).build();
            Employee clonedEmployee = Employee.builder().name(employee.getName()).build();
            return new ImmutableObject(value, clonedStudent, clonedEmployee);
      }

      @Override
      public String toString() {
            return "ImmutableObject{" +
                    "value=" + value +
                    ", student=" + student +
                    ", employee=" + employee +
                    '}';
      }
}
