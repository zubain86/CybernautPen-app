package com.example.cybernautpen;
public class penny {
    private String id;
    private String communityname;
    private String created_date;
    private String communitycategory;
    private String communityimage;

    public penny() {
    }

    public penny(String id, String communityname, String created_date, String communitycategory, String communityimage) {
        this.id = id;
        this.communityname = communityname;
        this.created_date = created_date;
        this.communitycategory = communitycategory;
        this.communityimage = communityimage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCommunitycategory() {
        return communitycategory;
    }

    public void setCommunitycategory(String communitycategory) {
        this.communitycategory = communitycategory;
    }

    public String getCommunityimage() {
        return communityimage;
    }

    public void setCommunityimage(String communityimage) {
        this.communityimage = URL.imdata+communityimage;
    }}


