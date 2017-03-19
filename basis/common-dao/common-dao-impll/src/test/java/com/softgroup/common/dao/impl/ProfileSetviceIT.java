package com.softgroup.common.dao.impl;

import com.softgroup.common.dao.api.entities.ProfileEntity;
import com.softgroup.common.dao.impl.configuration.CommonDaoAppCfg;
import com.softgroup.common.dao.impl.service.ProfileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.*;

/**
 * Created by Виктор on 19.03.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonDaoAppCfg.class})
public class ProfileSetviceIT {

    @Autowired
    private ProfileService profileService;

    @Test
    public void testSaveProfile(){
        ProfileEntity profile = new ProfileEntity();
        profile.setId("testId");
        profile.setName("test");
        profile.setAvatarUri("testlink");
        profile.setCreateDateTime(System.currentTimeMillis());
        profile.setStatus("online");
        profile.setPhoneNumber("+3806311112233");
        profile.setUpdateDateTime(System.currentTimeMillis());

        profileService.save(profile);
        ProfileEntity profile2 = profileService.findOne("testId");

        assertEquals(profile, profile2);
    }
}
