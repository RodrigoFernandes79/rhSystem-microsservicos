package com.userapi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter  @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)  // inclui no equals n hashcode apenas o que for explicitado
@Entity(name = "TB_USER")
public class User {
	
	@EqualsAndHashCode.Include  // explicitei que apenas o Id será incluído no Equals n hashcode
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String password;
	private String email;
	private Double hourlyPrice;

	

}
