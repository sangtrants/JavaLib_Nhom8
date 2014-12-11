/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.impl;

import dao.impl.HbnSachDao;
import java.io.Serializable;
import java.util.List;
import javax.transaction.Transactional;
import model.Sach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.SachService;

/**
 *
 * @author van
 */
@Service("sachService")
@Transactional
public class SachServiceImpl implements SachService{

    @Autowired
    private HbnSachDao sachDAO;
    @Override
    public void create(Sach s) {
        sachDAO.create(s);
    }

    @Override
    public Sach get(Serializable id) {
        return sachDAO.get(id);
    }

    @Override
    public Sach load(Serializable id) {
        return sachDAO.load(id);
    }

    @Override
    public List<Sach> getAll() {
        return sachDAO.getAll();
    }

    @Override
    public void update(Sach s) {
        sachDAO.update(s);
    }

    @Override
    public void delete(Sach s) {
        sachDAO.delete(s);
    }

    @Override
    public void deleteById(Serializable id) {
        sachDAO.deleteById(id);
    }

    @Override
    public void deleteAll() {
        sachDAO.deleteAll();
    }

    @Override
    public long count() {
        return sachDAO.count();
    }

    @Override
    public boolean exists(Serializable id) {
        return sachDAO.exists(id);
    }
    
}
