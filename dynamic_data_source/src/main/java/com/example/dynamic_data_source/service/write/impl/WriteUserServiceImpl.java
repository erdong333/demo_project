package com.example.dynamic_data_source.service.write.impl;

import com.example.dynamic_data_source.dao.write.WriteUserMapper;
import com.example.dynamic_data_source.entity.write.WriteUser;
import com.example.dynamic_data_source.service.write.WriteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Chen
 * @Date 2022/4/8
 * @Time 09:49
 * @Description
 */

@Service
@Transactional
public class WriteUserServiceImpl implements WriteUserService {

    @Autowired
    private WriteUserMapper writeUserMapper;

    /**
     * 查询用户列表
     * @return
     */
    @Override
    public List<WriteUser> queryWriteUserList(WriteUser writeUser) {
        return writeUserMapper.queryWriteUserList(writeUser);
    }

    /**
     * 新增用户
     * @param writeUser
     * @return
     */
    @Override
    public int addWriteUser(WriteUser writeUser) {
        return writeUserMapper.addWriteUser(writeUser);
    }
}
