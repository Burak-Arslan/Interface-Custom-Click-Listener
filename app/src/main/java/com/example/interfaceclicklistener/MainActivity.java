package com.example.interfaceclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomObjects customObjects = new CustomObjects();

        customObjects.setListener(new CustomObjects.MyCustomObjectsListener() {
            @Override
            public void onObjectReady(String title) {
                Toast.makeText(MainActivity.this, title, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDataLoaded(String title) {
                Toast.makeText(MainActivity.this, title, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
