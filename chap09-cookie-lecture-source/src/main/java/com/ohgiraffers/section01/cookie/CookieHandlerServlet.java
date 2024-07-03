package com.ohgiraffers.section01.cookie;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
// 서비스명 : cookie
@WebServlet("/cookie")
// url : CookieHandlerServlet
public class CookieHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("(cookie) firstName : " + firstName);
        System.out.println("(cookie) lastName : " + lastName);

//        response.sendRedirect("redirect");

        /*
        * [쿠키를 사용하는 절차]
        *   1. 쿠키를 생성한다.
        *   2. 생성한 쿠키의 만료 시간을 설정한다.
        *   3. 응답 헤더에 쿠키를 담는다.
        *   4. 응답을 보낸다.
        *
        * [쿠키의 제약사항]
        *   - 쿠키의 이름은 ascii 문자만을 사용해야하며 한 번 설정한 쿠키의 이름은 변경할 수 없다.
        *   - 쿠키의 이름에는 공백문자와 일부 특수문자( [ ] ( ) = , " \ ? @ : ; )을 사용할 수 없다.
        * */

        // 우리는 쿠키를 생성자로 만드는건데, 쿠키는 기본생성자를 제공하지 않아서 괄호 안에 아무 것도 넣지 않으면 컴파일 에러발생.
        // 그래서 key, value를 맞춰서 넣어줘야함.
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        // 쿠키의 만료시간을 지정해줘야 한다. 초단위로 설정
        firstNameCookie.setMaxAge(60 * 60 * 24); // 1분 1시간 24시간
        lastNameCookie.setMaxAge(60 * 60 * 24);

        // response에 쿠키 담기
        response.addCookie(firstNameCookie);
        response.addCookie(lastNameCookie);
        // > 응답할 때 쿠키들을 가지고 가는 것.

        response.sendRedirect("redirect");
    }
}
