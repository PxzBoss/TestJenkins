package com.pxz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * @author PXZ
 * @Title: TestController
 * @ProjectName demo
 * @date 2020/9/27 9:17
 */
@Controller
public class TestController {

    @ResponseBody
    @PostMapping("/test")
    public String test(@RequestParam Map<String, Object> mpParam) {
        String sJon = (String) mpParam.get("json");
        System.out.println(sJon);
        return sJon;
    }
    @ResponseBody
    @PostMapping("/test1")
    public String test1(HttpServletRequest req) {
        String sJon = req.getParameter("json");

        System.out.println(sJon);
        return sJon;
    }

    public static void main(String[] args) throws ParseException {


    }
    public static String ms2HMS(int _ms){
        String HMStime;
        _ms/=1000;
        int hour=_ms/3600;
        int mint=(_ms%3600)/60;
        int sed=_ms%60;
        String hourStr=String.valueOf(hour);
        if(hour<10){
            hourStr="0"+hourStr;
        }
        String mintStr=String.valueOf(mint);
        if(mint<10){
            mintStr="0"+mintStr;
        }
        String sedStr=String.valueOf(sed);
        if(sed<10){
            sedStr="0"+sedStr;
        }
        HMStime=hourStr+":"+mintStr+":"+sedStr;
        // 或者使用以下格式化
        // String.format(Locale.CHINA,"%02d:%02d:%02d",hour,min,second);
        return HMStime;
    }
}
