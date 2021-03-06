package com.d2derp.oep.service.batch;

import java.util.List;

import com.d2derp.oep.pojo.BatchPojo;

public interface BatchService {

	void saveBatch(BatchPojo batchPojo);

	List<BatchPojo> listBatch();

	BatchPojo findBatch(int id);

	void deleteBatch(int id);

	BatchPojo editBatch(BatchPojo batchpojo);

	Long getCountOfBatches();

}
