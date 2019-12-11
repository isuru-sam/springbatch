package com.example.batchchunk.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.batchchunk.dto.StudentDTO;

public class StudentProcessor implements ItemProcessor<StudentDTO,String>{

	@Override
	public String process(StudentDTO item) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Processing"+item.getName()+item.getEmailAddress());
		return item.getName()+item.getEmailAddress();
	}
	

}
