package com.aba.ourvideo.ServiceImpl;

import com.aba.ourvideo.Bean.VideoInfo;
import com.aba.ourvideo.Bean.toPage;
import com.aba.ourvideo.Dao.VideoDao;
import com.aba.ourvideo.Service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoDao videoDao;

    @Override
    public List <VideoInfo> showVideoInfo(String content) {

        return videoDao.showVideoInfo(content);
    }

    @Override
    public Integer allcount(String name) {

        return videoDao.allCount(name);
    }

    @Override
    public List<VideoInfo> nextPage(toPage toPage) {

        return videoDao.nextPage(toPage);
    }


}
