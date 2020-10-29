<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<button>편도</button><button>왕복</button><br>
		<form action="booking" method="get">
		<select name="air_info_startingpoint">
			<option value="Incheon">인천공항</option>
			<option value="Kimhae">김해공항</option>
			<option value="Narita">나리타공항</option>
			<option value="Kansai">칸사이공항</option>
			<option value="Sanghai">상하이푸둥국제공항</option>
			<option value="Beijing">베이징서우두공항</option>
		</select>
		<select name="air_info_destination">
			<option value="Incheon">인천공항</option>
			<option value="Kimhae">김해공항</option>
			<option value="Narita">나리타공항</option>
			<option value="Kansai">칸사이공항</option>
			<option value="Sanghai">상하이푸둥국제공항</option>
			<option value="Beijing">베이징서우두공항</option>
		</select>
		<br>
		<input type="text" placeholder="출발날짜"><input type="text" placeholder="도착날짜"><input type="text" placeholder="인원수"><br>
		<button type="submit">항공권 검색하기</button>		
		</form>	
</body>
</html>