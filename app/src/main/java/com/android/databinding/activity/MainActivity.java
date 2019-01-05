package com.android.databinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.databinding.R;
import com.android.databinding.databinding.ActivityMainBinding;
import com.android.databinding.presenter.MainPresenter;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnButterKnife.setText(getString(R.string.butter_knife));
        binding.btnDataBinding.setText(getString(R.string.data_binding));
        binding.setPresenter(new MainPresenter());
    }
}
