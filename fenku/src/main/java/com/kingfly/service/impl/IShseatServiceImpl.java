package com.kingfly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kingfly.IDao.ShseatMapper;
import com.kingfly.domain.Shseat;
import com.kingfly.service.IShseatService;

@Service("shseatService")
public class IShseatServiceImpl implements IShseatService {
	@Autowired
	private ShseatMapper shSeatMapper;
	public Shseat getShseatByShSeatNo(String shSeatNo) {
		// TODO Auto-generated method stub
		return shSeatMapper.selectByPrimaryKey(shSeatNo);
	}
	public void addShseat(String shSeatNo, String desc) {
		// TODO Auto-generated method stub
		Shseat ss=new Shseat();
		ss.setShSeatNo(shSeatNo);
		ss.setSeatDescription(desc);
		shSeatMapper.insert(ss);
	}

}
