package com.pickMyVote.pickMyVote.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pickMyVote.pickMyVote.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {

	List <Candidate> findByElecid(Long Elecid);

}
