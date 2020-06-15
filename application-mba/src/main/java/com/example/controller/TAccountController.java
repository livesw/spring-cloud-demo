package com.example.controller;

import com.example.application.TAccount;
import com.example.common.RequestData;
import com.example.common.Result;
import com.example.service.TAccountService;
import com.example.util.BaseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/account")
public class TAccountController {


    @Autowired
    private TAccountService TAccountService;





    @RequestMapping(value = "decrease", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Result decrease(@RequestBody RequestData requestData){
        try{
            Map<String,Object> requestBody = requestData.getRequestBody();
            this.TAccountService.decrease(requestBody);
            return Result.getSuccessResp();
        }catch (Exception e){
            e.printStackTrace();
            return Result.getFailResp("save fail");
        }
    }


}
