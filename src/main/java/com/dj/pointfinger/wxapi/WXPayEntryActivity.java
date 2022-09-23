package com.dj.pointfinger.wxapi;

import android.app.Activity;
import android.os.Bundle;

import com.dj.pointfinger.MainActivity;
import com.dj.pointfinger.service.WeChatService;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * 微信回调监听
 * @author liaozan8888@163.com
 */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {

    //实例化业务层
    private WeChatService wechatService = WeChatService.GetInstance();

    // IWXAPI 是第三方app和微信通信的openapi接口
    private IWXAPI iwxapi;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iwxapi = WXAPIFactory.createWXAPI(this, WeChatService.APP_ID);
        iwxapi.handleIntent(getIntent(), this);
    }

    @Override
    public void onReq(BaseReq baseReq) {
        switch (baseReq.getType()){

        }
    }
    //第三方应用发送到微信的请求处理后的响应结果，会回调到该方法
    @Override
    public void onResp(BaseResp baseResp) {
        switch (baseResp.getType()){
            case ConstantsAPI.COMMAND_PAY_BY_WX: //支付回调
                break;
        }
        finish();
    }
}
