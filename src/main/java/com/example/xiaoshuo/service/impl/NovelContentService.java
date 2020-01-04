package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.NovelContentDao;
import com.example.xiaoshuo.entity.Novel;
import com.example.xiaoshuo.entity.NovelContent;
import com.example.xiaoshuo.service.INovelContentService;
import com.example.xiaoshuo.service.INovelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @author zhaomeng
 * @date 2020.1.3
 * 小说章节服务类，处理小说章节服务
 */
@Service
public class NovelContentService implements INovelContentService {
    @Resource
    private INovelService iNovelService;
    @Resource
    private NovelContentDao novelContentDao;
    @Override
    public NovelContent getNovelContent() {
        Novel nov = iNovelService.getNovelbyName("星辰变");
        if(nov != null){
            Integer id = nov.getId();
            NovelContent novelContent = novelContentDao.selectOne(id);
            if(novelContent != null){
                return  novelContent;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
}
