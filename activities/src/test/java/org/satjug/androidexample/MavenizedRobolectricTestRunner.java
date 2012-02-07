package org.satjug.androidexample;

import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.runners.model.InitializationError;

import java.io.File;

/**
 * User: adrian.george
 * Date: 2/7/12
 * Time: 3:38 PM
 */
public class MavenizedRobolectricTestRunner extends RobolectricTestRunner{
    public MavenizedRobolectricTestRunner(Class testClass) throws InitializationError {
        super(testClass, new File("src/main/resources/AndroidManifest.xml"), new File("src/main/resources/res"));
    }
}
