package mikasa.ackerman.ttd.host.pojo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

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
 * 2020/5/7 11:55 AM
 */
public class Result {

    /**
     * data : {"sections":[{"text":"常用","name":"mytabs_common","section_style":0,
     * "get_more_url":"sslocal://profile_entry_list?detail=common&title=%e5%b8%b8%e7%94%a8%e5%b7%a5%e5%85%b7",
     * "sub_title":"查看全部","signposts":[{"text":"关注","grey_text":"","url":"sslocal://relation","key":"relation",
     * "icons":{"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
     * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0730002e652b693de88~noop
     * .webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text":"消息通知","grey_text":"","url":"sslocal://message",
     * "key":"msg_notification","icons":{"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn
     * -tos.pstatp.com/img/mosaic-legacy/1e0740002e78806e1f2b3~noop.webp"}],"width":24},"night":{"height":24,
     * "radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e0740002e78806e1f2b3~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text
     * ":"收藏","grey_text":"","url":"sslocal://mine_action_detail?refer=my_favorites","key":"my_favorites","icons":{
     * "day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e06c0002e594934f7e16~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
     * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e06c0002e594934f7e16~noop
     * .webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text":"浏览历史","grey_text":"",
     * "url":"sslocal://mine_action_detail?refer=my_read_history","key":"my_read_history","icons":{"day":{"height
     * ":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e0670002eb4084ad013c~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
     * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0670002eb4084ad013c~noop
     * .webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text":"钱包","grey_text":"","url":"sslocal://cj_wallet",
     * "key":"mall","icons":{"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e0660002e8c1d26332ce~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
     * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0660002e8c1d26332ce~noop
     * .webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text":"下载管理","grey_text":"",
     * "url":"sslocal://download_center","key":"download","icons":{"day":{"height":24,"radius":0,"uri":"",
     * "url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/2dd480007bb820ca6d31c~noop.webp"}],
     * "width":24},"night":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/2dd480007bb820ca6d31c~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text
     * ":"用户反馈","grey_text":"","url":"sslocal://feedback?target=question_list","key":"feedback","icons":{"day":{
     * "height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e06a0002e9c41f5391b4~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
     * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e06a0002e9c41f5391b4~noop
     * .webp"}],"width":24}},"tip_new":0,"tip_text":""},{"text":"系统设置","grey_text":"","url":"sslocal://more",
     * "key":"config","icons":{"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
     * .com/img/mosaic-legacy/1e0680002e77f60778866~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
     * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0680002e77f60778866~noop
     * .webp"}],"width":24}},"tip_new":0,"tip_text":""}],"tip_new":0,"multi_tabs_array":null},{"text":"发现",
     * "name":"mini_program","section_style":0,
     * "get_more_url":"sslocal://microapp?app_id=tt9e8ae83701a02833&start_page=pages%2Fdiscover%2Findex&scene=011014
     * &launch_from=mine_shortcuts&sub_scene=0004","sub_title":"查看全部","signposts":[],"tip_new":0,
     * "multi_tabs_array":null}]}
     * message : success
     */

    @SerializedName("data")
    private Data data;
    @SerializedName("message")
    private String message;

    public Data getData() { return data;}

    public void setData(Data data) { this.data = data;}

    public String getMessage() { return message;}

    public void setMessage(String message) { this.message = message;}

    public static class Data {
        @SerializedName("sections")
        private List<Sections> sections;

        public List<Sections> getSections() { return sections;}

        public void setSections(List<Sections> sections) { this.sections = sections;}

