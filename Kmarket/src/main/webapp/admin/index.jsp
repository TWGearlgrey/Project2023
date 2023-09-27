<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="./_header.jsp" %>
<main>
    <%@ include file="./_aside.jsp" %>
    <section id="admin-index">
        <nav>
            <h3>관리자 메인</h3>
            <p>HOME > <strong>메인</strong></p>
        </nav>

        <h4>쇼핑몰 운영현황</h4>
        <article>
            <table>
                <tr>
                    <td>
                        <strong>주문건수(건)</strong>
                        <span>131</span>
                    </td>
                    <td>
                        <strong>주문금액(원)</strong>
                        <span>1,130,000</span>
                    </td>
                    <td>
                        <strong>회원가입(명)</strong>
                        <span>1,014</span>
                    </td>
                    <td>
                        <strong>쇼핑몰 방문(명)</strong>
                        <span>1,014</span>
                    </td>
                    <td>
                        <strong>신규게시물(건)</strong>
                        <span>100</span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>
                            <span>PC</span>
                            <span>60</span>
                        </p>
                        <p>
                            <span>Mobile</span>
                            <span>71</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>PC</span>
                            <span>60</span>
                        </p>
                        <p>
                            <span>Mobile</span>
                            <span>71</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>PC</span>
                            <span>60</span>
                        </p>
                        <p>
                            <span>Mobile</span>
                            <span>71</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>PC</span>
                            <span>60</span>
                        </p>
                        <p>
                            <span>Mobile</span>
                            <span>71</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>PC</span>
                            <span>60</span>
                        </p>
                        <p>
                            <span>Mobile</span>
                            <span>71</span>
                        </p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>
                            <span>어제</span>
                            <span>4</span>
                        </p>
                        <p>
                            <span>주간</span>
                            <span>10</span>
                        </p>
                        <p>
                            <span>월간</span>
                            <span>30</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>어제</span>
                            <span>4</span>
                        </p>
                        <p>
                            <span>주간</span>
                            <span>10</span>
                        </p>
                        <p>
                            <span>월간</span>
                            <span>30</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>어제</span>
                            <span>4</span>
                        </p>
                        <p>
                            <span>주간</span>
                            <span>10</span>
                        </p>
                        <p>
                            <span>월간</span>
                            <span>30</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>어제</span>
                            <span>4</span>
                        </p>
                        <p>
                            <span>주간</span>
                            <span>10</span>
                        </p>
                        <p>
                            <span>월간</span>
                            <span>30</span>
                        </p>
                    </td>
                    <td>
                        <p>
                            <span>어제</span>
                            <span>4</span>
                        </p>
                        <p>
                            <span>주간</span>
                            <span>10</span>
                        </p>
                        <p>
                            <span>월간</span>
                            <span>30</span>
                        </p>
                    </td>
                </tr>
            </table>
        </article>

        <h4>주문 업무현황</h4>
        <article>
            <table>
                <tr>
                    <td>
                        <Strong>입금대기(건)</Strong>
                        <span>100</span>
                    </td>
                    <td>
                        <Strong>배송준비(건)</Strong>
                        <span>100</span>
                    </td>
                    <td>
                        <Strong>취소요청(건)</Strong>
                        <span>100</span>
                    </td>
                    <td>
                        <Strong>교환요청(건)</Strong>
                        <span>100</span>
                    </td>
                    <td>
                        <Strong>반품요청(건)</Strong>
                        <span>100</span>
                    </td>

                </tr>
            </table>
        </article>

        <div>
            <div>
                <h4>공지사항</h4>
                <article>
                <c:forEach var="latest" items="${latests1}">
                    <p>                 
                        <span>${latest.title}</span>
                        <span>${latest.rdate}</span>
                    </p> 
                </c:forEach>
                </article>
               
            </div>

            <div>
                <h4>고객문의</h4>
                <article>
                <c:forEach var="latest" items="${latests2}">
                    <p>
                        <span>${latest.title}</span>
                        <span>${latest.rdate}</span>
                    </p>
                </c:forEach>    
                </article>           
            </div>
        </div>

    </section>
</main>
<%@ include file="./_footer.jsp" %>