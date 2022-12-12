/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author meenalsarwaiya
 */

public class Article {
	String title;
	String desc;
	String url;
	String image;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Article(String title, String desc, String url, String image) {
		super();
		this.title = title;
		this.desc = desc;
		this.url = url;
		this.image = image;
	}
	@Override
	public String toString() {
		return "title=" + title + "\ndesc=" + desc + "\nurl=" + url + "\nimage=" + image ;
	}
	
}

