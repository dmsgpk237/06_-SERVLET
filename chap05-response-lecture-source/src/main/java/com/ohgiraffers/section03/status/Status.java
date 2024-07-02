package com.ohgiraffers.section03.status;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/status")
public class Status extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.sendError(200, "요청이 성공적으로 진행되었습니다. (GET : 리소스를 불러와서 메시지 바디에 전송되었습니다.)");

//        response.sendError(400, "잘못된 문법으로 인해 서버가 요청을 이해할 수 없습니다.");

//        response.sendError(401, "인증되지 않았습니다. 요청한 응답을 받고싶다면 스스로를 인증하세요.");

//        response.sendError(404, "없는 페이지입니다. 경로를 확인해주세요.");

        response.sendError(500, "서버 내부 오류입니다. 서버 오류는 개발자의 잘못이고, 개발자는 여러분입니다!");
    }
}
