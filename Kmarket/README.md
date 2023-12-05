## Kmarket 

### 👩‍💻 프로젝트 소개
 지마켓을 참고하여 만든 쇼핑 사이트입니다. <br/><br/>


### ⏰ 개발 기간
 2023.09.11. ~ 2023.09.27. <br/><br/>


### 👨‍👩‍👧‍👧 멤버구성
 - 프로젝트매니저 **[김철학](https://github.com/chhak0503)** : `프로젝트 기획 및 계획 수립` `프로젝트 일정 관리`
 - 책임 개발자 **[강윤수](https://github.com/lomong7807)** : `프로젝트 git 관리` `업무 분담` `계획 수립` `상품 목록` `상품 보기` `상품 구매` `장바구니`
 - 개발자 **[한상민](https://github.com/TWGearlgrey)** : `로그인/로그아웃` `회원가입` `자동로그인` `메인 페이지` `상품 리뷰 보기` `최근 본 상품`, `고객서비스(cs) 글 보기` `cs 글 작성` `cs 글 수정`
 - 개발자 **[강원빈](https://github.com/dkfkr)** : `관리자 상품 등록` `관리자 cs 관리`
 - 개발자 **[고성우](https://github.com/sungwoo0902)** : `고객서비스(cs) 글 목록` `보고서 작성` <br/><br/>


### ⚙️ 개발환경
 - **OS** : `Window10`
 - **Browser** : `Chorme 117.0.5938`
 - **Language(Server)** : `Java17` `Servlet4.0` `JSP2`
 - **Language(Client)** : `HTML5` `CSS3` `JavaScript(Es6)` `jQuery3.1`
 - **Library** : `activation-1.1.1.jar` `cos-05Nov2022.jar` `gson-2.10.1.jar`
   `javax.mail-1.6.2.jar` `jstl-1.2.jar` `logback-classic-1.4.11.jar` `logback-core-1.4.11.jar`
   `mysql-connector-java-8.0.32.jar` `slf4j-api-2.0.7.jar` ...
 - **DMBS** : `MySQL 8.0`
 - **Tool** : `Eclipse IDE 2023-06` `Mysql Workbench 8.0.21` `HeidSQL 12.5` `Git 2.41.0` `Github` <br/><br/>


### 🛠 본인 주요 개발 기능
 #### A. 메인 페이지
 1. **[메인](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/IndexController.java)** : DB를 통해서 베스트, 히트, 추천, 최근, 할인 상품 출력 및 카테고리 출력

 #### B. 멤버 페이지
 1. **[로그인](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/LoginController.java)** : 로그인시 세션 생성, 자동로그인시 쿠키 생성, 로그인 시 로그인 이전 페이지로 돌아가 작업 편의를 높임
 2. **[구매회원 가입](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/RegisterController.java)**/**[판매회원 가입](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/RegisterSellerController.java)** : 회원가입 정보 [중복체크](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/DuplicationController.java) 및 [유효성 검사](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/webapp/js/validation.js) 후 DB로 INSERT
 3. **[가입 유형 선택](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/JoinController.java)**/**[이용 약관 동의](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/SignupController.java)** : 구매/판매자 회원 선택 페이지에서 유형을 선택하면 유형에 맞게 약관 페이지에서 약관이 출력
 4. **[logout](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/member/LogoutController.java)** : 로그아웃 시 로그인할 때 생성된 회원 정보를 담은 세션을 제거

 #### C. 상품 페이지
 1. **[상품 목록](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/product/ListController.java)** : 기존 개발 돼 있던 소분류 상품목록 출력에서 전체출력, 대분류 출력, 소분류 출력, 타입별 정렬 기능 적용
 2. **[상품 보기](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/product/ViewController.java)** : 상품 보기 페이지를 열람하면 쿠키를 생성하여 최근 본 상품 구현
 3. **상품 보기**에서 언급된 최근 본 상품 기능은 **메인**, **상품 목록**, **상품 보기** 페이지에서 쿠키를 불러와 최근 본 상품을 출력

 #### D. 고객서비스 페이지
 1. **글 보기([공지](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/cs/notice/ViewController.java)/
    [FAQ](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/cs/faq/ViewController.java)/
    [QNA](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/cs/qna/ViewController.java))** : 게시글의 대분류, 소분류, 작성일, 제목, 내용, 작성자를 각 카테고리에 맞게 출력
 2. **글 쓰기([QNA](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/cs/qna/WriteController.java))** : 글 작성시 대분류 카테고리를 선택시 ajax를 이용해 동적처리하여 소분류 카테고리를 가져옵니다.
 3. **글 수정([QNA](https://github.com/TWGearlgrey/Project2023/blob/main/Kmarket/src/main/java/kr/co/kmarket/controller/cs/qna/ModifyController.java))** : 글 수정시 글 작성과 마찬가지로 대분류 카테고리를 선택시 ajax를 이용해 동적처리하여 소분류 카테고리를 가져옵니다.

### 📑 프로젝트를 마치며…
 프로젝트 초창기, 프로젝트 branch를 병합 할 때 충돌 문제를 겪는 경우가 생기는 경우가 있었습니다. 
 
팀원분들과 담당을 나눴기 때문에 겹치지 않을 것이라 생각한 부분에서 발생한 문제는 작업을 하는데에 불편함으로 다가왔습니다. 

상품, 사용자, 관리자, 고객센터 담당을 나누었어도 겹치는 부분들이 일부 존재하고 충돌은 불가피하다고 생각했습니다.

그래서 팀원분들과 상의하여 다음과 같은 규칙을 제시하였습니다.

 > 1. `db/SQL.java`와 같이 공통으로 작성하는 파일은 주석으로 구획을 나누고, 구획에 맞게 작성할 것.
 > 2. 다른 담당의 기능이 필요할 경우 담당 팀원에게 물어볼 것.
 > > 2-1. 존재하는 기능일 시, 존재하는 기능 사용하기. <br>
 > > 2-2. 존재하지 않을 시, 메서드 작성 요청하기.
 > 3. branch 병합 시각을 하루 2번으로 정해두기.
    
 팀원분들과 다음 규칙을 지키기로 얘기가 되고 난 뒤, 충돌을 방지하는데에 1, 3번 규칙이 가장 큰 효과를 냈습니다.

2번 규칙의 경우 충돌을 방지하는데에는 큰 효과를 내지 못했지만 팀간 소통을 높이고, 코드의 재활용을 높일 수 있었습니다.

그 결과 초창기 하루에 2~3번씩 발생하던 충돌이 일주일에 1번정도로 줄어들었으며,

코드 재활용이 높아져 프로젝트 마지막 즘엔 새로 코드를 짜지 않고, 기존 코드를 사용해 기능을 구현 할 수 있게 됐습니다.
