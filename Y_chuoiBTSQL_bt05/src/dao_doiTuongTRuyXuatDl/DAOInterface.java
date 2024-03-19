package dao_doiTuongTRuyXuatDl;

import java.util.ArrayList;
// giúp cho các class khác có thể overiding các phương thức
public interface DAOInterface<T>{
//<t> là genaric bài 66 ở java
	// định nghĩa ra phương thức
	public int insert(T t);
	public int update(T t);
	public int delete(T t);
	public ArrayList<T> selectAll();
	public T selectById(T t);
	public ArrayList<T> selectByCondition(String condition);
	

}
