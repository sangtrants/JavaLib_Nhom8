package model;
// Generated 11-Dec-2014 21:24:01 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DanhMuc generated by hbm2java
 */
@Entity
@Table(name="DanhMuc"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class DanhMuc  implements java.io.Serializable {


     private int maDanhMuc;
     private Serializable tenDanhMuc;
     private Set<Sach> saches = new HashSet<Sach>(0);

    public DanhMuc() {
    }

	
    public DanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }
    public DanhMuc(int maDanhMuc, Serializable tenDanhMuc, Set<Sach> saches) {
       this.maDanhMuc = maDanhMuc;
       this.tenDanhMuc = tenDanhMuc;
       this.saches = saches;
    }
   
     @Id 

    
    @Column(name="MaDanhMuc", unique=true, nullable=false)
    public int getMaDanhMuc() {
        return this.maDanhMuc;
    }
    
    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    
    @Column(name="TenDanhMuc")
    public Serializable getTenDanhMuc() {
        return this.tenDanhMuc;
    }
    
    public void setTenDanhMuc(Serializable tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="danhMuc")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }




}

