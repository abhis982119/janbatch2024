package org.pbatch.collections.sorting.comparator.set;

import org.pbatch.collections.sorting.model.Employee;

import java.util.*;

public class EmployeeSortedRunner {

    public static void main(String[] args) {
        Employee naresh = Employee.builder().empId(1).name("Naresh").build();
        Employee sima = Employee.builder().empId(2).name("Sima").build();

        Set<Employee> employees = new HashSet<>();
        employees.add(naresh);
        employees.add(sima);

     //   Collections.sort(employees, (Employee emp1, Employee emp2) -> Integer.compare(emp1.getEmpId(), emp2.getEmpId()));

        /*
        SETS are not suitable for sorting as it  nor have have indexes and neither preserve order
         */



    }
}
