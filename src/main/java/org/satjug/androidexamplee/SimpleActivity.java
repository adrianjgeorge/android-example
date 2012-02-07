package org.satjug.androidexamplee;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SimpleActivity extends Activity
{
    private EditText inputNumber;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        inputNumber = (EditText) findViewById(R.id.inputNumber);
    }

    public void calculateTheSquare(View view) {
        int number = Integer.valueOf(inputNumber.getText().toString());
        int total = number * number;
        Toast.makeText(this, "The square of " + number + " is " + total, Toast.LENGTH_SHORT).show();
    }
}
