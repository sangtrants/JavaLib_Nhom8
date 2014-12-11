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
 * QuyDinhPhat generated by hbm2java
 */
@Entity
@Table(name="QuyDinhPhat"
    ,schema="dbo"
    ,catalog="QuanLyThuVien"
)
public class QuyDinhPhat  implements java.io.Serializable {


     private int maQuyDinhPhat;
     private Serializable moTa;
     private Double soTien;
     private Set<Phat> phats = new HashSet<Phat>(0);

    public QuyDinhPhat() {
    }

	
    public QuyDinhPhat(int maQuyDinhPhat) {
        this.maQuyDinhPhat = maQuyDinhPhat;
    }
    public QuyDinhPhat(int maQuyDinhPhat, Serializable moTa, Double soTien, Set<Phat> phats) {
       this.maQuyDinhPhat = maQuyDinhPhat;
       this.moTa = moTa;
       this.soTien = soTien;
       this.phats = phats;
    }
   
     @Id 

    
    @Column(name="MaQuyDinhPhat", unique=true, nullable=false)
    public int getMaQuyDinhPhat() {
        return this.maQuyDinhPhat;
    }
    
    public void setMaQuyDinhPhat(int maQuyDinhPhat) {
        this.maQuyDinhPhat = maQuyDinhPhat;
    }

    
    @Column(name="MoTa")
    public Serializable getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(Serializable moTa) {
        this.moTa = moTa;
    }

    
    @Column(name="SoTien", precision=53, scale=0)
    public Double getSoTien() {
        return this.soTien;
    }
    
    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="quyDinhPhat")
    public Set<Phat> getPhats() {
        return this.phats;
    }
    
    public void setPhats(Set<Phat> phats) {
        this.phats = phats;
    }




}


