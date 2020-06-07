package xyz.ieden.cloud.base.common.result;

/**
 * ResultSet
 *
 * @author gavin
 * @version 1.0
 * @datetime 2020/5/19 22:09
 */
public class ResultSet <T>{


    private Integer code;
    private String msg;
    private T data;

    public ResultSet() {
    }

    public ResultSet(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
