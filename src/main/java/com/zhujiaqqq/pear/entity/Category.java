package com.zhujiaqqq.pear.entity;

public enum Category {
    NEWS("10", "新知"),
    MUSIC("59", "音乐"),
    TASTE("6", "美食"),
    AUTO("31", "汽车"),
    FINANCE("3", "财富"),
    ENTERTAINMENT("4", "娱乐"),
    TECH("8", "科技"),
    LIFE("5", "生活"),
    SPORT("9", "体育"),
    WORLD("2", "世界"),
    CHINA("1", "社会");

    private String categoryId;
    private String desc;

    Category(String categoryId, String desc) {
        this.categoryId = categoryId;
        this.desc = desc;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
