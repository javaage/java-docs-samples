/**
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cisco.la;

import com.cisco.la.entity.LaUser;
import com.cisco.la.util.MyBatisUtil;
import com.google.common.base.Stopwatch;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.Reader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.cisco.la.dao.LaUserDao;
import com.cisco.la.dao.LaRlHistoryDao;
import com.cisco.la.entity.LaRlHistory;

// [START example]
@SuppressWarnings("serial")
@WebServlet(name = "userservice", value = "")
public class UserServlet extends HttpServlet {
	Connection conn;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){

//    try {
//
//      Class.forName("org.postgresql.Driver");
//      conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/la","postgres","19786028");
//    } catch (ClassNotFoundException e) {
//      e.getMessage();
//    } catch (SQLException e) {
//      e.getMessage();
//    } finally {
//      // Nothing really to do here.
//    }
//
//    String selectSql = "select hstr_usr_id, hstr_crs_id from la_crs_history";
//    try (ResultSet rs = conn.prepareStatement(selectSql).executeQuery()) {
//      while (rs.next()) {
//        String savedIp = rs.getString("hstr_usr_id");
//        int test = 0;
//      }
//    }catch (Exception e){
//      e.getMessage();
//    }


    try {
      PrintWriter out = resp.getWriter();
      resp.setContentType("text/plain");
      out.println("connecting to: ");

      Reader reader = new InputStreamReader(getServletContext().getResourceAsStream("/WEB-INF/classes/mybatis-config.xml"));
      //out.print(reader.read());
      //out.println("end");
      SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
      out.println("end1");
      SqlSessionFactory sqlSessionFactory = builder.build(reader);
      out.println("end2");
      SqlSession sqlSession = sqlSessionFactory.openSession();
      out.println("end3");
      LaRlHistoryDao laRlHistoryDao = sqlSession.getMapper(LaRlHistoryDao.class);
      out.println("end4");
      LaRlHistory laRlHistory = new LaRlHistory();
      laRlHistory.setHstrRlHistory("sys");
      laRlHistory.setHstrRlName("sys");
      laRlHistory.setHstrUpdateTime(new Date());
      laRlHistory.setHstrUsrId("sys");
      laRlHistoryDao.insertLaRlHistory(laRlHistory);
      out.println("end123");
      sqlSession.commit();
    } catch (IOException e1) {
      try{
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/plain");
        out.println(e1.getMessage());
      }catch (IOException e) {

      }
    }



//	  try {
//      PrintWriter out = resp.getWriter();
//      resp.setContentType("text/plain");
//      out.println("connecting to: ");
//
//      String path = Thread.currentThread().getContextClassLoader().getResource("/mybatis-config.xml").getPath();
//      out.println(path);
//      Reader reader = Resources.getResourceAsReader(path);
//      SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//      SqlSessionFactory sqlSessionFactory = builder.build(reader);
//      out.println("end");
//    } catch (IOException  exp){
//	    try {
//        PrintWriter out = resp.getWriter();
//        resp.setContentType("text/plain");
//        out.println(exp.getMessage());
//      }catch (IOException  e){
//
//      }
//    }

//    String path = MyBatisUtil.class.getResource("/mybatis-config.xml").toString();
//    System.out.println("path = " + path);
//    PrintWriter out = resp.getWriter();
//    resp.setContentType("text/plain");
//    out.println("connecting to: " + path);
//	  try {
//      MyBatisUtil.getSqlSessionFactory();
//      SqlSession sqlSession = MyBatisUtil.getSession();
//      LaUserDao laUserDao = sqlSession.getMapper(LaUserDao.class);
//      PrintWriter out = resp.getWriter();
//      resp.setContentType("text/plain");
//      out.println("connecting to: ");
//    }catch (Exception exp){
//
//    }
	}
}
