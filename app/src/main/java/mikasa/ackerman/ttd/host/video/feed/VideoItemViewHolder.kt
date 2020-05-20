package mikasa.ackerman.ttd.host.video.feed

import android.util.Base64
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import mikasa.ackerman.ttd.host.databinding.ItemFeedVideoBinding
import mikasa.ackerman.ttd.host.di.toast
import mikasa.ackerman.ttd.host.video.feed.pojo.FeedVideoItem
import org.json.JSONObject
import org.koin.core.KoinComponent
import org.koin.core.inject

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
 * 2020/5/16 10:50 PM
 */
class VideoItemViewHolder(val binding: ItemFeedVideoBinding) : RecyclerView.ViewHolder(binding.root) , KoinComponent{
    private val mGson:Gson by inject()

    fun bindData(feedVideoItem: FeedVideoItem) {
        binding.feedVideoItem = feedVideoItem
        binding.presenter = this
    }

    fun play(item :FeedVideoItem) {
        itemView.context.toast("点击播放")
        try {
            val url = JSONObject(item.video_play_info).getJSONObject("video_list").getJSONObject("video_1").getString("main_url")
            binding.player.setVideoPath(String(Base64.decode(url, Base64.NO_WRAP)))
            binding.player.start()
        }catch (e :Exception){
            e.printStackTrace()
        }
    }

}