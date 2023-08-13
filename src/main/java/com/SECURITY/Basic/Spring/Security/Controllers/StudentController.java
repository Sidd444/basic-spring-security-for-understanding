package com.SECURITY.Basic.Spring.Security.Controllers;


import com.SECURITY.Basic.Spring.Security.Person;
import com.SECURITY.Basic.Spring.Security.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {



    PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to STUDENT area";
    }


}
