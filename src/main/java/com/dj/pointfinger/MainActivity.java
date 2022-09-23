package com.dj.pointfinger;

import android.os.Bundle;

import com.dj.pointfinger.service.WeChatService;

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
                WeChatService.GetInstance().openWeChatPay("wx5573711f9b6d2664","1582797471"
                ,"wx22180643079043ec54925f60dc15880000"
                ,"0jyeuo97rwbcionupq4z0olsglrq0af3"
                ,"1663841203"
                ,"g+scb6HFL9+Tl93544HLT+VJtVbSUBRUXWtNdcJEQ9Tg0C+MKITmw7WB+0Wf9ZO/DtJrJe2eRjeERFittImmdyp8ygE34TD6h1cFjy7TZ5mGuS0nlrRojK2kQtOVu/cOPzi3IJdX5tv185npxjmZebvPj9cPtqAt/m19MYMgcHc4fvZCWz40EzS3jmxb2vkv9PaRFJn5Bo/OUtlvO055rA2+/mhyXxi42qvVZl3jHuS/Tf7nfpd6AUH9DNJ0xBcxOWIUWe3U5Vq54NiJ8WAGBgGEWpxz5+AHPEO/D+E+2MmTRhFf22/r8umAplPFeDfXWLvz0P9a141/tIJsqAY+CQ==");
            }
        });
    }
}