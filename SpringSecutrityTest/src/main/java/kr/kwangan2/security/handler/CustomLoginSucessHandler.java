package kr.kwangan2.security.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomLoginSucessHandler implements AuthenticationSuccessHandler{
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse resp,
			Authentication auth) throws IOException, ServletException {

		log.warn("Login Success");
		
		List<String> roleNames = new ArrayList<>();
		
		auth.getAuthorities().forEach(authority -> {
			roleNames.add(authority.getAuthority());
		});
		
		log.warn("ROLE NAMES: " + roleNames);
		
		if(roleNames.contains("ROLE_ADMIN")) {
			resp.sendRedirect("/sample/admin");
			return;
		}
		
		if(roleNames.contains("ROLE_MEMBER")) {
			resp.sendRedirect("/sample/member");
			return;
		}
		resp.sendRedirect("/");
		
	}//onAuthenticationSuccess

}//CustomLoginSucessHandler
