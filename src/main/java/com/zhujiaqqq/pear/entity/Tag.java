package com.zhujiaqqq.pear.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "tag_name")
    private String tagName;
    @Column(name = "tag_addr")
    private String tagAddr;
    @Column(name = "tag_video_count")
    private Integer tagVideoCount;

    public Tag(String tagName,
               String tagAddr,
               Integer tagVideoCount) {
        this.tagName = tagName;
        this.tagAddr = tagAddr;
        this.tagVideoCount = tagVideoCount;
    }

    public Tag() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagAddr() {
        return tagAddr;
    }

    public void setTagAddr(String tagAddr) {
        this.tagAddr = tagAddr;
    }

    public Integer getTagVideoCount() {
        return tagVideoCount;
    }

    public void setTagVideoCount(Integer tagVideoCount) {
        this.tagVideoCount = tagVideoCount;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", tagName='" + tagName + '\'' +
                ", tagAddr='" + tagAddr + '\'' +
                ", tagVideoCount=" + tagVideoCount +
                '}';
    }
}
