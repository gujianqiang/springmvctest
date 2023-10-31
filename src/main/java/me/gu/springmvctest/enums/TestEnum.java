package me.gu.springmvctest.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import lombok.Getter;

@Getter
public enum TestEnum implements IEnum<Integer> {
    ONE(1, "一"),
    TWO(2, "二");

    private final int code;
    private final String val;

    TestEnum(int code, String val) {
        this.code = code;
        this.val = val;
    }

    @Override
    public Integer getValue() {
        return code;
    }
}
