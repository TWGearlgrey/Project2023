<div align=center>
 
 ![HelloWorld](https://github.com/TWGearlgrey/Project2023/blob/main/HelloWorld/front/public/header_logo.png?raw=true)
 ---
</div>

### 👩‍💻 프로젝트 소개
 개발자를 위한 플랫폼 HelloWorld 프로젝트입니다. <br>
 REST API를 기반으로 제작했습니다.<br/>
 *비고: KDT 팀프로젝트 우수상<br/><br/>*


### ⏰ 개발 기간
 2023.10.31. ~ 2023.12.08.  <br/><br/>


### 👨‍👩‍👧‍👧 멤버구성
| pos | name | to do |
| :---: | :---: | :---: |
| 공통 | - | `Git 관리` `DB 설계` |
| 책임개발자 | **[김상엽](https://github.com/tkddu1591)** | `강의 CRUD` `리뷰 CRUD` `DM(메시지)` |
| 개발자 | **[한상민](https://github.com/TWGearlgrey)** | `로그인/로그아웃` `회원가입` `이용약관` `소셜로그인` `내정보수정` |
| 개발자 | **[강윤수](https://github.com/lomong7807)** | `커뮤니티` `글 CRUD` `댓글 CRUD` |


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
 - **Library** : ![Redux](https://img.shields.io/badge/redux-764ABC?style=flat&logo=redux&logoColor=white) `QueryDSL` `modelmapper-3.1.1.jar` `lombok` `react-router` `react-cookie` `quill` ...
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
　이번 프로젝트를 개발하면서 예외처리와 에러 발생을 예방하기 위해 노력했습니다. <br/>
이를 위해 노력한 부분들은 다음과 같습니다. <br/>

　1️⃣ 예외처리의 경우 CustomException Class를 생성 <br/>
해당 클래스를 통해 각 예외에 따라 처리하려던 작업을 어떻게 마무리할지, <br/> 
사용자에게 어떤 메시지를 전달할지 결정하여 예외를 처리했습니다. <br/>

　2️⃣ frontend와 backend 모두 validation 체크 <br/>
검증이 필요한 부분에서는 프론트에서 검증 처리 후 백엔드로 데이터를 전송하게 하였고 <br/>
백엔드로 전송한 데이터도 검증을 하여 에러를 예방하였습니다. <br/>

　3️⃣ null exception이 발생할 수 있는 경우 null check <br/>
 메서드를 실행할 때, null 예외가 발생 할 수 있는 경우 메서드 실행천 null check 수행 <br/>

　4️⃣ 들어갈 값들이 정형화 된 경우 enum class 사용. <br/>
ROLE이나 TYPE과 같이 들어갈 값이 정해져 있는 경우 enum class를 통해 에러를 예방하였습니다.<br/>

　5️⃣ ResponseEntity 활용 <br/>
data가 성공적으로 처리되지 않더라도 body에 결과를 전달 할 수 있도록 처리하였습니다.<br/>

　프로젝트를 통해 다양한 라이브러리를 사용하고 JSON Web Token, OAuth2 등의 기능을 사용하며 <br/>
예외처리에도 신경을 쓰며 개발을 하다보니 개발 후 배포 테스트 단계, 프로젝트 배포 단계까지 <br/>
맡은 부분에서 발생한 에러나 예외가 0건일 정도로 깔끔하게 마무리 할 수 있었습니다. <br/>

　또한 팀원분들과 꾸준한 소통으로 코드의 재활용을 높일 수 있었고 여러 노력들이 모여 <br/>
KDT 팀프로젝트에서 우수상을 받는 결과를 얻을 수 있었습니다.
