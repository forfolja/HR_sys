package com.learning.hr_sys.pojo;

import lombok.*;

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
    }
}
