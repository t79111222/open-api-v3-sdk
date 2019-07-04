package com.okcoin.commons.okex.open.api.test.ws.futures.config;


/**
 * webSocket config
 *
 * @author oker
 * @date 2019/7/5 1:57 AM
 */
public class WebSocketConfig {
    // okex webSocket url
    private static final String SERVICE_URL = "wss://okexcomreal.bafang.com:10442/ws/v3?_compress=false";
    // api key
    private static final String API_KEY = "a4a7993e-2a96-4fce-97ad-5e51d56f8f0b";
    // secret key
    private static final String SECRET_KEY = "980B7367F164E3DAC4256FA6530C97A6";
    // passphrase
    private static final String PASSPHRASE = "123456";

    public static void publicConnect(WebSocketClient webSocketClient) {
        webSocketClient.connection(SERVICE_URL);
    }

    public static void loginConnect(WebSocketClient webSocketClient) {
        //与服务器建立连接
        webSocketClient.connection(SERVICE_URL);
        //登录账号,用户需提供 api-key，passphrase,secret—key 不要随意透漏 ^_^
        webSocketClient.login(API_KEY , PASSPHRASE , SECRET_KEY);
    }
}