        public static class Sections {
            /**
             * text : 常用
             * name : mytabs_common
             * section_style : 0
             * get_more_url : sslocal://profile_entry_list?detail=common&title=%e5%b8%b8%e7%94%a8%e5%b7%a5%e5%85%b7
             * sub_title : 查看全部
             * signposts : [{"text":"关注","grey_text":"","url":"sslocal://relation","key":"relation","icons":{"day":{
             * "height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
             * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"消息通知","grey_text":"","url":"sslocal://message","key":"msg_notification","icons":{"day":{
             * "height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0740002e78806e1f2b3~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
             * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0740002e78806e1f2b3~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"收藏","grey_text":"","url":"sslocal://mine_action_detail?refer=my_favorites",
             * "key":"my_favorites","icons":{"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1
             * -ttcdn-tos.pstatp.com/img/mosaic-legacy/1e06c0002e594934f7e16~noop.webp"}],"width":24},"night":{
             * "height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e06c0002e594934f7e16~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"浏览历史","grey_text":"","url":"sslocal://mine_action_detail?refer=my_read_history",
             * "key":"my_read_history","icons":{"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1
             * -ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0670002eb4084ad013c~noop.webp"}],"width":24},"night":{
             * "height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0670002eb4084ad013c~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"钱包","grey_text":"","url":"sslocal://cj_wallet","key":"mall","icons":{"day":{"height":24,
             * "radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0660002e8c1d26332ce~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
             * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0660002e8c1d26332ce~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"下载管理","grey_text":"","url":"sslocal://download_center","key":"download","icons":{"day":{
             * "height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/2dd480007bb820ca6d31c~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
             * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/2dd480007bb820ca6d31c~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"用户反馈","grey_text":"","url":"sslocal://feedback?target=question_list","key":"feedback","icons":
             * {"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e06a0002e9c41f5391b4~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
             * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e06a0002e9c41f5391b4~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""},{
             * "text":"系统设置","grey_text":"","url":"sslocal://more","key":"config","icons":{"day":{"height":24,
             * "radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0680002e77f60778866~noop.webp"}],"width":24},"night":{"height":24,"radius":0,
             * "uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
             * .com/img/mosaic-legacy/1e0680002e77f60778866~noop.webp"}],"width":24}},"tip_new":0,"tip_text":""}]
             * tip_new : 0
             * multi_tabs_array : null
             */

            @SerializedName("text")
            private String text;
            @SerializedName("name")
            private String name;
            @SerializedName("section_style")
            private int sectionStyle;
            @SerializedName("get_more_url")
            private String getMoreUrl;
            @SerializedName("sub_title")
            private String subTitle;
            @SerializedName("tip_new")
            private int tipNew;
            @SerializedName("multi_tabs_array")
            private Object multiTabsArray;
            @SerializedName("signposts")
            private List<Signposts> signposts;

            public String getText() { return text;}

            public void setText(String text) { this.text = text;}

            public String getName() { return name;}

            public void setName(String name) { this.name = name;}

            public int getSectionStyle() { return sectionStyle;}

            public void setSectionStyle(int sectionStyle) { this.sectionStyle = sectionStyle;}

            public String getGetMoreUrl() { return getMoreUrl;}

            public void setGetMoreUrl(String getMoreUrl) { this.getMoreUrl = getMoreUrl;}

            public String getSubTitle() { return subTitle;}

            public void setSubTitle(String subTitle) { this.subTitle = subTitle;}

            public int getTipNew() { return tipNew;}

            public void setTipNew(int tipNew) { this.tipNew = tipNew;}

            public Object getMultiTabsArray() { return multiTabsArray;}

            public void setMultiTabsArray(Object multiTabsArray) { this.multiTabsArray = multiTabsArray;}

            public List<Signposts> getSignposts() { return signposts;}

            public void setSignposts(List<Signposts> signposts) { this.signposts = signposts;}

            public static class Signposts {
                /**
                 * text : 关注
                 * grey_text :
                 * url : sslocal://relation
                 * key : relation
                 * icons : {"day":{"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
                 * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24},"night":{"height":24,
                 * "radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
                 * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24}}
                 * tip_new : 0
                 * tip_text :
                 */

                @SerializedName("text")
                private String text;
                @SerializedName("grey_text")
                private String greyText;
                @SerializedName("url")
                private String url;
                @SerializedName("key")
                private String key;
                @SerializedName("icons")
                private Icons icons;
                @SerializedName("tip_new")
                private int tipNew;
                @SerializedName("tip_text")
                private String tipText;

