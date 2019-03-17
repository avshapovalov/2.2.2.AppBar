package com.example.a222appbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            Toast.makeText(MainActivity.this, "Записная книжка", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_open_calendar) {
            Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentCalendar);
            Toast.makeText(MainActivity.this, "Сроки задачи", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_open_spinner) {
            Intent intentSpinner = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentSpinner);
            Toast.makeText(MainActivity.this, "Страны-города-улицы", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_open_checkbox) {
            Intent intentCheckBox= new Intent(MainActivity.this, CheckBoxActivity.class);
            startActivity(intentCheckBox);
            Toast.makeText(MainActivity.this, "Взаимоисключающие CheckBox", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_open_helloworld2) {
            Intent intenHelloWorld2= new Intent(MainActivity.this, HelloWorld2Activity.class);
            startActivity(intenHelloWorld2);
            Toast.makeText(MainActivity.this, "Бесконечный переход между экранами", Toast.LENGTH_LONG).show();
            return true;
        }
        if (id == R.id.action_open_helloworld) {
            Intent intenHelloWorld= new Intent(MainActivity.this, HelloWorldActivity.class);
            startActivity(intenHelloWorld);
            Toast.makeText(MainActivity.this, "Универсальная форма ввода", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
