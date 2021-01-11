package com.mission36.many2many.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mission36.many2many.entity.Post;
import com.mission36.many2many.entity.Tag;
import com.mission36.many2many.service.PostService;
import com.mission36.many2many.service.TagService;

@RestController
public class PostRestController {
  
	@Autowired
	private PostService postService;
	
	@Autowired
	private TagService tagService;
	
	@PostMapping("savepost")
	public Post savePost() throws ParseException {
		Post p = new Post();
		p.setTitle("sample Post with update");
		p.setDescription("sample post description with update");
		p.setCreationDate(new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-23"));
		p = postService.savePost(p);
		return p;
	}
	
	@PostMapping("savetag")
	public Tag saveTag() {
		Tag tag = new Tag();
		tag.setName("hibernate");
		return tagService.saveTag(tag);
	}
	
	@PostMapping("savepostwithtag")
	public Post savePostWithTag() throws ParseException {
		
		// create a post
		Post p = new Post();
		p.setTitle("sample Post with tags many2many");
		p.setDescription("sample post description with Tag update many2 many");
		p.setCreationDate(new SimpleDateFormat("yyyy-MM-dd").parse("2021-11-23"));
		
		Tag tag1 = new Tag();
		tag1.setName("hybris6.4");
		tag1.getPosts().add(p);
		
		
		Tag tag2 = new Tag();
		tag2.setName("hybris18");
		tag2.getPosts().add(p);
		
		Tag tag3 = new Tag();
		tag3.setName("hybris20");
		tag3.getPosts().add(p);
		
		p.getTags().add(tag1); p.getTags().add(tag2); p.getTags().add(tag3);
		
		return postService.savePost(p);
		
		
		
	}
}
