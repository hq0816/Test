package com.offcn.dao;

import com.offcn.model.Mobile;

public interface MobileDao {

	public Mobile getByNum(String mobileNumber);
}
