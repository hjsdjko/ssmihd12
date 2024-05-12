package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihuoliuyanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihuoliuyanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihuoliuyanView;


/**
 * 疑惑留言
 *
 * @author 
 * @email 
 * @date 2022-04-09 10:42:17
 */
public interface YihuoliuyanService extends IService<YihuoliuyanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihuoliuyanVO> selectListVO(Wrapper<YihuoliuyanEntity> wrapper);
   	
   	YihuoliuyanVO selectVO(@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);
   	
   	List<YihuoliuyanView> selectListView(Wrapper<YihuoliuyanEntity> wrapper);
   	
   	YihuoliuyanView selectView(@Param("ew") Wrapper<YihuoliuyanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihuoliuyanEntity> wrapper);
   	

}

