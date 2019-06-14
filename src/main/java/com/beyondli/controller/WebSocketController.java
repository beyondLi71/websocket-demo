package com.beyondli.controller;

/**
 * Created by beyondLi
 * Date 2019/6/13 15:35
 * Desc .
 */

import com.beyondli.common.config.WebSocketServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Created by beyondLi
 * Date 2019/6/13 15:35
 * Desc .
 */
@Controller
@RequestMapping("/checkcenter")
public class WebSocketController {
    //推送数据接口
    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public String pushToWeb(@PathVariable String cid,String message) {
        try {
            WebSocketServer.sendInfo(message,cid);
        } catch (IOException e) {
            e.printStackTrace();
            return "failure";
        }
        return "success";
    }
}

