package mikasa.ackerman.ttd.host.common

/**
 * TTD
 *
 * <p>Title:请求数据时的状态 </p>
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
 * 2020/5/7 11:17 PM
 */
enum class State {
    /**
     * 未请求
     */
    INIT,
    /**
     * 请求中
     */
    LOADING,

    /**
     * 请求出错
     */
    ERROR,

    /**
     * 请求结果为空
     */
    EMPTY,

    /**
     * 请求结果由内容
     */
    CONTENT
}