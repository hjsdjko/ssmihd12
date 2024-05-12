package com.dao;

import com.entity.DabianmingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DabianmingdanVO;
import com.entity.view.DabianmingdanView;


/**
 * 答辩名单
 * 
 * @author 
 * @email 
 * @date 2022-04-09 10:42:17
 */
public interface DabianmingdanDao extends BaseMapper<DabianmingdanEntity> {
	
	List<DabianmingdanVO> selectListVO(@Param("ew") Wrapper<DabianmingdanEntity> wrapper);
	
	DabianmingdanVO selectVO(@Param("ew") Wrapper<DabianmingdanEntity> wrapper);
	
	List<DabianmingdanView> selectListView(@Param("ew") Wrapper<DabianmingdanEntity> wrapper);

	List<DabianmingdanView> selectListView(Pagination page,@Param("ew") Wrapper<DabianmingdanEntity> wrapper);
	
	DabianmingdanView selectView(@Param("ew") Wrapper<DabianmingdanEntity> wrapper);
	

}
