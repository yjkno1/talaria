package com.talaria.mapper.sample;

import java.util.List;

import com.talaria.model.Sample;

public interface SampleMapper {

	List<Sample> getSampleList(Sample sampleParam);

}
