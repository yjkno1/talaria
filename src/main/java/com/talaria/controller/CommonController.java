package com.talaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.talaria.model.CartVO;
import com.talaria.model.Sample;
import com.talaria.model.View;
import com.talaria.service.SampleService;

@RestController
@RequestMapping("sample")
public class CommonController {

	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);

	@Autowired
	private SampleService sampleService;
	
	/**
	 * Sample Method - GET
	 * @param sample
	 * @return
	  {
	      "sample_no": 5,
	      "sample_title": "test234234"
	  }
	 */

	@JsonView(View.Summary.class)
	@RequestMapping(value="/list", method=RequestMethod.GET, produces="application/json")
	public List<Sample> getSampleList(@ModelAttribute("Sample") Sample sample) {
		Sample param = new Sample();
		param.setSample_no(sample.getSample_no());
		param.setSample_title("test");
		logger.debug("GET SAMPLE LIST :::::::::::::::::::::::::::::::::::::::::::::::");
//		List<Sample> list = sampleService.getSample(param);
		
		List<Sample> list = new ArrayList<Sample>();
		
		list.add(param);
		
		return list;
	}
	
	/**
	 * Sample method - POST
	 * @param RequestBody: Json String
	 * @return
	 [
	    {
	        "sample_no": 5,
	        "sample_title": "test234234"
	    },
	    {
	        "sample_no": 5,
	        "sample_title": "test234234"
	    },
	    {
	        "sample_no": 5,
	        "sample_title": "test234234"
	    },
	    {
	        "sample_no": 5,
	        "sample_title": "test234234"
	    }
	]
	 
	 */
	@JsonView(View.SummaryWithName.class)
	@RequestMapping(value="/list", method=RequestMethod.POST, produces="application/json")
	public List<Sample> getSampleList2(@RequestBody Sample sample) {
		Sample param = new Sample();
		param.setSample_no(sample.getSample_no());
		param.setSample_title("test234234");
		logger.debug("GET SAMPLE LIST :::::::::::::::::::::::::::::::::::::::::::::::");
//		List<Sample> list = sampleService.getSample(param);
		
		List<Sample> list = new ArrayList<Sample>();
		
		list.add(param);
		list.add(param);
		list.add(param);
		list.add(param);
		
		return list;
	}
}
