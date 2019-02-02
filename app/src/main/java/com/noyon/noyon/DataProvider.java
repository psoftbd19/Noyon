package com.noyon.noyon;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataProvider {

    public static List<Employee> employeeList;
    public static Map<String, Employee> employeeMap;

    static {

        employeeList = new ArrayList<>();
        employeeMap = new HashMap<>();


        Employee e1=new Employee("XX", "SOFT", "0088");
        Employee e2=new Employee("AB", "SOFT-EN", "0011");
        Employee e3=new Employee("YY", "SOFT-SEN", "0022");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
    }

}
