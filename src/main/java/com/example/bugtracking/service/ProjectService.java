package com.example.bugtracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bugtracking.ProjectRepository;
import com.example.bugtracking.entity.Project;

@Service
public class ProjectService {

	@Autowired
	ProjectRepository projectRepo;
	
	public void addProject(Project p1) {
		projectRepo.save(p1);
	}
	
}
