package com.example.caucse.myparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                ArrayList<String> names = new ArrayList<String>();
                names.add("권우람");
                names.add("우람권");

                intent.putExtra("names",names);

                SimpleData data = new SimpleData(100, "Hello");
                intent.putExtra("data", data); //파슬러블로 구현한 클래스이용해서 만든 객체를 넣을 수있음

                startActivityForResult(intent, 101);

            }
        });
    }
}

