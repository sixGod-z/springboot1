package com.zsy.springboot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname Controlelr
 * @Description TODO
 * @Date 2020/2/4 17:05
 * @Created by hero
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("show")
    @ResponseBody
    public String show(){
        return "Hello Sping boot";
    }
}
