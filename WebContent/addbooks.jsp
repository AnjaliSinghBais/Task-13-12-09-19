
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>


<html>
<body>
	<form action="AddBookController">


		<table>
			<tr>
				<td>BOOK ID <input type="text" name="bookid"></td>
				<td>BOOK NAME<input type="text" name="bookname"></td>
				<td>BOOK SUBJECT <input type="text" name="booksubject"></td>
				<td>BOOK PRICE <input type="text" name="bookprice"></td>
				<td>BOOK AUTHOR<input type="text" name="bookauthor"></td>
			</tr>
		</table>



		<input type="submit" value="ADDBOOK">
	</form>
<body>
</html>