package com.example.cybernautpen;
public class penny2 {
    private String slug;
    private String followers_no;
    private String status;
    private String communityimage;

    public penny2() {
    }

    public penny2(String slug, String followers_no, String status, String communityimage) {
        this.slug = slug;
        this.followers_no = followers_no;
        this.status = status;
        this.communityimage = communityimage;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getFollowers_no() {
        return followers_no;
    }

    public void setFollowers_no(String followers_no) {
        this.followers_no = followers_no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommunityimage() {
        return communityimage;
    }

    public void setCommunityimage(String communityimage) {
        this.communityimage = URL.imdata+communityimage;
    }
}

