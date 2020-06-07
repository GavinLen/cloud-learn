package xyz.ieden.cloud.base.common.result;

/**
 * ResultSetUtils
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/19 22:40
 */
public class ResultSetUtils {

    public static <T> ResultSet<T> getResult(T data) {
        ResultSet<T> resultSet = new ResultSet<>(0, "success");
        resultSet.setData(data);
        return resultSet;

    }

    public static <T> ResultSet<T> getResult(Integer code, String msg) {
        ResultSet<T> resultSet = new ResultSet<>(code, msg);
        return resultSet;
    }
}
