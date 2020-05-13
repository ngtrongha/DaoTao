package vn.edu.tbd.daotao.data;

public class StudentData {
    public String MSV, Ten_SV, Nganh_SV, NamSinh_SV, UserName, Password, Email;
    public int Image;
    public StudentData() {
    }

    public StudentData(String mSV,String ten_SV,String nganh_SV,String namSinh_SV,String password,String email, int image) {
        this.MSV = mSV;
        this.Ten_SV = ten_SV;
        this.Nganh_SV = nganh_SV;
        this.NamSinh_SV = namSinh_SV;
        this.Password = password;
        this.Email = email;
        this.Image = image;
    }
    public StudentData(String mSV,String ten_SV,String nganh_SV,String namSinh_SV,String password,String email) {
        this.MSV = mSV;
        this.Ten_SV = ten_SV;
        this.Nganh_SV = nganh_SV;
        this.NamSinh_SV = namSinh_SV;
        this.Password = password;
        this.Email = email;
    }
}
