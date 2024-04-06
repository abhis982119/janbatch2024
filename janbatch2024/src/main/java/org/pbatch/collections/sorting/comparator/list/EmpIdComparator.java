package org.pbatch.collections.sorting.comparator.list;

import org.pbatch.collections.sorting.model.Employee;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return Integer.compare(emp1.getEmpId(), emp2.getEmpId());
    }
}
