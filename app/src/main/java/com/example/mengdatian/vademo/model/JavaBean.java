package com.example.mengdatian.vademo.model;

/**
 * @author mengdatian
 */
public class JavaBean {
    private String id;
    private int tag;
    private String content;

    public JavaBean(String id, int tag, String content) {
        this.id = id;
        this.tag = tag;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
