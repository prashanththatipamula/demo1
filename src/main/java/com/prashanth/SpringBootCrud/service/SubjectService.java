	package com.prashanth.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prashanth.SpringBootCrud.bean.Subject;
import com.prashanth.SpringBootCrud.repository.SubjectRepository;

@Service
@Component
@ComponentScan("com.prashanth.SpringBootCrud.repository")
public class SubjectService {
	
	@Autowired(required = false)
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects() {
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
		}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void updateSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
		
	}

	

}
