package com.longyin.flipped.admonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.longyin.flipped.common.App.MyActivity;

import butterknife.BindView;

public class MainActivity extends MyActivity {
    @BindView(R.id.text1)
    TextView mTextView;
    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mTextView.setText("我是哈哈哈");
    }
}
