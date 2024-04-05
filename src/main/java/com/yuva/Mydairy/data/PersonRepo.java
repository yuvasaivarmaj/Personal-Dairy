package com.yuva.Mydairy.data;

import com.yuva.Mydairy.biz.logs.LogData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<LogData, Long> {

}
