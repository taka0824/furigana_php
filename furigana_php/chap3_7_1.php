<?php
  $teams = ["A","B","C","D","E"];
  $opps = ["A","B","C","D","E"];
  foreach($teams as $x){
    array_shift($opps);
    // $x =　Aの時の処理を開始する際に、$oppsから先頭の値(A)を除く。
    // $x = B(foreach２週目)の際に、$oppsから先頭の値(B)を除く。
    // の繰り返しで重複した組み合わせが起こらないようにする
    foreach($opps as $y){
      if($x == $y){
        continue;
      }
      var_dump($x."vs".$y);
    }
  }
?>