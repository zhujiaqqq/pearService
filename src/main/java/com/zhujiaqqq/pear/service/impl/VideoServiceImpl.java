package com.zhujiaqqq.pear.service.impl;

import com.zhujiaqqq.pear.entity.CommonResult;
import com.zhujiaqqq.pear.entity.Video;
import com.zhujiaqqq.pear.repositories.VideoRepository;
import com.zhujiaqqq.pear.service.IVideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements IVideoService {
    private static Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);

    private final VideoRepository repository;

    @Autowired
    public VideoServiceImpl(VideoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CommonResult<Video> findOne(Integer id) {
        Assert.notNull(id, "id不可为空");
        logger.debug("查询视频，ID={}", id);
        Optional<Video> res = repository.findById(id);
        logger.debug("查询视频，res={}", res.orElse(null));
        Assert.notNull(res.orElse(null), "搜索结果为空");
        return new CommonResult<>(res.orElse(null), "", "", Boolean.TRUE);
    }

    @Override
    public CommonResult<List<Video>> findAllByPage(Integer index, Integer pageSize) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(index, pageSize, sort);
        Page<Video> res = repository.findAll(pageable);
        return new CommonResult<>(res.getContent(), "", "", Boolean.TRUE);
    }
}
