package com.gemini.service;

import com.gemini.dao.insert;
import com.gemini.entity.User;

public class LoService {
    public boolean loginService(User user){
        Boolean flag = false;
        insert selectDao = new insert();
        User ifSucceed = selectDao.selectUser(user);
        if(ifSucceed!=null){
            flag = true;
        }
        return flag;
    }
}
