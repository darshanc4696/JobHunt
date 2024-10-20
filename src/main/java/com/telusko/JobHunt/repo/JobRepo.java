package com.telusko.JobHunt.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.telusko.JobHunt.model.JobPost;

@Repository
public class JobRepo {
	
	List<JobPost> jobs = new ArrayList<>();
	
	public void saveJob(JobPost jobPost)
	{
		jobs.add(jobPost);
		System.out.println("job added");
	}

	public List<JobPost> viewAllJobs() {
		// TODO Auto-generated method stub
		return jobs;
	}

}
