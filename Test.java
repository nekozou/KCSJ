package db.dao;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        AceDAOImpl acedao = new AceDAOImpl();   //对象
        Academic_exchange ace = new Academic_exchange();

        //插入一条记录
//        ace.setAce_no("ace001");
//        ace.setGra_id("gra002");
//        ace.setAce_name("通信领域座谈会");
//        ace.setAce_place("北京市海淀区");
//        ace.setAce_date("2022-12-04");
//        ace.setAce_CHname("基于深度学习的信号识别技术报告");
//        ace.setAce_ENname("Technical Report on Signal Recognition Based on Deep Learning");
//        InputStream input = new FileInputStream("D:\\1.png"); //这里可以添加本地数据
//        ace.setAce_pic(input.readAllBytes());
//        ace.setAce_note("无");
//        acedao.addAce(ace);
        //更新  略

        //将查询的图片保存在本地显示
        String ace_no = "ace001";
        ace = acedao.getAce(ace_no);
        System.out.println(ace.toString());
        byte[] pic = ace.getAce_pic();
        ByteArrayInputStream bais = new ByteArrayInputStream(pic);    //用来存储byte[]字节数组中的数据
        try {
            BufferedImage bi1 = ImageIO.read(bais);    //将图片加载到内存中，并可得到图片的详细信息
            File w2 = new File("D:\\ace.jpg");        //得到的·图片需要指定一个存储位置
            if (!w2.exists()) {//如果文件夹不存在
                w2.mkdir();//创建文件夹
            }
            ImageIO.write(bi1, "jpg", w2);//把得到的图片转为JPG格式，并写入到w2这个位置上
        } finally {
        }
    }
}