package com.heiyou.controller;

import com.heiyou.entity.CustomerWitness;
import com.heiyou.entity.News;
import com.heiyou.service.IntoBlackOilCustomerWitnessService;
import com.heiyou.utils.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class IntoBlackOilCustomerWitness {
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
}
