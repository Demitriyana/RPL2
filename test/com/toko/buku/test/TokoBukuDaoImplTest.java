/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.buku.test;

import com.toko.buku.dao.TokoBukuDao;
import com.toko.buku.model.TokoBuku;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 *
 * @author OPERATOR
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TokoBukuDaoImplTest {
    @Autowired
    TokoBukuDao tokoBukuDao;
    
    TokoBuku tokoBuku = new TokoBuku();
    
    @Test
    public void testSave(){
        String kode = "kd008";
        
        tokoBuku.setKd_buku(kode);
        tokoBuku.setNama("TestName");
        tokoBuku.setHarga(90000);
        tokoBuku.setJenis("Romance");
        
        String res = tokoBukuDao.save(tokoBuku);
        assertTrue(res.equals(kode));
    }
}
