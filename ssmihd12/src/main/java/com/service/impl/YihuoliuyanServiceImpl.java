package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YihuoliuyanDao;
import com.entity.YihuoliuyanEntity;
import com.service.YihuoliuyanService;
import com.entity.vo.YihuoliuyanVO;
import com.entity.view.YihuoliuyanView;

@Service("yihuoliuyanService")
public class YihuoliuyanServiceImpl extends ServiceImpl<YihuoliuyanDao, YihuoliuyanEntity> implements YihuoliuyanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihuoliuyanEntity> page = this.selectPage(
                new Query<YihuoliuyanEntity>(params).getPage(),
                new EntityWrapper<YihuoliuyanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihuoliuyanEntity> wrapper) {
		  Page<YihuoliuyanView> page =new Query<YihuoliuyanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihuoliuyanVO> selectListVO(Wrapper<YihuoliuyanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihuoliuyanVO selectVO(Wrapper<YihuoliuyanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihuoliuyanView> selectListView(Wrapper<YihuoliuyanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihuoliuyanView selectView(Wrapper<YihuoliuyanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
