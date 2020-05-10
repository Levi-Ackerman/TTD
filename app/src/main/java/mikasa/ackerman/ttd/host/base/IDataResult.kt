package mikasa.ackerman.ttd.host.base

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
 * 2020/5/10 10:31 PM
 */
interface IDataResult<T> {

    fun resultType(): ResultType

    fun data():T

    enum class ResultType {
        EMPTY, CONTENT, ERROR
    }
}