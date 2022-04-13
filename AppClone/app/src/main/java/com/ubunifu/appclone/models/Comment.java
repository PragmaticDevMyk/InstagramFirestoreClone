package com.ubunifu.appclone.models;

public class Comment {

    private String comment;
    private String publisher;
    private String commentid;
    private String profile_img_url, names;



    public Comment() {
    }

    public Comment(String comment, String publisher, String commentid, String profile_img_url, String names) {
        this.comment = comment;
        this.publisher = publisher;
        this.commentid = commentid;
        this.profile_img_url = profile_img_url;
        this.names = names;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getProfile_img_url() {
        return profile_img_url;
    }

    public void setProfile_img_url(String profile_img_url) {
        this.profile_img_url = profile_img_url;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
