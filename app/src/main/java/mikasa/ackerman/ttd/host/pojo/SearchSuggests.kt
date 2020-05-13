package mikasa.ackerman.ttd.host.pojo

import com.google.gson.annotations.SerializedName
import mikasa.ackerman.ttd.host.pojo.SearchSuggests.Data.SuggestWords

/**
 * TTD
 *
 *
 * Title:
 *
 *
 * Description:
 *
 *
 *
 * <br></br>
 * 用法:
 * <pre>
</pre> *
 *
 *
 *
 * Copyright: Copyright (c) 2020
 *
 * @author zhengxian.lzx@alibaba-inc.com
 * @version 1.0
 * 2020/5/13 12:48 PM
 */
class SearchSuggests : IPojo<List<SuggestWords>> {
    /**
     * data : {"call_per_refresh":2,"homepage_search_suggest":"新手机充电注意事项 | 港币兑换人民币","suggest_words":[{"id
     * ":"6595716952767862029","or":"qv:0 qvwgr:3","recommend_reason":"","word":"新手机充电注意事项","words_type":""},{"id
     * ":"6527574661591471367","or":"qvwgr:137","recommend_reason":"","word":"港币兑换人民币","words_type":""}]}
     * message : success
     */
    @SerializedName("data")
    var data: Data? = null

    @SerializedName("message")
    var message: String? = null

    override fun isEmpty(): Boolean? {
        return data?.suggestWords?.isEmpty()
    }

    override fun getContent(): List<SuggestWords>? {
        return data?.suggestWords
    }

    class Data {
        /**
         * call_per_refresh : 2
         * homepage_search_suggest : 新手机充电注意事项 | 港币兑换人民币
         * suggest_words : [{"id":"6595716952767862029","or":"qv:0 qvwgr:3","recommend_reason":"","word":"新手机充电注意事项",
         * "words_type":""},{"id":"6527574661591471367","or":"qvwgr:137","recommend_reason":"","word":"港币兑换人民币",
         * "words_type":""}]
         */
        @SerializedName("call_per_refresh")
        var callPerRefresh = 0

        @SerializedName("homepage_search_suggest")
        var homepageSearchSuggest: String? = null

        @SerializedName("suggest_words")
        var suggestWords: List<SuggestWords>? = null

        class SuggestWords {
            /**
             * id : 6595716952767862029
             * or : qv:0 qvwgr:3
             * recommend_reason :
             * word : 新手机充电注意事项
             * words_type :
             */
            @SerializedName("id")
            var id: String? = null

            @SerializedName("or")
            var or: String? = null

            @SerializedName("recommend_reason")
            var recommendReason: String? = null

            @SerializedName("word")
            var word: String? = null

            @SerializedName("words_type")
            var wordsType: String? = null

        }
    }
}