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
public class ProductVO {
	private int productId;
	private String memberId;
	private String productName;
	private String productImg;
	private int productPrice;
	private String productBrand;
	private String productDetail;
	private String productCategory;
	private int productQuantity;
	private String productActivated;
	private String productDate;

}
