package com.example.labksp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlsCreate {
    private String imageUrls;
    private String videoUrls;
    private String guides;


    public List<String> getImageUrls() {
        return getMass(imageUrls);
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public List<String> getVideoUrls() {
        return getMass(videoUrls);
    }

    public void setVideoUrls(String videoUrls) {
        this.videoUrls = videoUrls;
    }

    public List<String> getGuides() {
        return getMass(guides);
    }

    public void setGuides(String guides) {
        this.guides = guides;
    }

    public UrlsCreate(String imageUrls, String videoUrls, String guides) {
        this.imageUrls = imageUrls;
        this.videoUrls = videoUrls;
        this.guides = guides;
    }
    public List<String> getMass(String str)
    {
        List<String> lst = new ArrayList<String>();
        Pattern pattern = Pattern.compile("\\d+");

        Matcher matcher = pattern.matcher(str);
        int start = 0;
        while (matcher.find(start)) {
            String value = str.substring(matcher.start(), matcher.end());
            lst.add(value);
            start = matcher.end();
        }

        return lst;
    }
}
