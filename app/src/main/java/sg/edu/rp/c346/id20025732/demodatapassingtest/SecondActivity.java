package sg.edu.rp.c346.id20025732.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvpassint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvpassint = findViewById(R.id.textView);
        Intent i = getIntent();
        int optionSelected = i.getIntExtra("Value", 1);
        tvpassint.setText("Value is: " + optionSelected);

    }
}