package com.qpp.longago.basics.service.impl;

import com.qpp.longago.basics.dao.StoryMapper;
import com.qpp.longago.basics.entity.Story;
import com.qpp.longago.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryServiceImpl {

    @Autowired
    private StoryMapper storyMapper;
    @Autowired
    private RedisService redisService;
    /**
     *    查询最新故事列表
     *
     * @author pengpai
     * @date 2018/5/25 14:42
     * @param pageNum, pageSize
     * @return java.util.List<com.qpp.longago.basics.entity.Story>
     */
    public List<Story> selectNewStory(String pageNum, String pageSize) {
        return null;
    }
}
