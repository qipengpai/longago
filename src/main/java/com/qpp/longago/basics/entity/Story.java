package com.qpp.longago.basics.entity;

public class Story {
    private Integer id;

    private String uuid;

    private String userId;

    private String storyTitle;

    private String storyMain;

    private String storyPic;

    private Integer state;

    private String registerTime;

    private String updateTime;

    private Integer veryOkCount;

    private Integer collectionCount;

    private Integer commentCount;

    private Integer storySecretType;

    private Integer storyPlayType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle == null ? null : storyTitle.trim();
    }

    public String getStoryMain() {
        return storyMain;
    }

    public void setStoryMain(String storyMain) {
        this.storyMain = storyMain == null ? null : storyMain.trim();
    }

    public String getStoryPic() {
        return storyPic;
    }

    public void setStoryPic(String storyPic) {
        this.storyPic = storyPic == null ? null : storyPic.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime == null ? null : registerTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Integer getVeryOkCount() {
        return veryOkCount;
    }

    public void setVeryOkCount(Integer veryOkCount) {
        this.veryOkCount = veryOkCount;
    }

    public Integer getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(Integer collectionCount) {
        this.collectionCount = collectionCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getStorySecretType() {
        return storySecretType;
    }

    public void setStorySecretType(Integer storySecretType) {
        this.storySecretType = storySecretType;
    }

    public Integer getStoryPlayType() {
        return storyPlayType;
    }

    public void setStoryPlayType(Integer storyPlayType) {
        this.storyPlayType = storyPlayType;
    }
}