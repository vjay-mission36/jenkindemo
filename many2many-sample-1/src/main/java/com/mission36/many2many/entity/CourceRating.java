package com.mission36.many2many.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.mission36.many2many.entity.*;

@Entity
public class CourceRating {
	
	@EmbeddedId
    private CourceRatingKey id;
	
	@ManyToOne
	@MapsId("studentId")
	@JoinColumn(name = "student_id")
	private Student student;
	
	@ManyToOne
	@MapsId("courceId")
	@JoinColumn(name = "cource_id")
	private Cource cource;
	
	int rating;
}
