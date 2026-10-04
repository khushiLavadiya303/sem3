<form action="" method="POST">
<input type="text" name="name">
<input type="text" name="dept">
<input type="text" name="marks">
<input type="submit" name="submit">
</form>
<?php
$x=mysqli_connect("localhost","root","","college");
if(!$x)
{
	exit();
}
if(isset($_POST['submit']))
{
	
	$name=$_POST['name'];
	$dept=$_POST['dept'];
	$marks=$_POST['marks'];
$y="insert into students(name,dept,marks) values ('$name','$dept','$marks')";
if(mysqli_query($x,$y))
{
	echo"inserted";
}
else
{
	echo"not inserted";
}
}
?>