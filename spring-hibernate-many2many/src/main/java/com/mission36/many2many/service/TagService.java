package com.mission36.many2many.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.many2many.entity.Tag;
import com.mission36.many2many.repositary.TagRepositary;

@Service
public class TagService {
    @Autowired
	private TagRepositary tagRepositary;
	
	public Tag saveTag(Tag tag) {
		  return tagRepositary.save(tag);
	}
}
