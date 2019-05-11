package com.zhujiaqqq.pear.controller;

import com.zhujiaqqq.pear.entity.CommonResult;
import com.zhujiaqqq.pear.entity.Video;
import com.zhujiaqqq.pear.service.IVideoService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    private static Logger logger = LoggerFactory.getLogger(VideoController.class);
    private final IVideoService service;

    @Autowired
    public VideoController(IVideoService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public CommonResult<Video> getVideoById(
            @ApiParam(name = "视频ID") @PathVariable(value = "id") Integer id
    ) {
        logger.info("getVideoById,id={}", id);
        CommonResult<Video> res = service.findOne(id);
        logger.info("getVideoById,res={}", res);
        return res;
    }

    @GetMapping()
    public CommonResult<List<Video>> getVideos(
            @ApiParam(name = "页码") @RequestParam(value = "index", defaultValue = "0") Integer index,
            @ApiParam(name = "页面大小") @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize
    ) {
        logger.info("getVideos,index={},pageSize={}", index, pageSize);
        CommonResult<List<Video>> res = service.findAllByPage(index, pageSize);
        logger.info("getVideos,res={}", res);
        return res;
    }


}
