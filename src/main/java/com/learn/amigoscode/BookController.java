package com.learn.amigoscode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class BookController {

    @Autowired
    private StudentService studentService;


    // cara testnya -> curl localhost:8080/student/1234
    // untuk request selanjutnya akan lebih cepat karna cache

    @GetMapping("/{nisn}")
    public String getStudentByNisn(@PathVariable("nisn") String nisn) {
        return studentService.getStudentByNisn(nisn);
    }
}