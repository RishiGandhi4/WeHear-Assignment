package com.rishi.weheareroomapiassignment.Modal;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "actor")
public class Actor {
    @PrimaryKey(autoGenerate = true)
    private int actorId;

    @SerializedName("API")
    @ColumnInfo(name = "API")
    private String API;

    @SerializedName("Description")
    @ColumnInfo(name = "Description")
    private String Description;

    @SerializedName("Link")
    @ColumnInfo(name = "Link")
    private String Link;

    public Actor(String API, String Description, String Link) {
        this.actorId = actorId;
        this.API = API;
        this.Description = Description;
        this.Link = Link;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getAPI() {
        return API;
    }

    public void setAPI(String API) {
        this.API = API;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    @NonNull
    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", API=" + API +
                ", Description='" + Description + '\'' +
                ", Link='" + Link + '\'' +
                '}';
    }
}
