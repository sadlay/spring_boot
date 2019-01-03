package com.lay.mvc.enumeration;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 0:34 2018/11/11
 * @Modified By:IntelliJ IDEA
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SexEnum {

    MALE(1, "男"), FEMALE(2, "女");

    private int id;

    private String name;

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getEnumById(int id) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getId() == id) {
                return sex;
            }
        }
        return null;
    }

    public static SexEnum getEnumByName(String name) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getName().equals(name)) {
                return sex;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}