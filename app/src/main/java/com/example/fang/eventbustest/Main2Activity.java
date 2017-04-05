package com.example.fang.eventbustest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

public class Main2Activity extends AppCompatActivity {
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
        initIntent();
    }

    private void initView() {
        btn2= (Button) findViewById(R.id.btn2);
    }

    private void initIntent() {
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EventBus.getDefault().post(new FirstEvent("点击我干嘛！！！"));
            }
        });

    }



}
