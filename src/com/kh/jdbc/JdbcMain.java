package com.kh.jdbc;

import com.kh.jdbc.dao.EmpDAO;
import com.kh.jdbc.vo.EmpVo;

import java.util.List;
import java.util.Scanner;

public class JdbcMain {
    public static void main(String[] args) {
        menuSelect();
    }
    public static void menuSelect() {
        Scanner sc = new Scanner(System.in);
        EmpDAO dao = new EmpDAO();
        while (true) {
            System.out.println("========= EMP Table =========");
            System.out.println("[1] SELECT [2] INSERT [3] UPDATE [4] DELETE [5] EXIT ");
            System.out.print("메뉴를 선택하세요  : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1 :
                    List<EmpVo> list = dao.empSelect();
                    dao.empSelectPrn(list);
                    break;
                case 2 :
                    dao.empInsert();
                    break;
                case 3 :
                    dao.empDelete();
                    break;
                case 4 :
                case 5 :

            }
        }
    }
}
