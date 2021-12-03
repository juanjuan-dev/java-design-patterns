package org.tweeted.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guan.yuhui
 * @Date 2021/12/3
 */

public enum PayType {
    ALIPAY_PAGE(0,"alipay_page","");


    private Integer value;
    private String key;
    private String desc;

    PayType(Integer value, String key, String desc) {
        this.value = value;
        this.key = key;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }

    public static List<PayType> keyContainOf(String key) {
        List<PayType> types = new ArrayList<>();
        for (PayType type : PayType.values()) {
            if (type.getKey().equals(key) || type.getKey().indexOf(key + "_") != -1) {
                types.add(type);
            }
        }
        return types;
    }

}
