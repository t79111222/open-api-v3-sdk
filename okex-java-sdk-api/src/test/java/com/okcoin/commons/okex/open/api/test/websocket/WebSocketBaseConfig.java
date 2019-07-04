package com.okcoin.commons.okex.open.api.test.websocket;

import com.okcoin.commons.okex.open.api.config.WebSocketConfig;

public class WebSocketBaseConfig {
     public WebSocketConfig config;
    // okex webSocket url
    private static final String SERVICE_URL = "ws://192.168.80.113:10442/ws/v3?_compress=true";
    // api key
    private static final String API_KEY = "bb57a1b3-6257-47ff-b06c-faafc4d28fad";
    // secret key
    private static final String SECRET_KEY = "5CE31E70CD129F34B9E17C38534DDF90";
    // passphrase
    private static final String PASSPHRASE = "123456";

     public WebSocketConfig setConfig(){
         WebSocketConfig config = new WebSocketConfig(SERVICE_URL);
         config.setApiKey(API_KEY);
         config.setSecretKey(SECRET_KEY);
         config.setPassphrase(PASSPHRASE);
         return config;
     }
}
