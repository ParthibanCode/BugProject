package com.example.bugtracking.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bugtracking.BugRepository;
import com.example.bugtracking.entity.Bug;

@Service
public class BugService {

	@Autowired
	BugRepository bugRepo;
	
	public void addBug(@Valid Bug bug) {
		bugRepo.save(bug);
	}
}
