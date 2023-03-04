package com.learning.hr_sys.pojo;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Organization implements Serializable {
    private Integer organizationID;
    private String organizationName;
    private Integer parentID;
    private int organizationStatus;
    @Override
    public String toString()
    {
        return "Organization{"+
                "id=" + organizationID +
                ", name='" + organizationName + '\'' +
                ", parentOrganization='" + parentID + '\'' +
                ", birthday=" + birthday +
                ", status=" + organizationStatus +
                '}';
    }
    private List<Organization> children = new ArrayList<>();

}
