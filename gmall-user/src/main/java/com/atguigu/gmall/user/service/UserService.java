package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {


    int delUserById(String id);

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getRecieveAdressByMemberId(String memberId);
}
