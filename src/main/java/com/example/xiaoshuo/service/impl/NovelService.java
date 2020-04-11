package com.example.xiaoshuo.service.impl;

import com.example.xiaoshuo.dao.NovelDao;
import com.example.xiaoshuo.entity.Novel;
import com.example.xiaoshuo.service.INovelService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class NovelService implements INovelService {
    public static Logger LOGGER = Logger.getLogger(NovelService.class);
    @Autowired
    private NovelDao novelDao;

    @Override
    public Novel getNovelbyName(String name) {
        Novel novel = novelDao.selectOne(name);
        if(novel != null){
            return novel;
        }else {
            LOGGER.info("novel is null");
        }
        return null;
    }
}
