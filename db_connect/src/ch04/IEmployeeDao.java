package ch04;

import java.util.ArrayList;

public interface IEmployeeDao {

	
	void insert(EmployeeDTO dto);
	ArrayList<EmployeeDTO> select(int empNO);
	void select(String lastname);
	void update(String gender);
	void delete(int empNo);
	void delete(String lastName);
}
