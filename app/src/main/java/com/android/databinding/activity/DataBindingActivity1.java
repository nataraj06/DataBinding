package com.android.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.databinding.R;
import com.android.databinding.databinding.ActivityDataBinding1Binding;


public class DataBindingActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Normal android implementation
        //setContentView(R.layout.activity_main);

        //TextView textTitle = (TextView) findViewById(R.id.txt_title);
        //TextView textDesc = (TextView) findViewById(R.id.txt_desc);
    
        //txtTitle.setText("Data binding");
        //txtDesc.setText("If you realized the advantage of Data Binding already — it’s you have 2 lines of code max.You just save that binding variable as field if you need and can assess any of you fields anywhere within this class");

        //Done using Data Binding
        //Binding class will be generated based on same name of layout file
        //(e.g. activity_data_binding_1’s binding class will be generated ActivityDataBinding1Binding)
        ActivityDataBinding1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_1);
        binding.txtTitle.setText("Data binding");
        binding.txtDesc.setText("If you realized the advantage of Data Binding already — it’s you have 2 lines of code max.You just save that binding variable as field if you need and can assess any of you fields anywhere within this class");
    }
}
