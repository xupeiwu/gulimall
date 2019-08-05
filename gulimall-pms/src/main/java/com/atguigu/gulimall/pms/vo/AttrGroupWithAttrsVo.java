package com.atguigu.gulimall.pms.vo;

import com.atguigu.gulimall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.gulimall.pms.entity.AttrEntity;
import com.atguigu.gulimall.pms.entity.AttrGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * @author xupeiwu
 * @create 2019-08-04 12:08
 */
@Data
public class AttrGroupWithAttrsVo extends AttrGroupEntity {
     private List<AttrEntity> attrEntities;
     private List<AttrAttrgroupRelationEntity> relations;
}
