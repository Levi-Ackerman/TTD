package mikasa.ackerman.ttd.host.video.pojo;

import java.util.Collections;
import java.util.List;

import mikasa.ackerman.ttd.host.pojo.IPojo;
import mikasa.ackerman.ttd.host.video.pojo.VideoCategory;

/**
 * TTD
 *
 * <p>Title: </p>
 *
 * <p>Description: </p>
 * <p>
 *
 * <br>
 * 用法:
 * <pre>
 * </pre>
 * </p>
 *
 * <p>Copyright: Copyright (c) 2020</p>
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/5/15 11:33 PM
 */
public class VideoCategories implements IPojo<List<VideoCategory>> {
    private String message;
    private List<VideoCategory> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VideoCategory> getData() {
        return data;
    }

    public void setData(List<VideoCategory> data) {
        this.data = data;
    }

    @Override
    public boolean isEmpty() {
        if (data == null){
            return true;
        }else{
            return data.isEmpty();
        }
    }

    @Override
    public List<VideoCategory> getContent() {
        if (data == null){
            return Collections.emptyList();
        }else{
            return data;
        }
    }

}
