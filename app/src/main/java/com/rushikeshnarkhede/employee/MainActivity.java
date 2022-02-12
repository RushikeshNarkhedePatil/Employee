package com.rushikeshnarkhede.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHandler dbHandler= new DBHandler(this,"empdb",null,1);
        dbHandler.addEmployee(new Employee(1,"Rushikesh",121.1));
        dbHandler.getEmployee(1);
        dbHandler.close();
    }
}
