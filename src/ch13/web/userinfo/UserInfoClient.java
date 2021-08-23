package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");

		System.out.println(dbType);

		UserInfo userInfo = new UserInfo();
		
		userInfo.setUserId("4885");
		userInfo.setUserName("모네");
		userInfo.setPassword("!@#$%^^&");
		
		UserInfoDao userInfoDao = null;

		/*
		 * db.properties 파일의 DBTYPE=MYSQL or DBTYPE=ORACLE에 
		 * 따라 dao (data access object) replace 된다.
		 */
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		
		} else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		
		} else {
			System.out.println("db error");
			return;
		}

		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);

	}

}
