package com.zhujiaqqq.pear.service;

import com.zhujiaqqq.pear.entity.CommonResult;
import com.zhujiaqqq.pear.entity.Video;

import java.util.List;

public interface IVideoService {
    /**
     * 通过ID获取一个视频信息
     *
     * @param id 视频ID
     * @return 视频信息
     */
    CommonResult<Video> findOne(Integer id);

    /**
     * 获取视频列表
     *
     * @param index    索引
     * @param pageSize 页面大小
     * @return 视频列表
     */
    CommonResult<List<Video>> findAllByPage(Integer index, Integer pageSize);

}
