<?php
  function createMsg(){
    var_dump("ご注文を承りました。");
    var_dump("ありがとうございました。");
  }
  createMsg();

  function createMsg2($name){
    var_dump($name."様");
    var_dump("ご注文を承りました。");
    var_dump("ありがとうございました。");
  }

  createMsg2("三浦");
  createMsg2("高野");
?>