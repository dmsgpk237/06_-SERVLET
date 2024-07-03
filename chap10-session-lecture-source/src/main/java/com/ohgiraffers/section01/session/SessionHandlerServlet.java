package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(session) firstName : " + firstName);
        System.out.println("(session) lastName : " + lastName);

//        response.sendRedirect("redirect");

        // 세션 만들기
        HttpSession session = request.getSession();

        // HttpSession의 기본 유지 시간은 30분으로 지정되어 있다.
        // Session 유지시간 설정
        session.setMaxInactiveInterval(60*10); //10분
        System.out.println("변경 후 session 유지 시간 : " + session.getMaxInactiveInterval());

        System.out.println("session id : " + session.getId());
        // 브라우저당 1개의 고유한 id를 가지고 세션을 만든다.
        // 같은 브라우저는 같은 세션을 가지고, 다른 브라우저는 다른 세션을 만든다.

        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);

        response.sendRedirect("redirect");

    }
}