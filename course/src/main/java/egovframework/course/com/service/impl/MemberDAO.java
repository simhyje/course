package egovframework.course.com.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.course.com.service.MemberVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

/**
 * @Class Name : MemberDAO.java
 * @Description : Member DAO Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023. 01. 29         최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2023. 01. 29
 * @version 1.0
 * @see
 *
 */

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO{
	
	/**
	 * 회원멤버를 조회한다.
	 * @param searchMap - 조회할 정보가 담긴 Map
	 * @return 글 목록
	 * @exception Exception
	 */
	public List<MemberVO> selectMemberList() throws Exception {
		return (List<MemberVO>) list("memberDAO.selectMemberList");
	};

}
