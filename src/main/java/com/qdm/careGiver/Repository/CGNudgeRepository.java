package com.qdm.careGiver.Repository;

import org.springframework.stereotype.Repository;

import com.qdm.careGiver.Entity.Nudges;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CGNudgeRepository extends JpaRepository<Nudges,Integer>{
	List<String> getNudge(int size);
	List<String> getAllNudges();
}
