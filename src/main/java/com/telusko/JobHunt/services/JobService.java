package com.telusko.JobHunt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.JobHunt.model.JobPost;
import com.telusko.JobHunt.repo.JobRepo;

@Service
public class JobService {
	
	@Autowired
	private JobRepo jobrepo;
	
	public void addJob(JobPost jobPost)
	{
		jobrepo.saveJob(jobPost);
	}

	public List<JobPost> viewAllJobs() {
		
		return jobrepo.viewAllJobs();
	}

}
