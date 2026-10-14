<?php
$con=mysqli_connect("localhost","root","","college");
if(!$con)
{
    exit();
}
$id=$_GET['id'];
$qry="DELETE FROM students where id=$id " ;
if(mysqli_query($con,$qry))
{
    echo"Record deleted successfully";
    header("location: display.php");
}
else
{
    echo" error deleting record ";
}
?>