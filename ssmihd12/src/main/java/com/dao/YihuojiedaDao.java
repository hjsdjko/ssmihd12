package com.dao;

import com.entity.YihuojiedaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihuojiedaVO;
import com.entity.view.YihuojiedaView;


/**
 * 疑惑解答
 * 
 * @author 
 * @email 
 * @date 2022-04-09 10:42:17
 */
public interface YihuojiedaDao extends BaseMapper<YihuojiedaEntity> {
	
	List<YihuojiedaVO> selectListVO(@Param("ew") Wrapper<YihuojiedaEntity> wrapper);
	
	YihuojiedaVO selectVO(@Param("ew") Wrapper<YihuojiedaEntity> wrapper);
	
	List<YihuojiedaView> selectListView(@Param("ew") Wrapper<YihuojiedaEntity> wrapper);

	List<YihuojiedaView> selectListView(Pagination page,@Param("ew") Wrapper<YihuojiedaEntity> wrapper);
	
	YihuojiedaView selectView(@Param("ew") Wrapper<YihuojiedaEntity> wrapper);
	

}
