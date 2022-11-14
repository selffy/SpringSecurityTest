package kr.kwangan2.security.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.security.domain.MemberVO;
import kr.kwangan2.security.mapper.MemberMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class MemberMapperTests {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	@Test
	public void testInsertAuth() {
		
		MemberVO memberVO = mapper.read("admin90");
		log.info(memberVO);
		memberVO.getAuthList().forEach(authVO -> log.info(authVO));
		
		}

	private MemberVO MemberVO() {
		// TODO Auto-generated method stub
		return null;
	}
	}//MemberMapperTests