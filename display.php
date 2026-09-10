<table border="2">
	<tr>
		<th>name</th>
		<th>dept</th>
		<th>mob</th>
		<th>DOB</th>
	</tr>
<?php
include("f1.php");
$y="select * from students";
$result=mysqli_query($x,$y);
if(mysqli_num_rows($result)>0)
	while($row=mysqli_fetch_assoc($result))
	{
		echo "<tr>";
		echo "<td>" . $row['name'] ." </td>";
		echo "<td>" . $row['dept'] ." </td>";
		echo "<td>" . $row['mob'] ." </td>";
		echo "<td>" . $row['DOB'] ." </td>";
	    echo "</tr>";
	}
echo "</table>";
?>		