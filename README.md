 ## 목차
 ### 1. [Kmarket](#Kmarket)
 #### 　1.1. [프로젝트 소개](#-프로젝트-소개)
 #### 　1.2. [개발기간](https://github.com/TWGearlgrey/Project2023#-%EA%B0%9C%EB%B0%9C-%EA%B8%B0%EA%B0%84)
 #### 　1.3. [멤버구성](https://github.com/TWGearlgrey/Project2023#-%EB%A9%A4%EB%B2%84%EA%B5%AC%EC%84%B1)
 #### 　1.4. [개발환경](https://github.com/TWGearlgrey/Project2023#%EF%B8%8F-%EA%B0%9C%EB%B0%9C%ED%99%98%EA%B2%BD)
 #### 　1.5. [본인 주요 개발 기능](https://github.com/TWGearlgrey/Project2023#-%EB%B3%B8%EC%9D%B8-%EC%A3%BC%EC%9A%94-%EA%B0%9C%EB%B0%9C-%EA%B8%B0%EB%8A%A5)
 ##### 　　1.5.A. [메인 페이지](https://github.com/TWGearlgrey/Project2023#a-%EB%A9%94%EC%9D%B8-%ED%8E%98%EC%9D%B4%EC%A7%80)
 ##### 　　1.5.B. [멤버 페이지](https://github.com/TWGearlgrey/Project2023#b-%EB%A9%A4%EB%B2%84-%ED%8E%98%EC%9D%B4%EC%A7%80)
 ##### 　　1.5.C. [상품 페이지](https://github.com/TWGearlgrey/Project2023#c-%EC%83%81%ED%92%88-%ED%8E%98%EC%9D%B4%EC%A7%80)
 ##### 　　1.5.D. [고객서비스 페이지](https://github.com/TWGearlgrey/Project2023#d-%EA%B3%A0%EA%B0%9D%EC%84%9C%EB%B9%84%EC%8A%A4-%ED%8E%98%EC%9D%B4%EC%A7%80)
<br>
<br>

# Project2023
 2023년도 진행한 프로젝트입니다. 

## Kmarket 

### 👩‍💻 프로젝트 소개
 지마켓을 참고하여 만든 쇼핑 사이트입니다.


### ⏰ 개발 기간
 2023.09.11. ~ 2023.09.27.


### 👨‍👩‍👧‍👧 멤버구성
 - 프로젝트매니저 **[김철학](https://github.com/chhak0503)** : 프로젝트 기획 및 계획 수립, 프로젝트 및 일정 관리
 - 책임 개발자 **[강윤수](https://github.com/lomong7807)** : 프로젝트 git 관리, 업무 분담 계획 수립, 상품 페이지, 상품 구매, 장바구니 기능 구현
 - 개발자 **[한상민](https://github.com/TWGearlgrey)** : 멤버 페이지, 메인 페이지, 상품 리뷰 페이지, 최근 본 상품 기능 구현, 고객서비스(cs) 페이지, 글 보기, 글 작성, 글 수정 구현
 - 개발자 **[강원빈](https://github.com/dkfkr)** : 관리자 페이지 구현
 - 개발자 **[고성우](https://github.com/sungwoo0902)** : 고객서비스(cs) 페이지, 글 목록 구현, 보고서 작성


### ⚙️ 개발환경
 - **OS** : Window10
 - **Browser** : Chorme 117.0.5938
 - **Language(Server)** : Java17 / Servlet4.0 / JSP2
 - **Language(Client)** : HTML5 / CSS3 / JavaScript(Es6) / jQuery3.1
 - **Library** : activation-1.1.1.jar / cos-05Nov2022.jar / gson-2.10.1.jar /
   javax.mail-1.6.2.jar / jstl-1.2.jar / logback-classic-1.4.11.jar / logback-core-1.4.11.jar /
   mysql-connector-java-8.0.32.jar / slf4j-api-2.0.7.jar
 - **DMBS** : MySQL 8.0
 - **Tool** : Eclipse IDE 2023-06 / Mysql Workbench 8.0.21 / HeidSQL 12.5 / Git 2.41.0 / Github


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
