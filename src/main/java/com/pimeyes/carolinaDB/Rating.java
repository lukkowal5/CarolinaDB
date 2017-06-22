package com.pimeyes.carolinaDB;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_ratings")
public class Rating {
    @Id
    @GeneratedValue
    @Column(name="rating_id")
    private Long ratingId;
    private double rating;
    @Column(name="product_id")
    private String productId;
    @Column(name="user_id")
    private String userId;
    public Rating() {
    }
    public Rating(Long ratingId, double rating, String productId, String userId) {
        super();
        this.ratingId = ratingId;
        this.rating = rating;
        this.productId = productId;
        this.userId = userId;
    }
    //getters, setters, toString, hashCode, equals
	public Long getRatingId() {
		return ratingId;
	}
	public void setRatingId(Long ratingId) {
		this.ratingId = ratingId;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}