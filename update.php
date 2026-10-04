<?php
$x=mysqli_connect("localhost","root","","college");
if(!$x)
{
    exit();
}
if(isset($_GET['id']))
{
$id=$_GET['id'];
$y="select *from students where id=$id";
$result=mysqli_query($x,$y);
$row=mysqli_fetch_assoc($result);
}
if(isset($_POST['update']))
{
    $id=$_POST['id'];
    $name=$_POST['name'];
    $dept=$_POST['dept'];
    $marks=$_POST['marks'];
$qry="UPDATE students set name='$name',dept='$dept',marks='$marks' where id='$id'";
if(mysqli_query($x,$qry))
{
    echo"record updated";
}
else
{
    echo" reccord not updated";
}
}
?>
<form method="POST">
<input type="hidden" name="id" value="<?php echo $row['id']; ?>">
name:
<input type="text" name="name" value="<?php echo $row['name']; ?>">
<br> <br>
city:
<input type="text" name="dept" value="<?php echo $row['dept']; ?>">
<br> <br>
marks:
<input type="text" name="marks" value="<?php echo $row['marks'];?>">

<input type="submit" name="update" value="update record">
</form>