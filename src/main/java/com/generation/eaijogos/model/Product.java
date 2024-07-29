package com.generation.eaijogos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.eaijogos.model.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo NAME é Obrigatorio!")
	@Size(min = 3, max = 100, message = "O atributo NAME deve conter no minimo 03 e no maximo 100 caracteres")
	private String name;
	
	@NotNull(message = "O atributo PRICE é obrigatório!")
	private float price;
	
	@NotBlank(message = "O atributo DESCRIPTION é Obrigatorio!")
	@Size(min = 3, max = 100, message = "O atributo DESCRIPTION deve conter no minimo 03 e no maximo 100 caracteres")
	private String description;

	@ManyToOne
	@JsonIgnoreProperties("product")
	private Category category;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
