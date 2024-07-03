package com.ohgiraffers.section02.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class RequestWrapper extends HttpServletRequestWrapper {
    // 부모(HttpServletRequestWrapper)한테 기본 생성자가 없어서 request를 전달해주는 기본 생성자를 만들어줘야 함.
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String key) {

        String value = "";
        //password와 key가 같으면
        if ("password".equals(key)) {

            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            //암호화를 해줘
            value = passwordEncoder.encode(super.getParameter(key));

            System.out.println("value ====================>" + value);

        } else {
            value = super.getParameter(key);
        }

        return value;
    }
}
