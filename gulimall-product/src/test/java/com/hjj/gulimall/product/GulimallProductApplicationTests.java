package com.hjj.gulimall.product;

import com.aliyun.oss.*;
import com.aliyun.oss.model.PutObjectRequest;
import com.aliyun.oss.model.PutObjectResult;
import com.hjj.gulimall.product.entity.BrandEntity;
import com.hjj.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {
    @Resource
    BrandService brandService;

    @Resource
    OSSClient ossClient;

    @Test
    public void contextLoads() {
        BrandEntity brand = new BrandEntity();
//        brand.setName("华为");
//        brandService.save(brand);
        brand.setBrandId(1L);
        brand.setDescript("华为");
        brandService.updateById(brand);
        System.out.println("success");
    }

    @Test
    public void demo2() {
        String filePath= "F:\\project\\谷粒商城\\Guli Mall(包含代码、课件、sql)\\Guli Mall\\文档\\开发阶段文档md\\images\\1587609877028.png";
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ossClient.putObject("gulimall-iota","exampledir/1587609877028.png",inputStream);
    }



}
