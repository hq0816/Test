package com.offcn.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.MobileDao;
import com.offcn.model.Mobile;
@Service
@WebService
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileDao mobileDao;

	@Override
	public Mobile getByNum(String mobileNumber) {
		// TODO Auto-generated method stub
		if(mobileNumber!=null&&mobileNumber.length()>=7){
			mobileNumber = mobileNumber.substring(0, 7);
			return mobileDao.getByNum(mobileNumber);
		}
		
		return null;
	}

}
