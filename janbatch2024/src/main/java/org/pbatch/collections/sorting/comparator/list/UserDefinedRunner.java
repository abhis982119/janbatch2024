package org.pbatch.collections.sorting.comparator.list;

import org.pbatch.classelements.constructor.chaining.selfconstructorchaning.A;
import org.pbatch.collections.sorting.model.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserDefinedRunner {

    public static void main(String[] args) {
        Employee naresh = Employee.builder().empId(1).name("Naresh").build();
        Employee sima = Employee.builder().empId(2).name("Sima").build();


        List<Employee> employees = new ArrayList<>();
        employees.add(sima);
        employees.add(naresh);

        System.out.println(employees);

       // Collections.sort(employees, new EmpIdComparator());
    //   Collections.sort(employees, new EmpNameComparator());



/*        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
               return Integer.compare(emp1.getEmpId(), emp2.getEmpId());
            }
        });

        System.out.println(employees);*/

        Collections.sort(employees, (Employee emp1, Employee emp2) -> Integer.compare(emp1.getEmpId(), emp2.getEmpId()));
     //   employees.sort( (Employee emp1, Employee emp2) -> Integer.compare(emp1.getEmpId(), emp2.getEmpId()));


        System.out.println(employees);

    }
}
