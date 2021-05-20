package sg.edu.rp.c346.id20025732.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Fourthactivity extends AppCompatActivity {

    TextView tvdisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);

        tvdisp = findViewById(R.id.textView5);
        Intent display = getIntent();
        Double dipsvalue = display.getDoubleExtra("value", 99.99);
        tvdisp.setText("Double value is: " + dipsvalue);
    }
}