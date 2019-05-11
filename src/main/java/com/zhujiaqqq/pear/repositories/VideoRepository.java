package com.zhujiaqqq.pear.repositories;

import com.zhujiaqqq.pear.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VideoRepository extends JpaRepository<Video, Integer>, JpaSpecificationExecutor<Video> {

}
