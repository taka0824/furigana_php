<?php
  $wdays = ["月","火","水","木","金"];
  var_dump($wdays[1]);
  $wdays[1] = "炎";
  var_dump($wdays);
  echo array_pop($wdays);
  // 末尾から一つ取り出す
  array_push($wdays, "土");
  // 配列の最後に追加する
  var_dump($wdays);
  $wdays[] = "日";
  var_dump($wdays);
  var_dump(array_reverse($wdays));
?>