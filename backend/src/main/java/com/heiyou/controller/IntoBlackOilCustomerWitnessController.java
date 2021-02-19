package com.heiyou.controller;

import com.heiyou.entity.CustomerWitness;
import com.heiyou.service.IntoBlackOilCustomerWitnessService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 客户见证
 *
 * @Author 冯根源
 * @create 2021/2/8 9:45
 */
@Slf4j
@RestController
@RequestMapping("intoBlackOilCustomerWitness")
@CrossOrigin
@Api(tags = "走进黑油——客户见证接口")
public class IntoBlackOilCustomerWitnessController {
    @Autowired
    private IntoBlackOilCustomerWitnessService intoBlackOilCustomerWitnessService;

    @ApiOperation("获取所有的客户见证")
    @GetMapping("getAllCustomerWitness")
    public Message getAllCustomerWitness() {
        try {
          List<CustomerWitness> customerWitnesses = intoBlackOilCustomerWitnessService.findAll();
            return Message.ok().data("customerWitnesses", customerWitnesses);
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error();
        }
    }

    @ApiOperation("添加客户见证富文本图片")
    @PostMapping("saveCustomerWitnessImage")
    public Message saveCustomerWitnessImage(MultipartFile file) {
        if (file == null) {
            return Message.error().message("传递的文件为空");
        }
        try {
            String path = intoBlackOilCustomerWitnessService.saveCustomerWitnessImage(file);
            //要传递的值的KEY
            String pathKey = "path";
            return Message.ok().data(pathKey, path);
        } catch (Exception e) {
            e.printStackTrace();
            return Message.error().message(e.getMessage());
        }
    }

    @ApiOperation("添加客户见证信息")
    @PostMapping("saveCustomerWitness")
    public Message saveCustomerWitness(CustomerWitness customerWitness, @RequestParam("coverImage") MultipartFile coverImage) {
        if (intoBlackOilCustomerWitnessService.saveCustomerWitness(customerWitness, coverImage)) {
            return Message.ok();
        } else {
            return Message.error();
        }
    }

    @ApiOperation("删除客户见证信息")
    @PostMapping("deleteCustomerWitness")
    public Message deleteCustomerWitness(@RequestBody CustomerWitness customerWitness) {
        if (customerWitness==null){
            throw new RuntimeException("删除客户见证信息是没有传入客户信息");
        }
        if (intoBlackOilCustomerWitnessService.deleteCustomerWitness(customerWitness)) {
            return Message.ok();
        } else {
            return Message.error();
        }

    }
    @ApiOperation("根据ID查询客户见证文章信息")
    @GetMapping("findArticleById")
    public Message findArticleById(Integer customerWitness_Id){
        if (customerWitness_Id==null){
            throw new RuntimeException("没有传入文章ID");
        }
        CustomerWitness customerWitness = intoBlackOilCustomerWitnessService.findById(customerWitness_Id);
        return Message.ok().data("customerWitness",customerWitness);
    }


}
