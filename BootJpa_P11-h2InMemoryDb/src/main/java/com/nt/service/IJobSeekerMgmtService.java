package com.nt.service;

import com.nt.entity.JobSeeker;

public interface IJobSeekerMgmtService {
	public String registerJobSeeker(JobSeeker js);
	public Iterable<JobSeeker> showAllJobSeeker();
	public double showJSAgeByid(int id);

}
