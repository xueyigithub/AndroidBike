package com.zjnu.androidbike.dto;

import java.util.List;

import lombok.Data;

/**
 * Created by xueyi on 2015/12/27.
 */
@Data
public class Page<T> {

    private Boolean last;
    private Integer totalPages;
    private Integer totalElements;
    private Integer number;
    private Integer size;
    private Boolean first;
    private Integer numberOfElements;
    private List<T> content;
    private List<Sort> sort;

    @Data
    public class Sort {
        private String direction;
        private String property;
        private Boolean ignoreCase;
        private String nullHandling;
        private Boolean ascending;
    }
}
