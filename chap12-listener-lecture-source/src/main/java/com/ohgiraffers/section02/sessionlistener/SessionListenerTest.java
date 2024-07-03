package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {

    /*
    * [Session]
    *   2-1. HttpSessionListener
    *  - Http 세션의 시작, 종료에 대한 리스너
    *   2-2. HttpSessionAttributeListener
    *  - HttpSession에 attribute가 추가, 제거, 수정되는 것에 대한 리스너
    * */

    public SessionListenerTest() {
        // context가 로드될 때 인스턴스가 생성된다.
        System.out.println("session listener constructor");
    }

    @Override
    // HttpSessionEvent se 에는 다양한 세션에 대한 기능이 담겨있음. 그래서 id를 꺼내서 확인해줄 것임
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("============== new session created! ==============");
        // 세션이 생성되면 created를 출력하고 만들어진 세션에 대한 id 값을 출력해줌.
        System.out.println("session created!");
        System.out.println("created session : " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session destroyed!");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        // session에 attribute가 추가될 때 동작한다.
        System.out.println("session attribute added!");

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        // session에 attribute가 삭제될 때 동작한다.
        System.out.println("session attribute removed!");

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        // session에 attribute가 변경될 때 동작한다.
        System.out.println("session attribute replaced!");

    }

}
