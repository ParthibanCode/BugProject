package com.example.bugtracking.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bugtracking.BugRepository;
import com.example.bugtracking.entity.Bug;
import com.example.bugtracking.service.BugService;

@RestController
public class BugController {
	
	@Autowired
	private BugService bugService;

	@Autowired
	private BugRepository bugRepository;

	@PostMapping("/bug")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addBug(@RequestBody @Valid Bug bug) {
		bugService.addBug(bug);
	}
	@GetMapping("/bug")
	public List<Bug> getAllBugs() {
		return bugRepository.findAll();
	}
	@GetMapping("/bug/{id}")
	public Optional<Bug> getBugbyId(@PathVariable(value = "id") int id) {
		return bugRepository.findById(id);
	}

}
