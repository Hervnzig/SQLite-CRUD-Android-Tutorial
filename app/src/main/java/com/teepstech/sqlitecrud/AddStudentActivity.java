package com.teepstech.sqlitecrud;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class AddStudentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

    }

    public void addButtonPressed(View view) {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText mobileEditText = findViewById(R.id.mobileEditText);

        String name = nameEditText.getText().toString();
        String mobile = mobileEditText.getText().toString();

        addToDatabase(name, mobile);

        nameEditText.setText("");
        mobileEditText.setText("");
    }


    private void addToDatabase(String name, String mobile) {
        DatabaseHandler.addToDatabase(name, mobile);
        Toast.makeText(this, "Record Added",Toast.LENGTH_SHORT).show();
    }
}
