package egovframework.course.com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.course.com.service.MemberService;
import egovframework.course.com.service.MemberVO;
import egovframework.course.com.service.impl.MemberServiceImpl;
/*import egovframework.course.com.service.impl.MemberDAO;*/
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

/**@class Name :MemberSerivceImpl.java
 * @Description : Member Business Implement Class
 * @Modification Information
 * 
 * @author hyeju
 * @since 2023. 01. 29
 * @version 1.0
 *
 */

@Service("memberService")
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService  {

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	/** MemberDAO */
	// TODO ibatis 사용
	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;

/*	public String insertMember(MemberVO memberVO) throws Exception{
		
		return "0";
	};*/

	public List<MemberVO> selectMemberList() throws Exception{
		
		return memberDAO.selectMemberList();
	};
	
}
