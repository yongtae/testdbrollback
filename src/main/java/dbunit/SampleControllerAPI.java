package dbunit;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.cmm.ResponseCode;
import egovframework.com.cmm.service.ResultVO;
import egovframework.let.cop.com.service.UserInfVO;
import egovframework.let.cop.com.service.impl.EgovUserInfManageDAO;

@Controller
@SessionAttributes(types = ComDefaultVO.class)
public class SampleControllerAPI {
	
	@Resource(name = "EgovUserInfManageDAO")
    private EgovUserInfManageDAO userInfDAO;
	
	/**
	 * 템플릿 메인 페이지 조회
	 * @return ... 
	 * 메인페이지 정보 Map [key : 항목명]
	 *
	 * @param request
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/sample/dbcnt.do")
	@ResponseBody
	public ResultVO sampleDbCntTest(UserInfVO userVO)
	  throws Exception{

		ResultVO resultVO = new ResultVO();
		HashedMap resultMap = new HashedMap();
		
		int cnt = 2;
		int cnt2 = userInfDAO.selectIdsCnt();
		resultMap.put("url", "/sample/dbcnt.do");
		resultMap.put("selectIdsCnt, IDS 개수", cnt2);

		resultVO.setResult(resultMap);
		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());

		return resultVO;
	}

	/**
	 * 템플릿 메인 페이지 조회
	 * @return ... 
	 * 메인페이지 정보 Map [key : 항목명]
	 *
	 * @param request
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/sample/dbunit.do")
	@ResponseBody
	public ResultVO getMgtMainPage()
	  throws Exception{

		ResultVO resultVO = new ResultVO();
		
		HashedMap resultMap = new HashedMap();
		resultMap.put("url", "/sample/dbunit.do");

		resultVO.setResult(resultMap);
		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());

		return resultVO;
	}

}