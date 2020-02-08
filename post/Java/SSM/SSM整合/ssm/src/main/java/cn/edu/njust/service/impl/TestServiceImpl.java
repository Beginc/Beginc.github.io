package cn.edu.njust.service.impl;

import cn.edu.njust.dao.TestDao;
import cn.edu.njust.pojo.TestAccount;
import cn.edu.njust.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource(name = "testDao")
    private TestDao testDao;

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public List<TestAccount> findAll() {
        return testDao.findAll();
    }
}
