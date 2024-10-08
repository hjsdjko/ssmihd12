package com.entity.view;

import com.entity.LunwenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 论文信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 10:42:17
 */
@TableName("lunwenxinxi")
public class LunwenxinxiView  extends LunwenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LunwenxinxiView(){
	}
 
 	public LunwenxinxiView(LunwenxinxiEntity lunwenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, lunwenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
