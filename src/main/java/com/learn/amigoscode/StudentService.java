package com.learn.amigoscode;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Cacheable("nisn")
    public String getStudentByNisn(String nisn) {
        return findNisnInSlowSource(nisn);
    }

    private String findNisnInSlowSource(String nisn) {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "sample Student wkwkwkwk";
    }
}
