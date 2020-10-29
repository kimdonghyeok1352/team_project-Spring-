package co.soft.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import co.soft.beans.ContentBean;

public interface BoardMapper {
	
	@Select("select air_info_startingpoint , air_info_destination,air_info_departure,air_info_arrival,air_info_numberofpeople "
			+ "from air_info_table"
			+ "where air_info_departure = #{air_info_departure},air_info_arrival =#{air_info_arrival}")
	ContentBean main1(ContentBean cb);
	
}
