package egovframework.course.com.service.impl;

import java.util.List;

import egovframework.course.com.service.MemberVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("memberMapper")
public interface MemberMapper {
	
	/**
	 * member에 관한 데이터처리 매퍼 클래스
	 *
	 * @author 
	 * @since 2023. 01. 29
	 * @version 1.0
	 * @see <pre>
	 *  == 개정이력(Modification Information) ==
	 *
	 *          수정일          수정자           수정내용
	 *  ----------------    ------------    ---------------------------
	 *   2023. 01. 29        	         최초 생성
	 *
	 * </pre>
	 */
	
	/**
	 * 글 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<MemberVO> selectMemberList() throws Exception;
	
}
