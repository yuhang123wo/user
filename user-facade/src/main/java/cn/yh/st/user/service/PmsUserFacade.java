/**
 * 
 */
package cn.yh.st.user.service;

import cn.yh.st.user.entity.Userinfo;

public interface PmsUserFacade {
	Userinfo findUser(long userId);
	
	void insert(Userinfo u);

}
