package com.example.bugtracking;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bugtracking.entity.Bug;

public interface BugRepository extends JpaRepository<Bug, Integer> {

}
