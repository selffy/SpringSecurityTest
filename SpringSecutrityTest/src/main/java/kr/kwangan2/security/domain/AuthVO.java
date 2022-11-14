package kr.kwangan2.security.domain;

import lombok.Data;

@Data
public class AuthVO {

	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String auth;

}
