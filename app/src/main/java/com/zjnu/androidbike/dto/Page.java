package com.zjnu.androidbike.dto;

import com.google.gson.annotations.Expose;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by xueyi on 2015/12/27.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
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
    @NoArgsConstructor
    @AllArgsConstructor(suppressConstructorProperties = true)
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
