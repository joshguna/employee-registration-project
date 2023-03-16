package com.joshguna.bootstrap;

import com.joshguna.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void saveEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static List<Employee> readAllEmployees() {
        return employeeList;
    }

    public static List<String> getAllStates() {

        return Arrays.asList(
                "AK",
                "AL",
                "AR",
                "AS",
                "AZ",
                "CA",
                "CO",
                "CT",
                "District of Columbia",
                "DE",
                "FL",
                "GA",
                "GU",
                "HI",
                "IA",
                "ID",
                "IL",
                "IN",
                "KS",
                "KY",
                "LA",
                "MA",
                "MD",
                "ME",
                "MI",
                "MN",
                "MO",
                "MP",
                "MS",
                "MT",
                "NC",
                "ND",
                "NE",
                "NH",
                "NJ",
                "NM",
                "NV",
                "NY",
                "OH",
                "OK",
                "OR",
                "PA",
                "PR",
                "RI",
                "SC",
                "SD",
                "TN",
                "TX",
                "UM",
                "UT",
                "VA",
                "VI",
                "VT",
                "WA",
                "WI",
                "WV",
                "WY"
        );


    }

}
