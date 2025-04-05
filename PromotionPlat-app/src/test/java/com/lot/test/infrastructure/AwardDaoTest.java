package com.lot.test.infrastructure;

import com.alibaba.fastjson.JSON;
import com.lot.infrastructure.persistent.dao.IAwardDao;
import com.lot.infrastructure.persistent.po.Award;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AwardDaoTest {
    @Autowired
    private IAwardDao awardDao;

    @Test
    public void queryAwardListTest(){
        List<Award> awardList = awardDao.queryAwardList();
        log.info("测试结果：{} " + JSON.toJSONString(awardList));
    }

}
