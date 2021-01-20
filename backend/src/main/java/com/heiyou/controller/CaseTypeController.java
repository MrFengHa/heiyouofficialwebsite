package com.heiyou.controller;

import com.heiyou.entity.CaseType;
import com.heiyou.service.CaseTypeService;
import com.heiyou.utils.FileUtil;
import com.heiyou.utils.Message;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * 案例类型控制类
 *
 * @Author 冯根源
 * @create 2021/1/18 12:01
 */
@Slf4j
@RestController
@RequestMapping("casetype")
@CrossOrigin
public class CaseTypeController {
    @Autowired
    CaseTypeService caseTypeService;
    @Value("${myserviceres.path}")
    String serviceResPath;


    /**
     * 查询所有案例类型
     *
     * @return
     */
    @GetMapping("findAll")
    public Message findAll() {
        List<CaseType> caseTypesList = caseTypeService.findAll();
        log.debug(caseTypesList.toString()+"....................................................................");
        return Message.ok().data("caseTypesList", caseTypesList);
    }

    @PostMapping("addCaseType")
    public Message addCaseType(CaseType caseType, @RequestParam MultipartFile[] images) {
        File tempFile = new File(serviceResPath + "casetype/"+caseType.getEnName()+"/");

        try {

            caseTypeService.save(caseType);
            FileUtil.createDir(tempFile);
            System.out.println(tempFile.isDirectory());
            for (int i=0;i<images.length;i++) {
                images[i].transferTo(new File(tempFile+("/"+(i+1)+".jpg")));
            }
        }catch (Exception e){
            e.printStackTrace();
            FileUtil.deleteDir(tempFile);
        }

        return Message.ok();
    }

    @PostMapping("deleteCaseType")
    public Message deleteCaseType(@RequestBody CaseType caseType){

        File tempFile = new File(serviceResPath + "casetype/"+caseType.getEnName()+"/");

        try {
            caseTypeService.deleteCaseType(caseType.getId());
            FileUtil.deleteDir(tempFile);

        }catch (Exception e){
            e.printStackTrace();
            return Message.error();
        }

        return Message.ok();
    }
}
