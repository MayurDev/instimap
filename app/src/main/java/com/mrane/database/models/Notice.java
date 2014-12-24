package com.mrane.database.models;

import com.google.gson.annotations.SerializedName;
import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

import java.util.Date;

public class Notice extends SugarRecord<Notice> {

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        this.isPublic = aPublic;
    }

    public String getCorners() {
        return corners;
    }

    public void setCorners(String corners) {
        this.corners = corners;
    }

    public int getUpdatesBelow() {
        return updatesBelow;
    }

    public void setUpdatesBelow(int updatesBelow) {
        this.updatesBelow = updatesBelow;
    }

    public int getUpdatesAbove() {
        return updatesAbove;
    }

    public void setUpdatesAbove(int updatesAbove) {
        this.updatesAbove = updatesAbove;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public long getDbId() {
        return dbId;
    }

    public void setDbId(long dbId) {
        this.dbId = dbId;
    }

    @SerializedName("id")
    long dbId;
    String data;
    @SerializedName("user_id")
    int userId;
    @SerializedName("position_id")
    int positionId;
    Date created;
    Date modified;
    int parent;
    boolean visible;
    @SerializedName("comment_count")
    int commentCount;
    @SerializedName("like_count")
    int likeCount;
    @SerializedName("start_time")
    Date startTime;
    @SerializedName("end_time")
    Date endTime;
    @SerializedName("public")
    boolean isPublic;
    String corners;
    @SerializedName("updates_below")
    int updatesBelow;
    @SerializedName("updates_above")
    int updatesAbove;
    @SerializedName("venue_id")
    int venueId;

    public class Corner {
        String name;
        String tag;

        public Corner() {}
    }

    public Notice() {}

    public Notice(boolean test) {
        this.dbId = 20L;
        this.data = "test success!";
        this.userId = 1;
        this.positionId = 1;
        this.created = new Date();
        this.modified = new Date();
        this.parent = 2;
        this.visible = true;
        this.commentCount = 10;
        this.likeCount = 20;
        this.startTime = new Date();
        this.endTime = new Date();
        this.isPublic = true;
        this.corners = "";
        this.updatesAbove = 0;
        this.updatesBelow = 0;
        this.venueId = 1;
    }

}

