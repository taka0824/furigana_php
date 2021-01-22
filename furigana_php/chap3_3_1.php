<?php
  $wdays = ["月","火","水","木","金"];
  foreach($wdays as $wday){
    var_dump($wday."曜日");
  }

  foreach(range(0,9) as $cnt){
    var_dump("ハロー！");
  }
  var_dump(range(0,9));
  // 0スタート9終わりの数字が順に入った配列を作成できる
  // 要素数が10なのでforeach分に使用すると、配列の要素数分（10回）繰り返される

  foreach(range(0,9) as $cnt){
    var_dump($cnt."回目のハロー！");
  }
  // 要素の値をforeachの中で指定したas以下の変数で使用することができる。
?>