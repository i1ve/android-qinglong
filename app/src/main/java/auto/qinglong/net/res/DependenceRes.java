package auto.qinglong.net.res;

import java.util.List;

import auto.qinglong.module.dependence.Dependence;

public class DependenceRes {
    private int code;
    private String message;
    private List<Dependence> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Dependence> getData() {
        return data;
    }

    public void setData(List<Dependence> data) {
        this.data = data;
    }
}