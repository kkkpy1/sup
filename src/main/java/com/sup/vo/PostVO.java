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

public class PostVO {
	// Product Info
	private int productId;
	private String productName;
	private String productImg;
	private int productPrice;
	private String productBrand;
	private String productCategory;
	
	// Post Info
	private int postId;
	private String memberId;
	private String postContent;
	private String postSharedRange;
	private int postLikeCount;
	private String postDate;
}
