package org.tokenizer.client.api;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class TokenizerDocument implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String source;
    private Date date;
    private String author;
    private int age;
    private GenderType gender;
    private String title;
    private String content;
    private Set<String> features;
    private int sentiment;
    private String treebank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<String> getFeatures() {
        return features;
    }

    public void setFeatures(Set<String> features) {
        this.features = features;
    }

    public int getSentiment() {
        return sentiment;
    }

    public void setSentiment(int sentiment) {
        this.sentiment = sentiment;
    }

    public String getTreebank() {
        return treebank;
    }

    public void setTreebank(String treebank) {
        this.treebank = treebank;
    }

}
