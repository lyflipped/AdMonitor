package com.longyin.flipped.admonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.longyin.flipped.common.App.MyActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends MyActivity {
    @BindView(R.id.text1)
    TextView mTextView;

    @BindView(R.id.email)
    EditText mEmailView;

    @BindView(R.id.phone)
    EditText mPhoneView;

    @BindView(R.id.auth_code)
    EditText mCodeView;

    @BindView(R.id.username)
    EditText mUsernameView;

    @BindView(R.id.get_code)
    Button mGetCodeView;

    @BindView(R.id.login)
    Button mLoginView;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mTextView.setText("我是哈哈哈");
    }
    /**
     * 获取验证码点击事件
     * @author liyang
     * @time 2018/11/8 20:28
     */
    @OnClick(R.id.get_code)
    void onGetAuthCode(){
        
    }
    /**
     * 点击登录事件
     * @author liyang
     * @time 2018/11/8 20:28
     */
    @OnClick(R.id.login)
    void onLogin(){

    }
}
