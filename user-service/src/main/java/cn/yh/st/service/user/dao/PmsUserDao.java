package cn.yh.st.service.user.dao;

import cn.yh.st.common.dao.MyBatisRepository;
import cn.yh.st.user.entity.Userinfo;

import com.github.abel533.mapper.Mapper;
@MyBatisRepository
public interface PmsUserDao extends Mapper<Userinfo> {
}
