package com.xuecheng.content.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 课程分类
 * </p>
 *
 * @author ragnarok
 * @since 2023-06-29 09:54:21
 */
@Getter
@Setter
@TableName("course_category")
public class CourseCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
      private String id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类标签默认和名称一样
     */
    private String label;

    /**
     * 父结点id（第一级的父节点是0，自关联字段id）
     */
    private String parentid;

    /**
     * 是否显示
     */
    private Byte isShow;

    /**
     * 排序字段
     */
    private Integer orderby;

    /**
     * 是否叶子
     */
    private Byte isLeaf;
}