/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2.Proccess;

import Bai2.Database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class LopHoc {
    public Connect cn= new Connect();
    //Truy van tat ca du lieu trong Table LoaiSP
    public ResultSet ShowLoaiSP() throws SQLException{
        cn.connectSQL();
        String sql = "SELECT * FROM LopHoc";
        return cn.LoadData(sql);
    }
    //Truy van cac dong du lieu trong Table LoaiSP theo Maloai
    public ResultSet ShowLoaiSP(String ml) throws SQLException{
        String sql = "SELECT * FROM LopHoc where msLop='" + ml +"'";
        return cn.LoadData(sql);
    }
    //Theo moi 1 dong du lieu vao table LoaiSP
    public void InsertData(String ml, String tl) throws SQLException{
        String sql = "INSERT INTO LopHoc values('" + ml +"',N'" + tl +"')";
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table LoaiSP
    public void EditData(String ml, String tl) throws SQLException{
        String sql = "Update LopHoc set tenLop=N'" + tl +
        "' where Maloai='" + ml +"'";
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table LoaiSP
    public void DeleteData(String ml) throws SQLException{
        String sql = "Delete from LopHoc where msLop='" + ml +"'";
        cn.UpdateData(sql);
    }
}
