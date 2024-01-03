package com.example.third_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.CountDownTimer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int counter;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go_sec_page();
    }
    void go_sec_page(){
        Button b_sec_page=(Button) findViewById(R.id.b_main);
        b_sec_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_sec_page();
            }
        });
    }
    void open_sec_page() {
        Intent intent = new Intent(this, PhotoActivity.class);
        startActivity(intent);
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long l) {
                textView.setText(String.valueOf(counter));
                counter--;
                         }
            @Override
            public void onFinish() {
                startActivity(intent);
            }
        };

    }
}