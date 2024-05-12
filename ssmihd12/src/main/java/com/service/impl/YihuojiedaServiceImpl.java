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


import com.dao.YihuojiedaDao;
import com.entity.YihuojiedaEntity;
import com.service.YihuojiedaService;
import com.entity.vo.YihuojiedaVO;
import com.entity.view.YihuojiedaView;

@Service("yihuojiedaService")
public class YihuojiedaServiceImpl extends ServiceImpl<YihuojiedaDao, YihuojiedaEntity> implements YihuojiedaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihuojiedaEntity> page = this.selectPage(
                new Query<YihuojiedaEntity>(params).getPage(),
                new EntityWrapper<YihuojiedaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihuojiedaEntity> wrapper) {
		  Page<YihuojiedaView> page =new Query<YihuojiedaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihuojiedaVO> selectListVO(Wrapper<YihuojiedaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihuojiedaVO selectVO(Wrapper<YihuojiedaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihuojiedaView> selectListView(Wrapper<YihuojiedaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihuojiedaView selectView(Wrapper<YihuojiedaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
