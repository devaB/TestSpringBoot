package com.springboot.nonspringclass;

import com.springboot.service.DBService;

public class NonSpringClassImpl implements DBService {

    @Override
    public void saveInDb(){
        System.out.println("saveInDb");
    }
    @Override
    public boolean saveInRedis(){
        System.out.println("saveInRedis");
        return true;
    }
    @Override
    public String saveInMongo(){
        System.out.println("saveInMongo");
        return "saveInMongo";
    }
}
