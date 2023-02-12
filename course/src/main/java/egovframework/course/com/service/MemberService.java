package egovframework.course.com.service;

import java.util.List;

public interface MemberService {
	
	/**
	 * 회원가입을 한다
	 * @param vo - 등록할 정보가 담긴 MemberVO
	 * @return 등록 결과
	 * @exception Exception
	 */
/*	String insertMember(MemberVO vo) throws Exception;
	*/
	
	/**
	 * 회원멤버 조회
	 * @param vo - 회원정보가 담긴 MemberVO
	 * @return 회원정보
	 * @exception Exception
	 */
	


	List<MemberVO> selectMemberList() throws Exception;
	
}
