package com.zhujiaqqq.pear.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "author_name")
   private String authorName;
  private   String info;
    @Column(name = "home_url")
    private String homeUrl;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", info='" + info + '\'' +
                ", homeUrl='" + homeUrl + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getHomeUrl() {
        return homeUrl;
    }

    public void setHomeUrl(String homeUrl) {
        this.homeUrl = homeUrl;
    }

    public Author() {
    }

    public Author(String authorName, String info, String homeUrl) {
        this.authorName = authorName;
        this.info = info;
        this.homeUrl = homeUrl;
    }
}
