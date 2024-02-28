package com.hexagonal.task.domain.models;

public class AdditionalTaskInfo {
    private final Long userid;
    private final String username;
    private final String userEmail;

    public AdditionalTaskInfo(Long userid, String username, String userEmail) {
        this.userid = userid;
        this.username = username;
        this.userEmail = userEmail;
    }

    public Long getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
