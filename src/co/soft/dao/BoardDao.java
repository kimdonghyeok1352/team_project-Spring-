package co.soft.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.soft.beans.ContentBean;
import co.soft.mapper.BoardMapper;

@Repository
public class BoardDao {
	
	@Autowired
	private BoardMapper boardmapper;
	
	public ContentBean main(ContentBean cb) {
		return boardmapper.main1(cb);
	}
}
