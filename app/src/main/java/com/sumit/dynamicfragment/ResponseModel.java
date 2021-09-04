package com.sumit.dynamicfragment;

import java.io.Serializable;


public class ResponseModel implements Serializable {

	private String image;

	private String subTitle;

	private String title;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setSubTitle(String subTitle){
		this.subTitle = subTitle;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDTO{" + 
			"image = '" + image + '\'' + 
			",subTitle = '" + subTitle + '\'' + 
			",title = '" + title + '\'' + 
			"}";
		}
}