# Comento_Spring_API Develope

1주차 

1. 개발환경 셋팅

  1-1. 스프링 4.3.9 RELEASE 버전
  
  1-2. log4j를 활용한 SQL log 사용
  
  1-3. mariaDB connection 사용 초기 데이터 삽입
  
  1-4. Tomcat 구동 확인
  
  1-5. MyBatis 연동 및 Bean 생성 테스트
  
  1-6. Dependency 체크

2. 개발환경 셋팅 도중 Dependency 문제로 예상되는 에러

  2-1.  에러내용 : org.springframework.beans.factory.BeanCreationException: Error creating bean with name
  
  'org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping': 
  
  Invocation of init method failed; nested exception is java.lang.IllegalStateException: Invalid mapping on handler class [controller.HomeController]:
  
  public java.lang.String controller.HomeController.home(org.springframework.ui.Model) throws java.lang.Exception
  
  2-2. 이전에 사용하던 버전이 아니라 버전업그레이드 과정에서 Dependency가 꼬인 것 같음 -> Dependency를 처음부터 설정 or gradle로 변경 작업 예정
