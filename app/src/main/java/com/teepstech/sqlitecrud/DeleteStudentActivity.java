package com.teepstech.sqlitecrud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteStudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_student);
    }

    public void deleteButtonPressed(View view) {
        EditText editText = findViewById(R.id.deleteEditText);
        String text = editText.getText().toString();
        int deleted = DatabaseHandler.deleteUsingName(text);
        Toast.makeText(this, deleted +" records deleted", Toast.LENGTH_SHORT).show();
        editText.setText("");
    }
}
