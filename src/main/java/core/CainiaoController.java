package core;

import core.mapper.CainiaoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.activation.MailcapCommandMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cainiao")
public class CainiaoController {

    private Byte[] bytes = new Byte[20];

    Object lick = new Object();
    @Autowired
    public CainiaoService cainiaoService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello-cainiao物流";
    }


    public static void main(String[] args) {
        List<CainiaoController> list = new ArrayList<>();
        try {
            while (true) {
                list.add(new CainiaoController());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/send")
    @ResponseBody
    public String send() {
        Mail mail = new Mail();
        mail.name = "李大爷";
        mail.target = "北京";
        mail.phone = "13567678766";
        mail.type = 4;
        Integer result = cainiaoService.send(mail);
        return ";";
    }

    //@RequestMapping("/receive")
    //@ResponseBody
    //public String receive() {
    //    Mail m = new Mail();
    //    return "cainiaoService.receive(m);";
    //}
    //
    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        return cainiaoService.query(1);
    }
}
