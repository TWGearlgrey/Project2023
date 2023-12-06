<div align=center>
 
 ![HelloWorld](https://github.com/TWGearlgrey/Project2023/blob/main/HelloWorld/front/public/header_logo.png?raw=true)
 ---
</div>

### 👩‍💻 프로젝트 소개
 개발자를 위한 플랫폼 HelloWorld 프로젝트입니다. <br/><br/>


### ⏰ 개발 기간
 2023.10.31. ~ 2023.12.08.  <br/><br/>


### 👨‍👩‍👧‍👧 멤버구성
 - 공통 : `Git 관리` `DB 설계`
 - 책임개발자 **[김상엽](https://github.com/tkddu1591)** : `강의 CRUD` `리뷰 CRUD` `DM(메시지)`
 - 개발자 **[한상민](https://github.com/TWGearlgrey)** : `로그인/로그아웃` `회원가입` `이용약관` `소셜로그인` `내정보수정`
 - 개발자 **[강윤수](https://github.com/lomong7807)** : `커뮤니티` `글 CRUD` `댓글 CRUD`


### ⚙️ 개발환경
 - **OS** : `Window10`
 - **Browser** : `Chorme 117.0.5938`
 - **Language(Server)** :
   ![Java 17](https://img.shields.io/badge/Java_17-FF9A00?style=flat&logo=java&logoColor=white)
   ![SpringBoot](https://img.shields.io/badge/SpringBoot_3.1.4-6DB33F?style=flat&logo=springboot&logoColor=white)
   ![SpringSecurity](https://img.shields.io/badge/SpringSecurity-6DB33F?style=flat&logo=springsecurity&logoColor=white)
   ![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=flat&logoColor=white)
   ![MyBatis](https://img.shields.io/badge/MyBatis-000000?style=flat&logoColor=red)
 - **Language(Client)** :
   ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
   ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)
   ![JavaScript](https://img.shields.io/badge/JavaScript_Es6-F7DF1E?style=flat&logo=javascript&logoColor=white)
   ![JQuery](https://img.shields.io/badge/JQuery-0769AD?style=flat&logo=jquery&logoColor=white)
   ![react](https://img.shields.io/badge/React_18.2.0-263238?style=flat&logo=react)
 - **Library** : `modelmapper-3.1.1.jar` `lombok` `react-router` `react-cookie` `quill` ...
 - **DMBS** : ![MySQL](https://img.shields.io/badge/MySQL_8.0-4479A1?style=flat&logo=mysql&logoColor=white) 
 - **Tool** : `IntelliJ IDEA 2023-02-04` `Mysql Workbench 8.0.21` `HeidSQL 12.5` `Git 2.41.0` `Github` <br/><br/>


### 🛠 본인 주요 개발 기능
 #### 🔒 로그인/로그아웃
  - **일반 로그인** <br>
     : `Spring Security` `JSON Web Token`을 이용한 로그인 기능 구현, accessToken은 LocalStorage, refreshToken은 Cookie와 database에 저장  <br>
  - **소셜 로그인** <br>
     : ![Naver](https://img.shields.io/badge/naver-03C75A?style=flat&logo=naver&logoColor=white) ![Kakao](https://img.shields.io/badge/Kakao-FFCD00?style=flat&logo=kakaotalk&logoColor=black) 로그인 기능 구현. 정보만 받은 뒤, 일반 로그인과 같은 방법으로 token 발행  <br>
  - **로그아웃** <br>
     : accessToken, refreshToken이 저장된 LocalStorage와 Cookie를 모두 지움
 #### 📩 회원가입
  - **이용약관** <br>
     : 회원가입 시 이용약관 출력, 모달을 띄워 읽을 시에만 react useState 속성이 변경되어 회원가입 가능. <br>
  - **일반 회원가입** <br>
     : 이메일 인증 시에만 회원 가입 가능. 비밀번호 일치하는지 체크, 이메일 중복 체크 <br>
  - **소셜 회원가입** <br>
     : 소셜 로그인 시도시, 최초 로그인일 경우 정보 db 저장 후 회원가입 처리 <br>
 #### ⚙️ 내정보 수정
  - **이메일 찾기** <br>
     : 이름, 전화번호를 통해 이메일 찾기 <br>
  - **비밀번호 변경** <br>
     : 이메일 인증을 통해 비밀번호 변경, 비밀번호 일치하는지 체크 <br>
  - **마이 페이지** <br>
     : 닉네임, 이름, 전화번호 수정 기능 <br>

### 📑 프로젝트를 마치며…
text...
