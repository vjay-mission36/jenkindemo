package com.mission36.many2many.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mission36.many2many.entity.Post;
import com.mission36.many2many.repositary.PostRepositary;

@Service
public class PostService {
  
	@Autowired
	private PostRepositary postRepositary;
	
	public Post savePost(Post post) {
		return postRepositary.save(post);
	}
}
