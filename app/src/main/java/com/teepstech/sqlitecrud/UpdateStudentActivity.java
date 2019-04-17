package com.teepstech.sqlitecrud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_student);
    }

    public void updateButtonPressed(View view) {
        EditText oldNameET = findViewById(R.id.name1ET);
        EditText newNameET = findViewById(R.id.name2ET);
        EditText mobileET = findViewById(R.id.mobile1ET);

        String oldName = oldNameET.getText().toString();
        String newName = newNameET.getText().toString();
        String newMobile = mobileET.getText().toString();

        DatabaseHandler.updateUsingName(oldName, newName, newMobile);
        Toast.makeText(this, "Record updated", Toast.LENGTH_SHORT).show();

        oldNameET.setText("");
        newNameET.setText("");
        mobileET.setText("");
    }
}
