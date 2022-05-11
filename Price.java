package one2many;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="price")
public class Price {

	@Id
	@ManyToOne
	@Column(name="PRODID")
	private ProductId productId;
	
	 @Column(name="STDPRICE")
	 private Double productStdPrice;

	 @Column(name="MINPRICE")
	 private Double productMinPrice;

	 @Column(name="STARTDATE")
	 private LocalDate productStartDate;
	 
	 @Column(name="ENDDATE")
	 private LocalDate productEndDate;
	 
	 public ProductId() {}
	 	
	 public Price(ProductId productId, Double productStdPrice, Double productMinPrice, LocalDate productStartDate,
			LocalDate productEndDate) {
		super();
		this.productId = productId;
		this.productStdPrice = productStdPrice;
		this.productMinPrice = productMinPrice;
		this.productStartDate = productStartDate;
		this.productEndDate = productEndDate;
	}


	public ProductId getProductId() {
		return productId;
	}


	public void setProductId(ProductId productId) {
		this.productId = productId;
	}


	public Double getProductStdPrice() {
		return productStdPrice;
	}


	public void setProductStdPrice(Double productStdPrice) {
		this.productStdPrice = productStdPrice;
	}


	public Double getProductMinPrice() {
		return productMinPrice;
	}


	public void setProductMinPrice(Double productMinPrice) {
		this.productMinPrice = productMinPrice;
	}


	public LocalDate getProductStartDate() {
		return productStartDate;
	}


	public void setProductStartDate(LocalDate productStartDate) {
		this.productStartDate = productStartDate;
	}


	public LocalDate getProductEndDate() {
		return productEndDate;
	}


	public void setProductEndDate(LocalDate productEndDate) {
		this.productEndDate = productEndDate;
	}


}