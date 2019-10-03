package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {


    int delUserById(String id);

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getRecieveAdressByMemberId(String memberId);
}
