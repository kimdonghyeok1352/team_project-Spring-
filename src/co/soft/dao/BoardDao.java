package co.soft.dao;

import org.springframework.beans.factory.annotation.Autowired;

import co.soft.beans.ContentBean;
import co.soft.mapper.BoardMapper;

public class BoardDao {
	
	@Autowired
	private BoardMapper boardMapper;
	
	public void addContentInfo(ContentBean writeContentBean ) {
		boardMapper.addContentInfo(writeContentBean);
	}
}
