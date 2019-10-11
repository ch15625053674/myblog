package com.example.myblog;


import com.mysql.cj.protocol.a.authentication.Sha256PasswordPlugin;
import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureDSA;
import org.apache.tomcat.util.security.MD5Encoder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MyblogApplicationTests {

    @Test
    public void contextLoads() {
//        final String password = "ch";
//        final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        final String hashedPassword = passwordEncoder.encode(password);
//        System.out.println("********* bCryptPasswordEncoder hashedPassword:" +
//                hashedPassword);
//        System.out.println("======================================================================================"+BCrypt.checkpw("ch",hashedPassword));
    }


}
