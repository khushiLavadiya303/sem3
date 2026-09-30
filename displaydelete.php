<?php
include()
$id=$_GET['id'];
$qry=select*from info where id=$id";
$result=mysqli_query($x,$y);
$row=mysqli_fetch_assoc($result);
?>
<form method="post">
<input type="hidden" name="id" value="<?php echo $row['id'];?>">
name:
<input type="text" name="name" value="<?php echo $row['name'];?>">
<br> <br>
city:
<input type="text" name="city" value="<?php echo $row['city'];?>">
<br> <br>
<input type="submit" name="update" value="update record">
</form>
<?php
if(isset($_POST['update']))
{
    $id=$_POST['id'];
    $name=$_POST['name'];
    $city=$_POST['city'];
$qry="update info set name='$name',city='$city' where id='$id'";
if(mysqli_query($con,$qry))
{
    echo"record updated";
}
else
{
    echo" reccord not updated";
}
}
?>
