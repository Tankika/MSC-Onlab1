package hu.bme.onlab.post.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import hu.bme.onlab.user.domain.User;

@Entity(name = "post")
@MaxGreaterThanMin
@SequenceGenerator(name="post_sequence", sequenceName="post_sequence")
public class Post {

	private Long id;
	private String title;
	private String description;
	private String zipCode;
	private Integer priceMin;
	private Integer priceMax;
	private String name;
	private String phone;
	private Calendar creationDateTime;
	
	private User advertiser;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="post_sequence")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotNull
	@Size(min=12, max=100)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@NotNull
	@Size(min=20, max=4000)
	@Column(length=4000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@NotNull
	@Pattern(regexp="\\d{4}")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Min(0)
	@Max(1000000000)
	public Integer getPriceMin() {
		return priceMin;
	}

	public void setPriceMin(Integer priceMin) {
		this.priceMin = priceMin;
	}

	@Min(0)
	@Max(1000000000)
	public Integer getPriceMax() {
		return priceMax;
	}

	public void setPriceMax(Integer priceMax) {
		this.priceMax = priceMax;
	}

	@NotNull
	@Pattern(regexp="[a-zA-Z]+( [a-zA-Z]+){1,}")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull
	@Pattern(regexp="\\+36 (1|\\d{2}) \\d{3} \\d{3,4}")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@NotNull
	public Calendar getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Calendar creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@ManyToOne
	@NotNull
	public User getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(User advertiser) {
		this.advertiser = advertiser;
		if(!advertiser.getPosts().contains(this)) {
			advertiser.getPosts().add(this);
		}
	}
}
