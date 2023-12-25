package dbRollBack;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.com.cmm.ResponseCode;
import egovframework.com.cmm.service.ResultVO;

@Controller
@SessionAttributes(types = ComDefaultVO.class)
public class SampleTestSrcControllerAPI {
	
	/**
	 * SampleService
	 */
	@Resource(name = "SampleService")
    private SampleService sampleService;
	
	
	
	/**
	 * 테스트소스 적용가능 확인
	 * @return ... 
	 * 메인페이지 정보 Map [key : 항목명]
	 *
	 * @param request
	 * @exception Exception Exception
	 */
	@RequestMapping(value = "/sample/testdata_dbunit.do")
	@ResponseBody
	public ResultVO getMgtMainPage() {
		
		int cnt2 = 0;
		
		// 테스트 실행
		try {
			sampleService.sampleLogic();
		} catch (Exception e) {
			// TODO: handle exception
			// 결과값 확인, 데이터는 롤백됨			
			cnt2 = SampleResultVO.getSampleResultVO().getResultcode();
		}
		
		
        
		ResultVO resultVO = new ResultVO();
		
		HashedMap resultMap = new HashedMap();
		resultMap.put("url", "/sample/testdata_dbunit.do");
		resultMap.put("selectIdsCnt, IDS 개수", cnt2);
		
		resultVO.setResult(resultMap);
		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());
		
		
		return resultVO;
	}

}