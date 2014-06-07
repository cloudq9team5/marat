<?php
$m = new MongoClient( 'mongodb://localhost:12345');
$db = $m->selectDB( 'tem');
echo '{ "msg": "OK so far"}';
?>