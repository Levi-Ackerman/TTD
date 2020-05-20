package mikasa.ackerman.ttd.host.di

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import mikasa.ackerman.ttd.host.video.feed.pojo.MiddleImage

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
 * 2020/5/20 12:58 PM
 */
@BindingAdapter("image")
fun loadImage(imgView: ImageView, img: MiddleImage?) {
    img?.let {
        Picasso.with(imgView.context).load(img.url).resize(img.width, img.height).into(imgView)
    }
}