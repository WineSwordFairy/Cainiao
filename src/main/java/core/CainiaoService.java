package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CainiaoService {

    @Autowired
    private CainiaoDao cainiaoDao;

    public Integer send(Mail mail) {
        return cainiaoDao.send(mail);
    }

    public String receive(Mail mail) {
        return "";
    }

    public String query(int i) {
        return cainiaoDao.query(1).target;
    }
}
