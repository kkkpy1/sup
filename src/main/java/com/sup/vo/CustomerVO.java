package com.sup.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerVO {
	private String memberId;
	private String memberPassword;
	private String memberName;
	private String memberGender;
	private String memberBirthday;
	private String memberEmail;
	private String memberPhone;
	private String memberActivated;
	private String memberTerms;
	private String memberDate;
}