package com.zhujiaqqq.pear.controller;

import com.zhujiaqqq.pear.entity.Author;
import com.zhujiaqqq.pear.entity.CommonResult;
import com.zhujiaqqq.pear.service.IAuthorService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private static Logger logger = LoggerFactory.getLogger(AuthorController.class);

    private final IAuthorService service;

    @Autowired
    public AuthorController(IAuthorService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public CommonResult<Author> getAuthorById(
            @PathVariable(value = "id") Integer id
    ) {
        logger.info("getAuthorById, id={}", id);
        CommonResult<Author> res = service.findOne(id);
        logger.info("getAuthorById,res={}", res.toString());
        return res;
    }

    @GetMapping()
    public CommonResult<List<Author>> getAuthors(
            @ApiParam(name = "页码") @RequestParam(value = "index", defaultValue = "0") Integer index,
            @ApiParam(name = "页面大小") @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize
    ) {
        logger.info("getAuthors,index={},pageSize={}", index, pageSize);
        CommonResult<List<Author>> res = service.findAllByPage(index, pageSize);
        logger.info("getAuthors,res={}", res);
        return res;
    }

    @GetMapping("/count")
    public CommonResult<Long> getCount() {
        logger.info("getCount()");
        CommonResult<Long> res = service.getAuthorsCount();
        logger.info("getCount,res=", res);
        return res;
    }
}
