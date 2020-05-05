package com.zxf.entity;

import java.io.Serializable;

public class Model implements Serializable {
    private String mainId;
    private String name;

    public Model() {
    }

    public Model(String mainId, String name) {
        this.mainId = mainId;
        this.name = name;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model{" +
                "mainId='" + mainId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
