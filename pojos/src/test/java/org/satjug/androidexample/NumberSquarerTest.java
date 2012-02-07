package org.satjug.androidexample;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * User: adrian.george
 * Date: 2/7/12
 * Time: 1:16 PM
 */
public class NumberSquarerTest {
    NumberSquarer squarer = new NumberSquarer();

    @Test
    public void squareIt_zeroSucceeds() throws Exception {
        assertThat(squarer.squareIt(0), equalTo(0));
    }

    @Test
    public void squareIt_positiveSucceeds() throws Exception {
        assertThat(squarer.squareIt(3), equalTo(9));
    }

    @Test
    public void squareIt_negativeSucceeds() throws Exception {
        assertThat(squarer.squareIt(-13), equalTo(169));
    }
}
