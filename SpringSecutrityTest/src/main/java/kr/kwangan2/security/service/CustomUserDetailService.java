package kr.kwangan2.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.kwangan2.security.domain.CustomUser;
import kr.kwangan2.security.domain.MemberVO;
import kr.kwangan2.security.mapper.MemberMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailService implements UserDetailsService {

	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		log.warn("사용자이름로드 : " + username);
		
		MemberVO memberVO = mapper.read(username);
		
		log.warn("queried by member mapper: " + memberVO);
		
		return memberVO == null ? null : new CustomUser(memberVO);
	}
	
	
}
