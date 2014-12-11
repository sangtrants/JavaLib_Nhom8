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
 * NhaXuatBan generated by hbm2java
 */
@Entity
@Table(name="NhaXuatBan"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class NhaXuatBan  implements java.io.Serializable {


     private int maNhaXuatBan;
     private Serializable tenNhaXuatBan;
     private Serializable diaChi;
     private Serializable soTaiKhoan;
     private Serializable soDienThoai;
     private Serializable email;
     private Serializable website;
     private Set<Sach> saches = new HashSet<Sach>(0);
     private Set<ChiTietDonHang> chiTietDonHangs = new HashSet<ChiTietDonHang>(0);

    public NhaXuatBan() {
    }

	
    public NhaXuatBan(int maNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
    }
    public NhaXuatBan(int maNhaXuatBan, Serializable tenNhaXuatBan, Serializable diaChi, Serializable soTaiKhoan, Serializable soDienThoai, Serializable email, Serializable website, Set<Sach> saches, Set<ChiTietDonHang> chiTietDonHangs) {
       this.maNhaXuatBan = maNhaXuatBan;
       this.tenNhaXuatBan = tenNhaXuatBan;
       this.diaChi = diaChi;
       this.soTaiKhoan = soTaiKhoan;
       this.soDienThoai = soDienThoai;
       this.email = email;
       this.website = website;
       this.saches = saches;
       this.chiTietDonHangs = chiTietDonHangs;
    }
   
     @Id 

    
    @Column(name="MaNhaXuatBan", unique=true, nullable=false)
    public int getMaNhaXuatBan() {
        return this.maNhaXuatBan;
    }
    
    public void setMaNhaXuatBan(int maNhaXuatBan) {
        this.maNhaXuatBan = maNhaXuatBan;
    }

    
    @Column(name="TenNhaXuatBan")
    public Serializable getTenNhaXuatBan() {
        return this.tenNhaXuatBan;
    }
    
    public void setTenNhaXuatBan(Serializable tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    
    @Column(name="DiaChi")
    public Serializable getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(Serializable diaChi) {
        this.diaChi = diaChi;
    }

    
    @Column(name="SoTaiKhoan")
    public Serializable getSoTaiKhoan() {
        return this.soTaiKhoan;
    }
    
    public void setSoTaiKhoan(Serializable soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    
    @Column(name="SoDienThoai")
    public Serializable getSoDienThoai() {
        return this.soDienThoai;
    }
    
    public void setSoDienThoai(Serializable soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    
    @Column(name="Email")
    public Serializable getEmail() {
        return this.email;
    }
    
    public void setEmail(Serializable email) {
        this.email = email;
    }

    
    @Column(name="Website")
    public Serializable getWebsite() {
        return this.website;
    }
    
    public void setWebsite(Serializable website) {
        this.website = website;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhaXuatBan")
    public Set<Sach> getSaches() {
        return this.saches;
    }
    
    public void setSaches(Set<Sach> saches) {
        this.saches = saches;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="nhaXuatBan")
    public Set<ChiTietDonHang> getChiTietDonHangs() {
        return this.chiTietDonHangs;
    }
    
    public void setChiTietDonHangs(Set<ChiTietDonHang> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }




}


