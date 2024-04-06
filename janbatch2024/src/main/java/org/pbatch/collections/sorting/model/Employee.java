package org.pbatch.collections.sorting.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Employee {


    private int empId;

    private String name;
}
