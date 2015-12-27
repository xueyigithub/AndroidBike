package com.zjnu.androidbike.dto;

import com.google.gson.annotations.Expose;

import java.util.List;

import lombok.Builder;
import lombok.Data;

/**
 * Created by xueyi on 2015/12/27.
 */
@Data
@Builder
public class Page<T> {

    @Expose
    private Boolean last;
    @Expose
    private Integer totalPages;
    @Expose
    private Integer totalElements;
    @Expose
    private Integer number;
    @Expose
    private Integer size;
    @Expose
    private Boolean first;
    @Expose
    private Integer numberOfElements;
    @Expose
    private List<T> content;
    @Expose
    private List<Sort> sort;

    @Data
    @Builder
    public static class Sort {
        @Expose
        private String direction;
        @Expose
        private String property;
        @Expose
        private Boolean ignoreCase;
        @Expose
        private String nullHandling;
        @Expose
        private Boolean ascending;
    }
}
