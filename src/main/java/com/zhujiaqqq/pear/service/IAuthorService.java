package com.zhujiaqqq.pear.service;

import com.zhujiaqqq.pear.entity.Author;
import com.zhujiaqqq.pear.entity.CommonResult;

import java.util.List;

public interface IAuthorService {
    /**
     * 查单个作者
     *
     * @param id 作者ID
     * @return 作者信息
     */
    CommonResult<Author> findOne(Integer id);

    /**
     * 查询作者列表
     *
     * @param index    索引
     * @param pageSize 页面大小
     * @return 作者列表
     */
    CommonResult<List<Author>> findAllByPage(Integer index, Integer pageSize);

    /**
     * 获取作者数量
     *
     * @return 作者数量
     */
    CommonResult<Long> getAuthorsCount();
}
