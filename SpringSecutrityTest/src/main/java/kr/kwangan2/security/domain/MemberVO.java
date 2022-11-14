package kr.kwangan2.security.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO {

	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String userpw;
	private String username;
	private boolean enbled;
	
	private Date regdate;
	private Date updatedate;
	private List<AuthVO> authList;

}
