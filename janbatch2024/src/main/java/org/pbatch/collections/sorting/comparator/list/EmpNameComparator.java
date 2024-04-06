package org.pbatch.collections.sorting.comparator.list;

import org.pbatch.collections.sorting.model.Employee;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
       return emp1.getName().compareTo(emp2.getName());
    }
}
