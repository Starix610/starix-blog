package com.starix.blog;

import com.starix.blog.entity.Type;
import com.starix.blog.service.TypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Starix
 * @date 2020-05-18 14:55
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TypeServieTests {

    @Autowired
    private TypeService typeService;

    @Test
    public void testSaveType(){
        typeService.saveType(new Type(null, "测试添加"));
    }

    @Test
    public void testGetType(){
        System.out.println(typeService.getType(1));
    }

    @Test
    public void testListType(){
        System.out.println(typeService.listType(1, 7));
    }

}
