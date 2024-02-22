package org.pbatch.exceptionhandling.userdefinedexceptions.runtime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@ToString
@Getter
public class Male {

    private String name;

    private int age;
}
