package com.ric17.software.daggerapplication

import android.content.Intent
import org.junit.Before
import android.app.Activity
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class TestFragment {

    @Rule
    var rule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java, false, false)

    private var launchedActivity: Activity? = null

    @Before
    fun setup() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.putExtra("parameter", "Value")
        launchedActivity = rule.launchActivity(intent)
    }
}