                public String getText() { return text;}

                public void setText(String text) { this.text = text;}

                public String getGreyText() { return greyText;}

                public void setGreyText(String greyText) { this.greyText = greyText;}

                public String getUrl() { return url;}

                public void setUrl(String url) { this.url = url;}

                public String getKey() { return key;}

                public void setKey(String key) { this.key = key;}

                public Icons getIcons() { return icons;}

                public void setIcons(Icons icons) { this.icons = icons;}

                public int getTipNew() { return tipNew;}

                public void setTipNew(int tipNew) { this.tipNew = tipNew;}

                public String getTipText() { return tipText;}

                public void setTipText(String tipText) { this.tipText = tipText;}

                public static class Icons {
                    /**
                     * day : {"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
                     * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24}
                     * night : {"height":24,"radius":0,"uri":"","url_list":[{"url":"http://sf1-ttcdn-tos.pstatp
                     * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}],"width":24}
                     */

                    @SerializedName("day")
                    private Day day;
                    @SerializedName("night")
                    private Night night;

                    public Day getDay() { return day;}

                    public void setDay(Day day) { this.day = day;}

                    public Night getNight() { return night;}

                    public void setNight(Night night) { this.night = night;}

                    public static class Day {
                        /**
                         * height : 24
                         * radius : 0
                         * uri :
                         * url_list : [{"url":"http://sf1-ttcdn-tos.pstatp
                         * .com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}]
                         * width : 24
                         */

                        @SerializedName("height")
                        private int height;
                        @SerializedName("radius")
                        private int radius;
                        @SerializedName("uri")
                        private String uri;
                        @SerializedName("width")
                        private int width;
                        @SerializedName("url_list")
                        private List<UrlList> urlList;

                        public int getHeight() { return height;}

                        public void setHeight(int height) { this.height = height;}

                        public int getRadius() { return radius;}

                        public void setRadius(int radius) { this.radius = radius;}

                        public String getUri() { return uri;}

                        public void setUri(String uri) { this.uri = uri;}

                        public int getWidth() { return width;}

                        public void setWidth(int width) { this.width = width;}

                        public List<UrlList> getUrlList() { return urlList;}

                        public void setUrlList(List<UrlList> urlList) { this.urlList = urlList;}

                        public static class UrlList {
                            /**
                             * url : http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp
                             */

                            @SerializedName("url")
                            private String url;

                            public String getUrl() { return url;}

                            public void setUrl(String url) { this.url = url;}
                        }
                    }

                    public static class Night {
                        /**
                         * height : 24
                         * radius : 0
                         * uri :
                         * url_list : [{"url":"http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp"}]
                         * width : 24
                         */

                        @SerializedName("height")
                        private int height;
                        @SerializedName("radius")
                        private int radius;
                        @SerializedName("uri")
                        private String uri;
                        @SerializedName("width")
                        private int width;
                        @SerializedName("url_list")
                        private List<UrlListX> urlList;

                        public int getHeight() { return height;}

                        public void setHeight(int height) { this.height = height;}

                        public int getRadius() { return radius;}

                        public void setRadius(int radius) { this.radius = radius;}

                        public String getUri() { return uri;}

                        public void setUri(String uri) { this.uri = uri;}

                        public int getWidth() { return width;}

                        public void setWidth(int width) { this.width = width;}

                        public List<UrlListX> getUrlList() { return urlList;}

                        public void setUrlList(List<UrlListX> urlList) { this.urlList = urlList;}

                        public static class UrlListX {
                            /**
                             * url : http://sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/1e0730002e652b693de88~noop.webp
                             */

                            @SerializedName("url")
                            private String url;

                            public String getUrl() { return url;}

                            public void setUrl(String url) { this.url = url;}
                        }
                    }
                }
            }
        }
    }
}
