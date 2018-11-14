package com.example.mengdatian.vademo.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mengdatian.vademo.R;
import com.example.mengdatian.vademo.view.fragment.MainFragment;

/**
 * @author mengdatian
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
