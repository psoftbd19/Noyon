package com.noyon.noyon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NoyonActivity extends AppCompatActivity {


    List<Employee> employeeList = DataProvider.employeeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noyon);

        TextView objNoyon=findViewById(R.id.noyonTv);
        objNoyon.setText("");

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                return o1.getName().compareTo(o2.getName());

            };
        });


        for (Employee temp :
                employeeList) {


            objNoyon.append(temp.getName()+"\n");
        }




    }

}
