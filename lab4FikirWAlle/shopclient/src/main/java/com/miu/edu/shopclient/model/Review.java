package com.miu.edu.shopclient.model;




public class Review {
    private String title;
    private String comment;
    private int rating;
	public Review(String title, String comment, int rating) {
		super();
		this.title = title;
		this.comment = comment;
		this.rating = rating;
	}
	public Review() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Review [title=" + title + ", comment=" + comment + ", rating=" + rating + "]";
	}
    
    
    

}
