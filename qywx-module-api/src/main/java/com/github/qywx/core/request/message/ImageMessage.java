package com.github.qywx.core.request.message;

/**
 * Created by kjtang on 2017/12/14.
 * 图片消息
 */
public class ImageMessage extends Message {

    // 图片链接
    private String PicUrl;
    // 图片媒体文件id，可以调用获取媒体文件接口拉取
    private String MediaId;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

}
