package mikasa.ackerman.ttd.host.pojo;

import java.util.Collections;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import mikasa.ackerman.ttd.host.pojo.VideoCategories.VideoCategory;
import mikasa.ackerman.ttd.host.pojo.entity.Video;

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

    public static class VideoCategory implements android.os.Parcelable {

        /**
         * category : subv_entertainment
         * category_type : 0
         * flags : 0
         * hor_immersive_category : tt_subv_landscape
         * icon_url :
         * name : 濞变箰
         * tip_new : 0
         * type : 4
         * web_url :
         */

        @SerializedName("category")
        private String category;
        @SerializedName("category_type")
        private int categoryType;
        @SerializedName("flags")
        private int flags;
        @SerializedName("hor_immersive_category")
        private String horImmersiveCategory;
        @SerializedName("icon_url")
        private String iconUrl;
        @SerializedName("name")
        private String name;
        @SerializedName("tip_new")
        private int tipNew;
        @SerializedName("type")
        private int type;
        @SerializedName("web_url")
        private String webUrl;

        public String getCategory() { return category;}

        public void setCategory(String category) { this.category = category;}

        public int getCategoryType() { return categoryType;}

        public void setCategoryType(int categoryType) { this.categoryType = categoryType;}

        public int getFlags() { return flags;}

        public void setFlags(int flags) { this.flags = flags;}

        public String getHorImmersiveCategory() { return horImmersiveCategory;}

        public void setHorImmersiveCategory(String horImmersiveCategory) {
            this.horImmersiveCategory = horImmersiveCategory;
        }

        public String getIconUrl() { return iconUrl;}

        public void setIconUrl(String iconUrl) { this.iconUrl = iconUrl;}

        public String getName() { return name;}

        public void setName(String name) { this.name = name;}

        public int getTipNew() { return tipNew;}

        public void setTipNew(int tipNew) { this.tipNew = tipNew;}

        public int getType() { return type;}

        public void setType(int type) { this.type = type;}

        public String getWebUrl() { return webUrl;}

        public void setWebUrl(String webUrl) { this.webUrl = webUrl;}

        @Override
        public int describeContents() { return 0; }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.category);
            dest.writeInt(this.categoryType);
            dest.writeInt(this.flags);
            dest.writeString(this.horImmersiveCategory);
            dest.writeString(this.iconUrl);
            dest.writeString(this.name);
            dest.writeInt(this.tipNew);
            dest.writeInt(this.type);
            dest.writeString(this.webUrl);
        }

        public VideoCategory() {}

        protected VideoCategory(Parcel in) {
            this.category = in.readString();
            this.categoryType = in.readInt();
            this.flags = in.readInt();
            this.horImmersiveCategory = in.readString();
            this.iconUrl = in.readString();
            this.name = in.readString();
            this.tipNew = in.readInt();
            this.type = in.readInt();
            this.webUrl = in.readString();
        }

        public static final Creator<VideoCategory> CREATOR = new Creator<VideoCategory>() {
            @Override
            public VideoCategory createFromParcel(Parcel source) {return new VideoCategory(source);}

            @Override
            public VideoCategory[] newArray(int size) {return new VideoCategory[size];}
        };
    }
}
