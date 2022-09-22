package com.dj.pointfinger;

import android.os.Bundle;

import com.dj.pointfinger.service.WeChatService;
import com.dj.pointfinger.R;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static MainActivity Instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Instance = this;
        //微信授权事件
        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WeChatService.GetInstance().openWeChatLogin();
            }
        });
        //微信分享事件
        findViewById(R.id.btnShare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WeChatService.GetInstance().openWeChatShare("测试","测试","Session");
            }
        });
        //微信支付事件
        findViewById(R.id.btnPay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}