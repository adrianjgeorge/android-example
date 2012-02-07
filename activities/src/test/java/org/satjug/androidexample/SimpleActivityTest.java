package org.satjug.androidexample;


import android.widget.Button;
import android.widget.EditText;
import com.xtremelabs.robolectric.shadows.ShadowToast;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(MavenizedRobolectricTestRunner.class)
public class SimpleActivityTest {

    private SimpleActivity activity;
    private EditText editText;
    private Button button;

    @Before
    public void setUp() throws Exception {
        activity = new SimpleActivity();
        activity.onCreate(null);
        editText = (EditText) activity.findViewById(R.id.inputNumber);
        button = (Button) activity.findViewById(R.id.calcSquare);
    }

    @Test
    public void button_triggersToast() throws Exception {
        editText.setText("2");
        button.performClick();
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("The square of 2 is 4"));
    }
}
