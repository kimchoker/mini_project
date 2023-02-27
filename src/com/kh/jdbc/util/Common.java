package com.kh.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

// DB 연결과 해제 관련 메소드 작성
public class Common {
    final static String ORACLE_URL = "jdbc:oracle:@localhost:1521:xe";
    final static String ORACLE_ID = "SCOTT";
    final static String ORACLE_PW = "TIGER";
    final static String ORACLE_DRV = "oracle.jdbc.driver.OracleDriver";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(ORACLE_DRV); // 오라클 드라이버를 로딩
            conn = DriverManager.getConnection(ORACLE_URL, ORACLE_ID, ORACLE_PW);
            System.out.println("Connection succeed");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
