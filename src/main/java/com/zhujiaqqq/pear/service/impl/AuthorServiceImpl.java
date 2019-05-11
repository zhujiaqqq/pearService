package com.zhujiaqqq.pear.service.impl;

import com.zhujiaqqq.pear.entity.Author;
import com.zhujiaqqq.pear.entity.CommonResult;
import com.zhujiaqqq.pear.repositories.AuthorRepository;
import com.zhujiaqqq.pear.service.IAuthorService;
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
public class AuthorServiceImpl implements IAuthorService {
    private static Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);

    private final AuthorRepository repository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public CommonResult<Author> findOne(Integer id) {
        Assert.notNull(id, "id不可为空");
        logger.debug("查询作者，ID={}", id);
        Optional<Author> res = repository.findById(id);
        logger.debug("查询作者，res={}", res.orElse(null));
        Assert.notNull(res.orElse(null), "搜索结果为空");
        return new CommonResult<>(res.get(), "", "", Boolean.TRUE);
    }

    @Override
    public CommonResult<List<Author>> findAllByPage(Integer index, Integer pageSize) {
        Sort sort = new Sort(Sort.Direction.ASC, "id");
        Pageable pageable = PageRequest.of(index, pageSize, sort);
        Page<Author> res = repository.findAll(pageable);
        return new CommonResult<>(res.getContent(), "", "", Boolean.TRUE);
    }

    @Override
    public CommonResult<Long> getAuthorsCount() {
        Long count = repository.count();
        return new CommonResult<>(count, "", "", Boolean.TRUE);
    }
}
