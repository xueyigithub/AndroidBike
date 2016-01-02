package com.zjnu.androidbike.dao;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by xueyi on 2016/1/2.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
@EqualsAndHashCode(callSuper = false)
@Table(name = "DbModel")
public class DbModel extends Model implements Serializable {

    private static final String TAG = "DbModel";

    @Expose
    @Column(name = "obj", indexGroups = {"group1"}, uniqueGroups = {"group2"}, onUniqueConflicts = {Column.ConflictAction.REPLACE})
    private String obj;

    @Expose
    @Column(name = "key", indexGroups = {"group1"}, uniqueGroups = {"group2"}, onUniqueConflicts = {Column.ConflictAction.REPLACE})
    private String key;

    @Expose
    @Column(name = "value")
    private String value;

}
