package ch06;

public interface IUserInfoDao {

	void insertUserInfo(UserInfo userInfo);

	void updateUserInfo(UserInfo userInfo);

	void deleteUserInfo(String userName);

	void selecteUserInfo(String userName);
}
