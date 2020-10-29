package co.soft.mapper;

import org.apache.ibatis.annotations.Insert;

import co.soft.beans.ContentBean;

public interface BoardMapper {
	
	void addContentInfo(ContentBean writeContentBean);
	
}
