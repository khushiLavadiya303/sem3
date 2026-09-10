<form action="" method="POST">
<input type="text" name="name">
<input type="text" name="dept">
<input type="text" name="mob">
<input type="date" name="DOB">
<input type="submit" name="submit">
</form>
<?php
include("f1.php");
if(isset($_POST['submit']))
{
	
	$b=$_POST['name'];
	$c=$_POST['dept'];
	$d=$_POST['mob'];
	$e=$_POST['DOB'];
}
$y="insert into students(name,dept,mob,DOB) values ('$b','$c',$d,'$e')";
if(mysqli_query($x,$y))
{
	echo"inserted";
}
else
{
	echo"not inserted";
}
?>