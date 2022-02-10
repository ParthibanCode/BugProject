package com.example.bugtracking;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bugtracking.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
