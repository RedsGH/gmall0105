package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getRecieveAdressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getRecieveAdressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> UmsMemberReceiveAddresses = userService.getRecieveAdressByMemberId(memberId);

        return UmsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
