package com.kingfly.service;

import com.kingfly.domain.Shseat;

public interface IShseatService {
	public Shseat getShseatByShSeatNo(String shSeatNo);
	public void addShseat(String shSeatNo,String desc);
}
