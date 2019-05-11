package com.zhujiaqqq.pear.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "video_name")
    private String videoName;
    @Column(name = "video_author")
    private String videoAuthor;
    @Column(name = "page_url")
    private String pageUrl;
    @Column(name = "video_url")
    private String videoUrl;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "create_time")
    private Date createTime;
    private String content;

    public Video(Integer id, String videoName,
                 String videoAuthor, String pageUrl,
                 String videoUrl, String imageUrl,
                 Date createTime, String content) {
        this.id = id;
        this.videoName = videoName;
        this.videoAuthor = videoAuthor;
        this.pageUrl = pageUrl;
        this.videoUrl = videoUrl;
        this.imageUrl = imageUrl;
        this.createTime = createTime;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", videoName='" + videoName + '\'' +
                ", videoAuthor='" + videoAuthor + '\'' +
                ", pageUrl='" + pageUrl + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoAuthor() {
        return videoAuthor;
    }

    public void setVideoAuthor(String videoAuthor) {
        this.videoAuthor = videoAuthor;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Video() {
    }
}
