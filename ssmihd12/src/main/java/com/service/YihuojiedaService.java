package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihuojiedaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihuojiedaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihuojiedaView;


/**
 * 疑惑解答
 *
 * @author 
 * @email 
 * @date 2022-04-09 10:42:17
 */
public interface YihuojiedaService extends IService<YihuojiedaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihuojiedaVO> selectListVO(Wrapper<YihuojiedaEntity> wrapper);
   	
   	YihuojiedaVO selectVO(@Param("ew") Wrapper<YihuojiedaEntity> wrapper);
   	
   	List<YihuojiedaView> selectListView(Wrapper<YihuojiedaEntity> wrapper);
   	
   	YihuojiedaView selectView(@Param("ew") Wrapper<YihuojiedaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihuojiedaEntity> wrapper);
   	

}

