package com.example.a222appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a222appbar.R;

import java.util.Random;

public class HelloWorld2Activity extends AppCompatActivity {
    private void openNewPage() {
        Intent intent = new Intent(this , this.getClass());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld2);
        Random random = new Random();
        int num = random.nextInt(100);

        TextView picture = findViewById(R.id.picture);
        final TextView link = findViewById(R.id.link);
        link.setText("http://myfile.org/" + num);
        Button forward = findViewById(R.id.forward);
        Button backward = findViewById(R.id.backward);

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage();
            }
        });

        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
