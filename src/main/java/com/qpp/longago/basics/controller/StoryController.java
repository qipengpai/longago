package com.qpp.longago.basics.controller;

import com.qpp.longago.basics.entity.Story;
import com.qpp.longago.basics.service.impl.StoryServiceImpl;
import com.qpp.longago.system.ActionUrl;
import com.qpp.longago.tool.Model;
import com.qpp.longago.tool.ParaClick;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoryController {

    @Autowired
    private StoryServiceImpl storyService;


    /**
     *    查询最新故事列表
     *
     * @author pengpai
     * @date 2018/5/25 14:41
     * @param pageNum, pageSize
     * @return com.qpp.longago.tool.Model
     */
    @ApiOperation("查询最新故事列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "当前页", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页的数量", required = true, dataType = "String", paramType = "query"),
    })
    @PostMapping(value = ActionUrl.STORY_SELECT_TEST)
    public Model selectNewStory(@RequestParam("pageNum") String pageNum,
                                   @RequestParam("pageSize") String pageSize)
            throws Exception {
        if (ParaClick.clickString(pageNum))
            pageNum="1";
        if (ParaClick.clickString(pageSize))
            pageNum="10";
        List<Story> story =storyService.selectNewStory(pageNum,pageSize);
        if (!ParaClick.clickList(story))
            return new Model(500, "查询错误");
        return new Model(200, story);
    }
}
