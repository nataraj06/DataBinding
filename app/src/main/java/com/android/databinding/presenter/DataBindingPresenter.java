package com.android.databinding.presenter;

import android.content.Intent;
import android.view.View;

import com.android.databinding.activity.DataBindingActivity1;
import com.android.databinding.activity.DataBindingActivity2;
import com.android.databinding.activity.DataBindingActivity3;

public class DataBindingPresenter {

    public void onClickButton1(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity1.class));
    }

    public void onClickButton2(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity2.class));
    }

    public void onClickButton3(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity3.class));
    }

    public void onClickButton4(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), null));
    }
}
