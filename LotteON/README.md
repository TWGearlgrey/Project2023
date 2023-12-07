<div align=center>
 
 ![LotteON](https://github.com/TWGearlgrey/Project2023/blob/main/LotteON/src/main/resources/static/images/header_logo.png?raw=true)
 ---
</div>

### 👩‍💻 프로젝트 소개
 LotteON을 참고하여 만든 쇼핑 사이트입니다. <br/><br/>


### ⏰ 개발 기간
 2023.09.26. ~ 2023.10.30. <br/><br/>


### 👨‍👩‍👧‍👧 멤버구성
| pos | name | to do |
| :---: | :---: | :---: |
|  프로젝트매니저 | **[김철학](https://github.com/chhak0503)** | `프로젝트 기획 및 계획 수립` `프로젝트 및 일정 관리` |
|  책임 개발자 | **[강윤수](https://github.com/lomong7807)** | `프로젝트 git 관리` `업무 분담 계획 수립` <br> `상품 목록`, `상품 구매`, `장바구니` |
|  개발자 | **[한상민](https://github.com/TWGearlgrey)** | `고객서비스(cs) 글목록/수정/등록/보기/삭제` `관리자 상품 수정` <br> `고객센터 관리자 글목록/수정/삭제/답변` `메인 페이지` |
|  개발자 | **[이지민](https://github.com/lee28921)** | `로그인/로그아웃` `자동로그인` `이메일인증` `상품 등록` | 
|  개발자 | **[김수현](https://github.com/tngus78901)** | `상품 등록` `회사소개` `약관안내` | 

<br>

### ⚙️ 개발환경
 - **OS** : `Window10`
 - **Browser** : `Chorme 117.0.5938`
 - **Language(Server)** : `Java17` `Spring Boot` `Spring Security` `Spring Data JPA` `MyBatis`
 - **Language(Client)** : `HTML5` `CSS3` `JavaScript(Es6)` `jQuery3.1`
 - **Library** : `activation-1.1.1.jar` `cos-05Nov2022.jar` `gson-2.10.1.jar` `javax.mail-1.6.2.jar` `javax.mail-api-1.6.2.jar` `jstl-1.2.jar` `logback-classic-1.4.11.jar` `logback-core-1.4.11.jar` `mysql-connector-java-8.0.32.jar` `slf4j-api-2.0.7.jar` `jackson-core-2.15.3.jar` `modelmapper-3.1.1.jar` `lombok` ...
 - **DMBS** : `MySQL 8.0`
 - **Tool** : `IntelliJ IDEA 2023-02-04` `Mysql Workbench 8.0.21` `HeidSQL 12.5` `Git 2.41.0` `Github` <br/><br/>


### 🛠 본인 주요 개발 기능
[![yutube](https://img.shields.io/badge/YouTube-FF0000?style=flat&logo=youtube&logoColor=white)](https://www.youtube.com/watch?v=AIGd08zu5vw)


 #### A. 메인 페이지
 1. **[메인](https://github.com/TWGearlgrey/Project2023/blob/main/LotteON/src/main/java/co/kr/lotteon/controller/MainController.java)** : DB를 통해서 베스트, 히트, 추천, 최근, 할인 상품 출력 및 카테고리 출력

 #### B. 관리자 페이지
 1. **[상품 수정](https://github.com/TWGearlgrey/Project2023/blob/main/LotteON/src/main/java/co/kr/lotteon/controller/admin/AdminProductController.java)** : 상품 수정 기능 구현
 2. **[고객센터 관리](https://github.com/TWGearlgrey/Project2023/blob/main/LotteON/src/main/java/co/kr/lotteon/controller/admin/AdminCsController.java)** :
    - 고객서비스 게시판 공지 작성 및 FAQ 작성, QNA글에 대한 답변 작성 기능. 선택 삭제 기능, 수정 기능 구현
    - 글 목록에서 카테고리 선택시 ajax를 이용해 글 목록을 불러옴
    - 글 작성시에도 카테고리 목록을 ajax를 이용하여 불러옴

 #### C. 고객서비스 페이지
 1. **[고객서비스 페이지](https://github.com/TWGearlgrey/Project2023/blob/main/LotteON/src/main/java/co/kr/lotteon/controller/cs/CsController.java)** :
    - 글 목록 : 게시글의 대분류, 소분류, 작성일, 제목, 내용, 작성자를 각 카테고리에 맞게 출력,
    - 글 작성 : 글 작성시 대분류 카테고리를 선택시 ajax를 이용해 동적처리하여 소분류 카테고리를 가져옵니다.
    - 글 수정 : 글 수정시 글 작성과 마찬가지로 대분류 카테고리를 선택시 ajax를 이용해 동적처리하여 소분류 카테고리를 가져옵니다.

### 📑 프로젝트를 마치며…
　Servlet으로만 개발을 진행하다 새로운 환경에서 프로젝트를 진행하니 개발 속도가 더딜 것이라 생각했습니다. <br>
하지만 Spring 환경에서 JPA, MyBatis를 처음 배웠을 때엔 익숙치 않아 예제를 보며 반복 학습을 한 덕분에 <br>
금방 속도를 붙일 수 있었고 기능들을 다양하게 응용도 할 수 있게 되어 큰 배움이 되었습니다. <br>

**1️⃣ JPA Native query 사용**  <br>
　JPA의 장점은 간단한 구조로 쿼리메서드를 작성 할 수 있는 것이지만, 조건이 까다로워지면 구현이 어려워집니다. <br>
까다로운 조건의 경우 MyBatis를 사용해 간단히 해결 할 수 있지만, JPA에서 지원하는 Pageable 기능을 활용해보고 싶어 <br>
JPA Native query를 알아보게 되었습니다. <br>

　간단히 해결될 줄 알았지만, JPA 메서드가 동작하지 않았습니다. <br>
UnitTest를 진행하거나 디버깅을 돌려보았지만, 문법 오류때문인지 원인을 찾기 어려웠습니다. <br>
좀 더 연구를 해본 결과 단순히 select query만을 작성하는 것이 아니라, <br>
페이징 처리를 위해 사용할 count qeury도 작성해야 한다는 것을 알게되었습니다. <br>
native qeury를 활성화 해준 뒤 select, count query를 작성하여 문제를 해결 할 수 있었습니다. <br>

**2️⃣ MyBatis 동적쿼리 구현**  <br>
　카테고리별로 게시글을 보게 할 때, 대분류, 중분류, 소분류가 선택되고 안되고에 따라 경우의 수가 많이 나와 <br>
여러개의 JPA 쿼리메서드 하드코딩해야 할까 고민이 되었습니다. 당장 프로젝트 해결을 위해서는 할 수 있겠지만, <br>
개발자가 되어 개발을 하는 입장에서 생각하면 확장성을 생각해서 다른 방법을 찾아야 했습니다. <br>

　JPA의 jpql과 같은 방법도 있었지만, MyBatis의 동적쿼리 구현 방식이 더 사용하기 좋아보여 MyBatis 방식을 사용했습니다. <br>
이 방법을 쇼핑몰 메인 검색창에도 적용하여 검색 조건에 따라 메서드를 최소 수십개 작성해야 할 것을 <br>
단 하나의 메서드를 통해 해결 할 수 있었습니다. <br>
