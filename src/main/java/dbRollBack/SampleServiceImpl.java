package dbRollBack;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import egovframework.let.cop.com.service.impl.EgovUserInfManageDAO;


@Service("SampleService")
public class SampleServiceImpl implements SampleService {

	@Autowired
    private SqlSessionFactory sqlSessionFactory;
	
	@Resource(name = "EgovUserInfManageDAO")
    private EgovUserInfManageDAO userInfDAO;

	@Transactional
	public void sampleRollbackLogic() throws Exception {
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		// 테스트 데이터 셋팅
		//	 쿼리조작 요소
		PreparedStatement pstmt = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Connection conn = sqlSession.getConnection();
		
		pstmt = conn.prepareStatement("delete from IDS");
		pstmt.executeUpdate();
		
		pstmt = conn.prepareStatement("INSERT INTO IDS VALUES('prepareStatement',1)");
		pstmt.executeUpdate();
		
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		// 테스트 작업내용
		int cnt2 = userInfDAO.selectIdsCnt();
		System.out.println("userInfDAO.selectIdsCnt()---"+ cnt2);
		
		
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		// 롤백 처리(확인중)	
		//try {
		//throw new RuntimeException("RuntimeException for rollback");
		//} catch (Exception e) {
		//// TODO: handle exception
		//System.out.println("에러 메시지 : " + e.getMessage());
		//
		//return cnt2;
		//}
		
		throw new RuntimeException("RuntimeException for rollback");
	}
	
	
	@Transactional
	@Override
	public void sampleLogic() throws Exception {
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		// 테스트 데이터 셋팅
		//	 쿼리조작 요소
		PreparedStatement pstmt = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		Connection conn = sqlSession.getConnection();
		
		pstmt = conn.prepareStatement("delete from IDS");
		pstmt.executeUpdate();
		
		pstmt = conn.prepareStatement("INSERT INTO IDS VALUES('prepareStatement',1)");
		pstmt.executeUpdate();
		
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		// 테스트 작업내용
		int cnt2 = userInfDAO.selectIdsCnt();
		System.out.println("userInfDAO.selectIdsCnt()---"+ cnt2);
		
		//	값 저장
		SampleResultVO.getSampleResultVO().setResultcode(cnt2);
//		int dd = SampleResultVO.getSampleResultVO().getResultcode();
		
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		// 롤백 처리
		throw new RuntimeException("RuntimeException for rollback");
	}


}
