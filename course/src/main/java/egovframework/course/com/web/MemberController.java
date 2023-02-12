package egovframework.course.com.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.course.com.service.MemberService;
import egovframework.course.com.service.MemberVO;

/**
 * @Class Name : MemberController.java
 * @Description : MemberController Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2023. 01. 30          최초생성
 *
 * @author simhyeju
 * @since 2023. 01. 30
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */

@Controller
public class MemberController {
	
	/** MemberService */
	@Resource(name = "memberService")
	private MemberService memberService;
	
	private MemberVO memberVO;
	/**
	 * 멤버목록을 조회한다. 
	 * @param MemberVO - 조회할 정보가 담긴 MemberVO
	 * @param model
	 * @return "MemberList"
	 * @exception Exception
	 */
	@RequestMapping(value = "/egovSampleList.do")
	public String selectMemberList(@ModelAttribute("memberVO") MemberVO VO) throws Exception{
		List<MemberVO> memberList = memberService.selectMemberList();
		System.out.println("dddd");
		System.out.println("memberList "+memberList.size());
		return "0";
	}
	
}
