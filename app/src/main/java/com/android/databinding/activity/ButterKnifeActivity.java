package com.android.databinding.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.databinding.R;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeActivity extends AppCompatActivity {
    @BindView(R.id.title)
    TextView textView;
    @BindView(R.id.btn)
    Button button;

    @BindString(R.string.butter_knife_sample_text)
    String titleText;
    @BindDrawable(R.drawable.button_background)
    Drawable background;
    @BindColor(R.color.colorAccent)
    int color;

    @OnClick(R.id.btn)
    void submit() {
        Toast.makeText(this, "action clicked", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);
        ButterKnife.bind(this);
        textView.setText(titleText);
        button.setTextColor(color);
        button.setBackground(background);
    }
}
