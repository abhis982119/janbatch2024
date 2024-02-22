package org.pbatch.interview.wrapper;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
public class Student {

    private String name;

    private int rollNumber;
}
