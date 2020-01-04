package com.example.xiaoshuo.controller;

import com.example.xiaoshuo.entity.NovelContent;
import com.example.xiaoshuo.service.INovelContentService;
import com.example.xiaoshuo.vo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/novel/")
public class NovelController {
    @Resource
    private INovelContentService iNovelContentService;
    @RequestMapping("nextContent")
    @ResponseBody
    private JsonResult getContent(){
        NovelContent novelContent = iNovelContentService.getNovelContent();
        return new JsonResult(novelContent);
    }
}
