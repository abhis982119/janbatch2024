package org.pbatch.interview.wrapper;


import java.util.LinkedList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Student student = Student.builder().name("Swati").rollNumber(1).build();
        System.out.println(student);

        MyClass myClass = new MyClass();
        myClass.changeName(student);


        System.out.println(student);


        Integer value = Integer.valueOf(10);
        System.out.println(value);  // 10
        change(value);
        System.out.println(value);   //20

        String s1 = "Swati";
        String s2 = s1;
        s2 = "Sima";

        System.out.println(s1);
        System.out.println(s2);

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }

    public static void change(Integer value){
        value = 20;
    }

    /*

    ----                     --------
    main()                   change                            Heap

    ----                    --------                         -----------

    value = 8098098         value = 98988079                     8098098
                                                                Integer{ 10}

                                                                98988079
                                                                Integer{20}
    ----
    */
}
