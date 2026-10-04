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
}
else
{
    echo" error deleting record ";
}
?>