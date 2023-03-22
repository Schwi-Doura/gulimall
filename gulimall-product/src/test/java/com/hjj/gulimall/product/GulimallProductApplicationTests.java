package com.hjj.gulimall.product;

import com.hjj.gulimall.product.entity.BrandEntity;
import com.hjj.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brand = new BrandEntity();
//        brand.setName("华为");
//        brandService.save(brand);
        brand.setBrandId(1L);
        brand.setDescript("华为");
        brandService.updateById(brand);
        System.out.println("success");
    }

}
