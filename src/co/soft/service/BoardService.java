package co.soft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.soft.beans.ContentBean;
import co.soft.dao.BoardDao;


@Service
public class BoardService {
	@Autowired
	private BoardDao dao;
	
	public ContentBean main1(ContentBean cb) {
		return dao.main(cb);
	}
}
