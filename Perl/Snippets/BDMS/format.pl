#!/usr/bin/perl
format EMPLOYEE =
==================E M P  D E T A I L S============================================
*********************************************************************************
@<<<<<<<<<<<<<<<<<<<<<<< @<<
$name, $age
@#####.##
$salary
=============================================================
.

select(STDOUT);
$~ = EMPLOYEE;

@n = ("bhuvan", "panday", "kon");
@a = (20, 30, 40);
@s = (20000.00, 30000.00, 40000.00);

$i = 0;
foreach (@n){
$name = $n[$i];
$age = $a[$i];
$salary = $s[$i];
$i++;
write;

}
