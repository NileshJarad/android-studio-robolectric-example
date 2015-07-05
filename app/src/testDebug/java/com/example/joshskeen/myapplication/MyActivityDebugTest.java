package com.example.joshskeen.myapplication;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.ANDROID.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21, packageName = "com.example.joshskeen.myapplication")
public class MyActivityDebugTest {

    private static final String TAG = MyActivityTest.class.getSimpleName();

    private MyActivity mActivity;

    @Before
    public void setup() {
        mActivity = Robolectric.buildActivity(MyActivity.class).create().get();
    }

    @Test
    public void testBuildConfig() throws Exception {
        assertThat(mActivity.mBuildConfigTextView).hasText("build type: debug");
    }
}