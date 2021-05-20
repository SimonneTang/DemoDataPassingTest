package sg.edu.rp.c346.id20025732.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {
    TextView tvchar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvchar = findViewById(R.id.textView2);
        Intent i = getIntent();
        Character value = i.getCharExtra("Value",'a');
        tvchar.setText("Value is: " + value);

    }
}