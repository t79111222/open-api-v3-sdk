package com.okcoin.commons.okex.open.api.test.websocket;

import com.okcoin.commons.okex.open.api.client.WebSocketClient;
import org.apache.commons.compress.utils.Lists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class WebSocketUserTest extends WebSocketBaseConfig {
    private WebSocketClient webSocketClient;
    @Before
    public void connect() {
        config = setConfig();
        webSocketClient = new WebSocketClient(config);
        //与服务器建立连接
        webSocketClient.connection(config.getUrl());
        //登录账号,用户需提供apikey，passphrase,secretkey
        webSocketClient.login(config.getApiKey(),config.getPassphrase(),config.getSecretKey());
    }

    @After
    public void close() {
        webSocketClient.closeConnection();
    }
    //用户持仓频道
    @Test
    public void positionChannel(){
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/position:BTC-USD-SWAP");
        try{
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        //订阅
        webSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try{
            Thread.sleep(10000000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //用户账户频道
    @Test
    public void accountChannel(){
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/account:BTC-USD-SWAP");
        try{
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        //订阅
        webSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try{
            Thread.sleep(10000000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //用户交易频道
    @Test
    public void orderChannel(){
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/order:BTC-USD-SWAP");
        try{
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        //订阅
        webSocketClient.subscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try{
            Thread.sleep(10000000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //取消订阅
    @Test
    public void unsubscribeChannel(){
        ArrayList<String> channel = Lists.newArrayList();
        channel.add("swap/order:BTC-USD-SWAP");
        try{
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
        //取消订阅
        webSocketClient.unsubscribe(channel);
        //为保证测试方法不停，需要让线程延迟
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
