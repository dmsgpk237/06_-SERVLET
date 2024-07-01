<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%--
HTML (Hyper Text Markup Language)
- 웹 페이지와 웹 어플리케이션을 만들기 위한 표준 마크업 언어
- 웹 페이지의 구조를 정의한다.
- 텍스트, 이미지, 링크, 폼, 테이블 등 다양한 요소를 웹 페이지에 추가한다.
<Head> : 헤더 영역, 타이틀, 메타 데이터, 외부리소스 링크 등이 들어간다.
<body> : 바디영역(본문)
--%>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<%--h 태그들, 제목을 작성함 숫자에 따라 크키가 달라짐, 1부터 6까지 숫자 중 1이 제일 큼--%>
<h1> 라이프 사이클 테스트 </h1>
<%--br 태그 : 줄바꿈--%>
<br/>
<%--a 태그 : 다른 페이지로 이동할 수 있게 링크를 걸어주는 기능(href 속성을 이용해 링크 적용--%>
<a href="xml-lifecycle">라이프 사이클 테스트(xml)</a>

<a href="annotation-lifecycle">라이프 사이클 테스트(annotation)</a>
</body>
</html>