package com.example.xiaoshuo.controller;

import com.example.xiaoshuo.entity.NovelContent;
import com.example.xiaoshuo.service.INovelContentService;
import com.example.xiaoshuo.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/novel/")
public class NovelController {
    @Resource
    private INovelContentService iNovelContentService;
    @RequestMapping("nextContent")
    @ResponseBody
    private JsonResult getNextContent(@RequestParam String novelName,@RequestParam Integer chapterId){
        NovelContent novelContent = iNovelContentService.getNovelContent(novelName,chapterId);
        return new JsonResult(novelContent);
    }
    @RequestMapping("content")
    @ResponseBody
    private JsonResult getContent(@RequestParam String novelName){
        List<NovelContent> novelContentList = iNovelContentService.getNovelContentList(novelName);
        return new JsonResult(novelContentList);
    }
}
