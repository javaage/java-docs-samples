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
import com.cisco.la.mapper.RoleHistoryModelMapper;
import com.cisco.la.model.RoleHistoryModel;

// [START example]
@SuppressWarnings("serial")
@WebServlet(name = "user", value = "")
public class UserServlet extends HttpServlet {
	Connection conn;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
    try {
      PrintWriter out = resp.getWriter();
      resp.setContentType("text/plain");
      out.println("connecting to: ");

      Reader reader = new InputStreamReader(getServletContext().getResourceAsStream("/WEB-INF/classes/mybatis-config.xml"));
      SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
      SqlSessionFactory sqlSessionFactory = builder.build(reader);
      SqlSession sqlSession = sqlSessionFactory.openSession();

      RoleHistoryModelMapper laRlHistoryDao = sqlSession.getMapper(RoleHistoryModelMapper.class);
      out.println("end4");
      RoleHistoryModel roleHistoryModel = new RoleHistoryModel();
      roleHistoryModel.setRoleHistory("test2");
      roleHistoryModel.setRoleName("test2");
      roleHistoryModel.setUpdateTime(new Date());
      roleHistoryModel.setUserID("test2");

      laRlHistoryDao.insert(roleHistoryModel);
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
	}
}
