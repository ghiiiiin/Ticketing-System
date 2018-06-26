package com.example.syp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.syp.dao.PriorityStatusDAO;
import com.example.syp.model.PriorityStatus;
import com.example.syp.repository.PriorityStatusRepository;

@Service
public class PriorityStatusService implements PriorityStatusDAO{

	@Autowired
	PriorityStatusRepository priorityStatusRepository;
	
	@Override
	public void insert(PriorityStatus prioritystatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PriorityStatus prioritystatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PriorityStatus prioritystatus) {
		priorityStatusRepository.delete(prioritystatus);
		
	}

	@Override
	public PriorityStatus getById(long id) {
		PriorityStatus ps = priorityStatusRepository.findById(id).get();
		return ps;
	}

	@Override
	public List<PriorityStatus> getAll() {
		List<PriorityStatus> lps = new ArrayList<>();
		priorityStatusRepository.findAll().forEach(lps::add);
		return lps;
	}

	@Override
	public void SaveOrUpdate(PriorityStatus prioritystatus) {
		priorityStatusRepository.save(prioritystatus);
		
	}

	@Override
	public void deletePriority(long id) {
		priorityStatusRepository.deleteById(id);
		
	}

}
