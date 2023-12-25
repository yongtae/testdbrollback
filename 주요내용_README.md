# 테스트데이터 롤백적용 개발환경 샘플
### 참고파일
	/src/main/java/egovframework/**/EgovConfigAppCommon.java,EgovConfigWebDispatcherServlet.java
	/src/main/java/**/EgovUserInfManageDAO.java
	/src/main/resources/**/EgovUserInf_SQL_hsql.xml
	/src/test/java/DataInsertSucTest.java, DataRollBackSucTest.java
	/src/main/java/dbRollBack/* 모든파일 확인
	pom.xml
	테스트데이터 롤백적용 개발.postman_collection.json

### 개발내용
	[완] api호출로 데이터 적용(테스트소스를 api에 적용) 가능한지 확인
		참고파일
	/src/main/javar/dbRollBack/* 모든파일 확인
		참고자료
			https://programmer93.tistory.com/75
			https://dimdim.tistory.com/entry/Spring-MVC-Controller-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%97%90-Transactional-%EC%82%AC%EC%9A%A9%EC%97%90-%EB%8C%80%ED%95%9C-%EC%82%BD%EC%A7%88
	
	[완] 사용db에서 테스트데이터로 개발후 데이터 원복가능한방법
		사용중인 db데이터만 조작가능한지 확인
		ex) 공지사항조회 개발중, 조회용 데이터 입력 및 테스트후, 원복
	
		완료파일(결과내용 확인)
			DataInsertSucTest,DataRollBackSucTest 파일 확인
	
		참고자료
			https://sourceforge.net/p/dbunit/mailman/message/6654177/
			https://hongs-coding.tistory.com/120
	[...?] db연결 분리, 2개 디비연결 생성
		hsqldb 서버로 연결방법 확인
	
	[완료] hsqldb 서버 설치 및 연결
	
			참고명령어
				hsqldb-2.2.5\hsqldb>java -classpath lib/hsqldb.jar org.hsqldb.server.Server
	
			참고자료
			https://gujjy.wordpress.com/2011/09/18/hsqldb-hsqldb-%EC%84%A4%EC%B9%98-%EB%B0%8F-%EC%8B%A4%ED%96%89%ED%95%98%EA%B8%B0/
	[완료] hsqldb  file 전자정부 프로젝트로 연동
	[완] xml형식의 dataset db등록
		정상처리 검증
	
	
	- 테스트영역에는 db연결,테스트데이터 등록,조회,수정만 적용
	- 개발영역에는 2개db연결해 테스트데이터 사용해서 테스트
		...
	- 기타
		dbunit+springboot 기반으로, test영역에 db설정등을 적용해놓고
		개발중에 테스트 db접속+샘플데이터입력 및 조회(등록,조회,삭제)가 가능해야됨
	
	
	참고자료
		https://github.com/woowa-kwon/dbunit/tree/master
		https://techblog.woowahan.com/2650/
		https://datajoy.tistory.com/185, java 파일경로(getResource("text.txt") 등등) 읽기


