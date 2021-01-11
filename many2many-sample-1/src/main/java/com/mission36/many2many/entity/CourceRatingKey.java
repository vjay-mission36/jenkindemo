package com.mission36.many2many.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourceRatingKey implements Serializable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="student_id")
	private Long studentId;
	
	@Column(name="column_id")
	private Long courceId;
	
}
