package com.heiyou.service.impl;

import com.heiyou.entity.CustomerWitness;
import com.heiyou.mapper.IntoBlackOilCustomerWitnessMapper;
import com.heiyou.service.IntoBlackOilCustomerWitnessService;
import com.heiyou.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
 * 客户见证业务逻辑层实现类
 *
 * @Author 冯根源
 * @create 2021/2/8 10:03
 */
@Service
public class IntoBlackOilCustomerWitnessServiceImpl implements IntoBlackOilCustomerWitnessService {

    @Autowired
    private IntoBlackOilCustomerWitnessMapper intoBlackOilCustomerWitnessMapper;
    @Value("${myserviceres.path}")
    String serviceResPath;
    @Value("${myservice.path}")
    String servicePath;
    /**
     * 查询所有的客户见证的信息
     *
     * @return
     */
    @Override
    public List<CustomerWitness> findAll() {
        return intoBlackOilCustomerWitnessMapper.selectAll();
    }

    /**
     * 保存服务文本文件
     *
     * @param image
     * @return
     */
    @Override
    public String saveCustomerWitnessImage(MultipartFile image) throws IOException {
        if (image == null) {
            throw new NullPointerException("文件为空");
        }
        //客户见证图片存放的文件夹
        String customerWitnessImagesDir = "intoBlackOil/CustomerWitness/article";
        //文件后缀名称
        String suffix = FileUtil.getSuffix(image);
        //封面的文件名
        String coverImageFile = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        //文件要存放在本机的绝对路径+文件名称
        File tempFile = new File(serviceResPath + "/" + customerWitnessImagesDir + "/" + coverImageFile + suffix);
        FileUtil.createDir(tempFile);
        image.transferTo(tempFile);

        return servicePath + customerWitnessImagesDir + "/" + coverImageFile + suffix;
    }

    /**
     * 添加客户见证信息
     *
     * @param customerWitness
     * @param coverImage
     * @return
     */
    @Override
    public boolean saveCustomerWitness(CustomerWitness customerWitness, MultipartFile coverImage) {
        //客户见证存放的文件夹
        String customerWitnessDir = "intoBlackOil/CustomerWitness";
        //当前客户见证的文件夹
        String currentDir = customerWitness.getCustomerWitness_Title();
        //封面的文件名
        String coverImageFile = "coverImage.jpg";
        //文件要存放在本机的绝对路径
        File tempFile = new File(serviceResPath + "/" + customerWitnessDir + "/" + currentDir + "/");
        try {
            //如果没有改文件夹就创建文件夹
            FileUtil.createDir(tempFile);

            coverImage.transferTo(new File(tempFile + "/" + coverImageFile));
            //保存到数据库中的地址
            String dataPath = "/" + customerWitnessDir + "/" + currentDir + "/" + coverImageFile;
            //如果时间为空，那么将现在的时间赋值为创建时间
            if (customerWitness.getCustomerWitness_CreateTime()==null){
                customerWitness.setCustomerWitness_CreateTime(new Timestamp(System.currentTimeMillis()));
            }
            customerWitness.setCustomerWitness_CoverUrl(dataPath);
            intoBlackOilCustomerWitnessMapper.insertCustomerWitness(customerWitness);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            FileUtil.deleteDir(tempFile);
            return false;
        }
    }

    /**
     * 删除客户见证信息
     *
     * @param customerWitness_id
     * @return
     */
    @Override
    public boolean deleteCustomerWitness(CustomerWitness customerWitness) {
        //客户见证存放的文件夹
        String customerWitnessDir = "intoBlackOil/CustomerWitness";
        //当前客户见证的文件夹
        String currentDir = customerWitness.getCustomerWitness_Title();
        //文件要存放在本机的绝对路径
        File tempFile = new File(serviceResPath + "/" + customerWitnessDir + "/" + currentDir + "/");
        try {
            intoBlackOilCustomerWitnessMapper.deleteCustomerWitness(customerWitness.getCustomerWitness_Id());
            FileUtil.deleteDir(tempFile);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 根据客户见证ID查询文章
     * @param customerWitness_id
     * @return
     */
    @Override
    public CustomerWitness findById(Integer customerWitness_id) {
       return intoBlackOilCustomerWitnessMapper.findById(customerWitness_id);
    }
}
