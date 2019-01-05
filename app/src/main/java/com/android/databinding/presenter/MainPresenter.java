package com.android.databinding.presenter;

import android.content.Intent;
import android.view.View;

import com.android.databinding.activity.ButterKnifeActivity;
import com.android.databinding.activity.DataBindingActivity;

public class MainPresenter {

    public void onClickButterKnife(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), ButterKnifeActivity.class));
    }

    public void onClickDataBinding(View view) {
        view.getContext().startActivity(new Intent(view.getContext(), DataBindingActivity.class));
    }
}
