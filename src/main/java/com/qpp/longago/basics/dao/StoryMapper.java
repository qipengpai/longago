package com.qpp.longago.basics.dao;

import com.qpp.longago.basics.entity.Story;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Story record);

    int insertSelective(Story record);

    Story selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Story record);

    int updateByPrimaryKey(Story record);
}