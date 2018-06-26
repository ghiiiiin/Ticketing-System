package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.FollowUpDAO;
import com.example.syp.model.FollowUp;
import com.example.syp.repository.FollowUpRepository;

@Service
public class FollowUpService implements FollowUpDAO{

	@Autowired
	FollowUpRepository followUpRepository;
	
	@Override
	public void insert(FollowUp followup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FollowUp followup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(FollowUp followup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FollowUp getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FollowUp> getAll() {
		List<FollowUp> lfp = new ArrayList<>();
		followUpRepository.findAll().forEach(lfp::add);
		return lfp;
	}

}
