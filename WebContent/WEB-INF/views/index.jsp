<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<button>��</button><button>�պ�</button><br>
		<form action="booking" method="get">
		<select name="air_info_startingpoint">
			<option value="Incheon">��õ����</option>
			<option value="Kimhae">���ذ���</option>
			<option value="Narita">����Ÿ����</option>
			<option value="Kansai">ĭ���̰���</option>
			<option value="Sanghai">������Ǫ�ձ�������</option>
			<option value="Beijing">����¡����ΰ���</option>
		</select>
		<select name="air_info_destination">
			<option value="Incheon">��õ����</option>
			<option value="Kimhae">���ذ���</option>
			<option value="Narita">����Ÿ����</option>
			<option value="Kansai">ĭ���̰���</option>
			<option value="Sanghai">������Ǫ�ձ�������</option>
			<option value="Beijing">����¡����ΰ���</option>
		</select>
		<br>
		<input type="text" placeholder="��߳�¥"><input type="text" placeholder="������¥"><input type="text" placeholder="�ο���"><br>
		<button type="submit">�װ��� �˻��ϱ�</button>		
		</form>	
</body>
</html>