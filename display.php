<table border="1">
	<tr>
		<th>id</th>
		<th>name</th>
		<th>dept</th>
		<th>marks</th>
		<th>delete</th>
		<th>update</th>
	</tr>
<?php
$x=mysqli_connect("localhost","root","","college");
if(!$x)
{
	exit();
}
$y="select * from students";
$result=mysqli_query($x,$y);
if(mysqli_num_rows($result)>0)
{
	while($row=mysqli_fetch_assoc($result))
	{
		echo "<tr>";
		echo "<td>" . $row['id'] ." </td>";
		echo "<td>" . $row['name'] ." </td>";
		echo "<td>" . $row['dept'] ." </td>";
		echo "<td>" . $row['marks'] ." </td>";
	     echo"<td>";
        echo"<a href='delete.php?id=".$row['id']."'> delete</a>";
        echo"</td>";
        echo"<td>";
        echo"<a href='update.php?id=".$row['id']."'> update</a>";
        echo"</td>";
        echo"</tr>";
	}
}
echo "</table>";
?>		