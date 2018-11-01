package com.feifei.animal.controller;




import com.feifei.animal.Enum.Sex;


import com.feifei.animal.dao.PersonDao;
import com.feifei.animal.entity.person.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import sun.misc.BASE64Encoder;


import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author jet
 * @version 1.0.0
 */
@Controller
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private static Map<String,String> map;
    private String savePath="F:\\feifei\\src\\main\\resources\\static\\image\\";

    @Autowired
    PersonDao personDao;

    static{
        map = new HashMap<String,String>();
    }

    @RequestMapping("/freemarker")
    public String freemarker(Map<String,Object>map){
        LOGGER.info("返回到主页面");
        return "freemarker";
    }

    /**
     * 跳转到注册页面
     * @return
     */
    @RequestMapping("/reg")
    public String Reg(){
            LOGGER.info("注册页面");
            return "reg";
    }

    @RequestMapping("/login")
    public String Login(HttpServletRequest request){
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        //Person person = IPersonService.getByAccount(name);
       // System.out.println("password: "+ person.getPassword());
        //List<Person> list = personDao.SelectAll();

        LOGGER.info("登录页面");
        return "login";
    }

    /**
     * 将头像缓存在内存中返回给页面
     * @param request
     * @return
     */
    @RequestMapping("/upload")
    @ResponseBody
    public Map<String, String> upload(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest MultipartRequest = (MultipartHttpServletRequest)request;
        Iterator<String> fileNames = MultipartRequest.getFileNames();
        String fileName = fileNames.next();
        //LOGGER.info("filename: " + fileName);
        MultipartFile file = MultipartRequest.getFile(fileName);
        fileName = file.getOriginalFilename();
        LOGGER.info("filename: " + fileName);
        String suffixName = fileName.substring(fileName.lastIndexOf("."));//获得文件后缀
        String imgurl = "";
        fileName = request.getParameter("name ");
        savePath +=   fileName + suffixName;//保存路径
        LOGGER.info("fillPath: " + savePath);
        File saveFile = new File(savePath);
        //转化为BASE64图片格式给前端页面
        try{
            InputStream is = file.getInputStream();
            byte[] buffer = new byte[(int) file.getSize()];
            int offset = 0;
            int numRead = 0;
            while(offset < buffer.length && (numRead = is.read(buffer,offset,buffer.length - offset)) >= 0){
                offset += numRead;
            }
            if(offset != buffer.length){
                LOGGER.error("Could not completely read file");
            }
            is.close();
            BASE64Encoder encoder = new BASE64Encoder();
            imgurl = encoder.encode(buffer);
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("url","data:image/jpeg;base64,"+imgurl);
        file.transferTo(saveFile);
        return map;
    }

    @RequestMapping("/reg/save")
    public String regSave(@RequestParam("name")String name, @RequestParam("password") String password, @RequestParam("realName") String realName, @RequestParam("type") String type, @RequestParam("sex")Sex sex,@RequestParam("address")String address,@RequestParam("phone") String phone,@RequestParam("mail")String mail){
        Person person = new Person();
        person.setId(null);
        person.setName(name);
        person.setPassword(password);
        person.setRealName(realName);
        if(type.equals("个人")){
            person.setPriority(0);
        }else{
            person.setPriority(1);
        }
        person.setSex(sex);
        person.setAddress(address);
        person.setPhone(phone);
        person.setMail(mail);
        person.setPhoto(savePath);
        //personMapper.insert(person);
        return "login";
    }
}
