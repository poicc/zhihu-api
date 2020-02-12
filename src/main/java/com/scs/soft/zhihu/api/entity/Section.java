package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author CRQ
 */
@Data
@Builder
public class Section implements Serializable {
    private String sectionId;
    private String specialId;
    private String sectionTitle;

}
