package com.learning.hr_sys.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Organization implements Serializable {

    private Integer organizationID;
    private String organizationName;
    private String parentID;
    private enum organizationStatus{ACTIVE,INACTIVE};

    private List<Organization> children = new ArrayList<>();
    public void setChildren(List<Organization> children) {
        this.children = children;
    }
    public Integer getorganizationID() {
        return organizationID;
    }
    public void organizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }
}
