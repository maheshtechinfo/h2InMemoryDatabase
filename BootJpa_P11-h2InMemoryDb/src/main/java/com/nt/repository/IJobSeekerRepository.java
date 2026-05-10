package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

	@Query(value = "SELECT DATEDIFF('YEAR', dob, CURRENT_DATE) AS age "
			+ "FROM jobseeker_joda WHERE js_id = :id", nativeQuery = true)
	public int findJSAgeById(int id);

}
