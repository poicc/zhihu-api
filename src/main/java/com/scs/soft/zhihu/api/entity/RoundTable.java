package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author CRQ
 */
@Data
@Builder
public class RoundTable implements Serializable {
    private String roundTableId;
    private String name;
    private String banner;
    private String tinyBanner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;


}
