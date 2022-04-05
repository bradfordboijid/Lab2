package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if (mCount % 2 == 0) {
            findViewById(R.id.button_count).setBackgroundColor(getResources().getColor(R.color.teal_700));
        } else {
            findViewById(R.id.button_count).setBackgroundColor(getResources().getColor(R.color.black));
        }
        if (mCount > 0)
            findViewById(R.id.button_reset).setBackgroundColor(getResources().getColor(R.color.pink));
    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        findViewById(R.id.button_count).setBackgroundColor(getResources().getColor(com.google.android.material.R.color.design_default_color_primary));
        findViewById(R.id.button_reset).setBackgroundColor(getResources().getColor(R.color.grey));
    }
}
