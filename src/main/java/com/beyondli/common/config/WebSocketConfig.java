package com.beyondli.common.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by beyondLi
 * Date 2019/6/13 15:33
 * Desc .
 */


//websocket配置类注册
@Configuration
public class WebSocketConfig {

    //注册serverendpointer
    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return  new ServerEndpointExporter();
    }

}
