package com.talaria.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talaria.mapper.sample.SampleMapper;
import com.talaria.model.Sample;

@Service
public class SampleServiceImpl implements SampleService {

	private static final Logger logger = LoggerFactory.getLogger(SampleServiceImpl.class);

	@Autowired
	private SampleMapper sampleMapper;

	@Override
	public List<Sample> getSample(Sample param) {
		return sampleMapper.getSampleList(param);
	}
	
}
