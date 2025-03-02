package com.dao;

import com.entity.PeixunxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixunxiangmuView;

/**
 * 培训项目 Dao 接口
 *
 * @author 
 */
public interface PeixunxiangmuDao extends BaseMapper<PeixunxiangmuEntity> {

   List<PeixunxiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
