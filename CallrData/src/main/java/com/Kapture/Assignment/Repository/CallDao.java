package com.Kapture.Assignment.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Kapture.Assignment.Entity.Calls;
@Repository
public interface CallDao extends JpaRepository<Calls, Integer> {
	@Query("Select Hour(c.Start_Time) as start,Hour(c.end_time) as end,Count(c) as volume From Calls c Group by Hour(c.Start_Time) Order by volume Desc limit 1")
	public List<Object[]> highestCallVolumeOfDay();
	
	@Query("Select Hour(c.Start_Time) as start,Hour(c.end_time) as end From Calls c Group by Hour(c.Start_Time) Order by Duration Desc limit 1")
	public List<Object[]> longestCallOfDay();
	
	
	@Query("Select Hour(c.Start_Time) as start,Hour(c.end_time) as end,Count(c) as volume From Calls c where DATE(c.Start_Time)=date(:date) Group by Hour(c.Start_Time) Order by volume Desc limit 1")
	public List<Object[]> highestCallVolumeOfaDay(Date date);
	
	@Query("Select Hour(c.Start_Time) as start,Hour(c.end_time) as end From Calls c where DATE(c.Start_Time)=date(:date) Group by Hour(c.Start_Time) Order by Duration Desc limit 1")
	public List<Object[]> longestCallOfaDay(Date date);
	
	@Query("Select DAYNAME(c.Start_Time) as start,Count(c) as volume From Calls c Group by DAYNAME(c.Start_Time)Order by volume Desc limit 1")
	public List<Object[]> highestCallVolumeOfWeek();
	
	@Query("Select DAYNAME(c.Start_Time) as start From Calls c Group by Hour(c.Start_Time) Order by Duration Desc limit 1")
	public List<Object[]> longestcallOfWeek();
}
