package com.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int n1 = 1; // first value
    private int n2 = 1; // second value
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

     public void countUp(View view){
        int fib = n1 + n2; // fibonacci sequence
         n1 = n2; // fibonacci sequence
         n2 = fib; // fibonacci sequence

        mShowCount.setText(Integer.toString(n1));
     }
}