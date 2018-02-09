/**
 * 
 */
package cn.yh.st.service.facade.user.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.yh.st.service.user.dao.PmsUserDao;
import cn.yh.st.user.entity.Userinfo;
import cn.yh.st.user.service.PmsUserFacade;

@Service("pmsUserFacade")
public class PmsUserFacadeImpl implements PmsUserFacade {

	@Resource
	private PmsUserDao pmsUserDao;

	@Override
	public Userinfo findUser(long userId) {
		return pmsUserDao.selectByPrimaryKey(userId);
	}

	@Override
	public void insert(Userinfo u) {
		pmsUserDao.insert(u);
		int i=1/0;
	}
}
