package com.szwyx.smalldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import net.wequick.small.Small;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.textButton);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "我来自app", Toast.LENGTH_SHORT).show();


                Small.setUp(MainActivity.this, new Small.OnCompleteListener() {
                    @Override
                    public void onComplete() {
//            Small.openUri("huanxinchat", MainActivity.this);
                        Small.openUri("home", MainActivity.this);
                    }
                });
            }
        });
    }
}
