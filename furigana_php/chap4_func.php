<?php
  function createMsg($name, $price){
    // ヒアドキュメントを用いて長文を変数に代入する
   $msg = <<< EOM
     {$name}様
     ご注文を承りました。
     合計{$price}円です。
   EOM;
   echo $msg;
  }
  function getPrice($cnt){
    return 500 * $cnt;
  }
?>