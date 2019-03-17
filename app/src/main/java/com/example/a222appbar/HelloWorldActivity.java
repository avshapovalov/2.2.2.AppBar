package com.example.a222appbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworld);

        final TextView textView = findViewById(R.id.textView);
        final EditText editName = findViewById(R.id.editTextName);
        final EditText editEmail= findViewById(R.id.editTextEmail);
        Button ok = findViewById(R.id.ok);
        Button clear = findViewById(R.id.clear);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Подписка на рассылку успешно оформлена для пользователя: " + editName.getText()
                        + "на электронный адрес: " + editEmail.getText());

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editEmail.setText("");
                editName.setText("");
                textView.setText("");
            }
        });

    }
}