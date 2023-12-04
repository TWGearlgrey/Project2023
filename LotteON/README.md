 ## 목차
 ### 1. [Kmarket](#Kmarket)
  　1-1. **[프로젝트 소개](#-프로젝트-소개)** <br/>
  　1-2. **[개발기간](#-개발-기간)** <br/>
  　1-3. **[멤버구성](#-멤버구성)** <br/>
  　1-4. **[개발환경](#%EF%B8%8F-개발환경)** <br/>
  　1-5. **[본인 주요 개발 기능](#-본인-주요-개발-기능)** <br/>
  　　1-5.A. [메인 페이지](#a-메인-페이지) <br/>
  　　1-5.B. [멤버 페이지](#b-멤버-페이지) <br/>
  　　1-5.C. [상품 페이지](#c-상품-페이지) <br/> 
  　　1-5.D. [고객서비스 페이지](#d-고객서비스-페이지)  <br/>
  　1-6. **[프로젝트를 마치며…](#-프로젝트를-마치며)** <br/><br/>

## LotteON 

### 👩‍💻 프로젝트 소개
 LotteON을 참고하여 만든 쇼핑 사이트입니다. <br/><br/>


### ⏰ 개발 기간
 2023.09.26. ~ 2023.10.30. <br/><br/>


### 👨‍👩‍👧‍👧 멤버구성
 - 프로젝트매니저 **[김철학](https://github.com/chhak0503)** : 프로젝트 기획 및 계획 수립, 프로젝트 및 일정 관리
 - 책임 개발자 **[강윤수](https://github.com/lomong7807)** : 프로젝트 git 관리, 업무 분담 계획 수립, 상품 페이지, 상품 구매, 장바구니 기능 구현
 - 개발자 **[한상민](https://github.com/TWGearlgrey)** : 고객서비스(cs) 페이지, 상품 수정 페이지, 고객센터 관리자 페이지, 메인 페이지
 - 개발자 **[이지민](https://github.com/lee28921)** : 멤버 페이지 구현, 상품 등록 페이지
 - 개발자 **[김수현](https://github.com/tngus78901)** : 상품 등록 페이지, 회사 정보 페이지 구현<br/><br/>


### ⚙️ 개발환경
 - **OS** : Window10
 - **Browser** : Chorme 117.0.5938
 - **Language(Server)** : Java17 / Servlet4.0 / JSP2
 - **Language(Client)** : HTML5 / CSS3 / JavaScript(Es6) / jQuery3.1
 - **Library** : activation-1.1.1.jar / cos-05Nov2022.jar / gson-2.10.1.jar / javax.mail-1.6.2.jar / javax.mail-api-1.6.2.jar / jstl-1.2.jar / logback-classic-1.4.11.jar / logback-core-1.4.11.jar / mysql-connector-java-8.0.32.jar / slf4j-api-2.0.7.jar / jackson-core-2.15.3.jar / modelmapper-3.1.1.jar
 - **DMBS** : MySQL 8.0
 - **Tool** : Eclipse IDE 2023-06 / Mysql Workbench 8.0.21 / HeidSQL 12.5 / Git 2.41.0 / Github <br/><br/>


### 🛠 본인 주요 개발 기능
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
```
프로젝트를 마치며 느낀 점
혹은 개발 시 어려웠던 점... 그리고 그것을 어떻게 해결해 나갔는지
```
