package com.springboot.nonspringclass;

import com.springboot.service.DBService;
import org.springframework.stereotype.Component;

@Component
public class NonSpringClassWrapper implements DBService {

    public final NonSpringClassImpl nonSpringClassImpl;

    public NonSpringClassWrapper(){
        nonSpringClassImpl = new NonSpringClassImpl();
    }


    @Override
    public void saveInDb() {
        nonSpringClassImpl.saveInDb();
    }

    @Override
    public boolean saveInRedis() {
        return nonSpringClassImpl.saveInRedis();
    }

    @Override
    public String saveInMongo() {
        return nonSpringClassImpl.saveInMongo();
    }
}
