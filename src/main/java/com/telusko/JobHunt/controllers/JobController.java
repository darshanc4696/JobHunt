package com.telusko.JobHunt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.JobHunt.model.JobPost;
import com.telusko.JobHunt.services.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping({"/", "home"})
	public String home()
	{
		System.out.println("inside home");
		return "home";
	}
	
	@GetMapping("addjob")
	public String addjob()
	{
		return "addjob";
	}
	
	@PostMapping("handleForm")
	public String handleForm(JobPost jobPost)
	{
		jobService.addJob(jobPost);
		return "success";
	}
	
	@GetMapping("viewalljobs")
	public String viewJobs(Model model)
	{
		List<JobPost> jobPosts = jobService.viewAllJobs();
		model.addAttribute("jobPosts", jobPosts);
		return "viewalljobs";
	}

}
