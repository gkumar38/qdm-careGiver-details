package com.qdm.careGiver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalCountRepository extends JpaRepository<Integer,Integer>{
	public Integer getTotalClientCount();
	public Integer getTotalFeedBackCount();
}
