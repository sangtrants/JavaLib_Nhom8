/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.Serializable;
import java.util.List;
import model.Sach;

/**
 *
 * @author van
 */
public interface SachService {
    void create(Sach s);

    Sach get(Serializable id);

    Sach load(Serializable id);

    List<Sach> getAll();

    void update(Sach s);

    void delete(Sach s);

    void deleteById(Serializable id);

    void deleteAll();

    long count();

    boolean exists(Serializable id);
}
