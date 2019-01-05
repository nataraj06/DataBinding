package com.android.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.databinding.R;
import com.android.databinding.databinding.ActivityDataBindingBinding;
import com.android.databinding.presenter.DataBindingPresenter;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Binding class will be generated based on same name of layout file
        //(e.g. activity_data_binding_1’s binding class will be generated ActivityDataBinding1Binding)
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        binding.button1.setText(R.string.button_1_txt);
        binding.button2.setText(R.string.button_2_txt);
        binding.button3.setText(R.string.button_3_txt);
        binding.button4.setText(R.string.button_4_txt);
        binding.setDataBindingPresenter(new DataBindingPresenter());
    }
}
