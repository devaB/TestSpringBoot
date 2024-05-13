package com.springboot.service;

public interface DBService {
    public void saveInDb();
    public boolean saveInRedis();
    public String saveInMongo();
}
