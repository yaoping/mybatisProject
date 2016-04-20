package com.yaopingping.mybatis;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class UserMapperTest extends MapperTestBase {
    private UserMapper userMapper;

    @Before
    public void setup() {
        super.setup();
        userMapper = getSqlSession().getMapper(UserMapper.class);
    }

    @Test
    public void shouldInsetUserSuccess() {
        User user = new User();
        user.setId(1);
        user.setName("pingping yao");
        user.setWebsite("http://www.ppyao.com");
        user.setPhone("18875039949");
        userMapper.insertUser(user);

        assertThat(user.getName(), is(userMapper.selectUserById(1).getName()));

    }
}
