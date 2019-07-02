package com.vishnu.collaboration.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishnu.collaborationBack.daoimpl.BlogDaoImpl;
import com.vishnu.collaborationBack.model.Blog;




@RestController
public class BlogController {
	
	@Autowired
	BlogDaoImpl blogDao;
	
	public BlogController() {
		System.out.println("blog controller");
	
	}
	@RequestMapping("/bbc")
	public List<Blog> getAllBlogs()
	{
		Blog blog1= new Blog();
		Blog blog2=new Blog();
		Blog blog3=new Blog();
		blog3.setBlogName("bbc");
		blog3.setOwner("b");
		blog1.setBlogName("abc");
		blog1.setOwner("a");
		blog2.setBlogName("cds");
		blog2.setOwner("c");
		List<Blog> blogList=new ArrayList<Blog>();
		blogList.add(blog1);
		blogList.add(blog2);
		blogList.add(blog3);
		return blogList;
		
	}
	
	@PostMapping("/getblog")
	public  void getBlog(@RequestBody Blog blog)
	{
		boolean b= blogDao.addBlog(blog);
		System.out.println(b);
		System.out.println("Hello"+blog.getBlogName());
		List<Blog> list=blogDao.getAllBlogs();
		for (Blog blog2 : list) 
		{
			System.out.println(blog2.getBlogName());
		}
	}
}
