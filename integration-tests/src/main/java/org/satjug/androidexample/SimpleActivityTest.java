package org.satjug.androidexample;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

public class SimpleActivityTest extends ActivityInstrumentationTestCase2 {

    private Activity activity;
    private EditText editText;
    private Button button;

    public SimpleActivityTest() {
        super("org.satjug.androidexample", SimpleActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(false);
        activity = getActivity();
        editText = (EditText) activity.findViewById(R.id.inputNumber);
        button = (Button) activity.findViewById(R.id.calcSquare);
    }

    public void testEditText() {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                editText.requestFocus();
            }
        });

        this.sendKeys("55");

        //assertEquals("55", editText.getText().toString());
    }
}
