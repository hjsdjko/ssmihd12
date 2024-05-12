package com.dao;

import com.entity.YihuoliuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihuoliuyanVO;
import com.entity.view.YihuoliuyanView;


/**
 * 疑惑留言
 * 
 * @author 
 * @email 
 * @date 2022-04-09 10:42:17
 */
public interface YihuoliuyanDao extends BaseMapper<YihuoliuyanEntity> {
	
	List<YihuoliuyanVO> selectListVO(@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);
	
	YihuoliuyanVO selectVO(@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);
	
	List<YihuoliuyanView> selectListView(@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);

	List<YihuoliuyanView> selectListView(Pagination page,@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);
	
	YihuoliuyanView selectView(@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);
	

}
